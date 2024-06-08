package Refactor.PlanGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RefactorCard extends JPanel {
    private static final Color BORDER_COLOR = Color.BLUE;
    private static final Color BACKGROUND_COLOR = Color.PINK;
    private static final int BORDER_THICKNESS = 6;
    private static final int SCALE = 34;            // card size factor
    private static final int HEIGHT = 3 * SCALE;    // 3x5
    private static final int WIDTH = 5 * SCALE;
    private static final int ROLLOVER = 12; // New cards go in different positions
    private static final int OFFSET = SCALE; // How far apart to put new cards

    private static int cardCount = 0;

    private JTextField title;
    private JTextArea body;
    private JLabel costLabel;
    private int cost;

    public RefactorCard() {
        this("(Untitled)", "");
    }

    public RefactorCard(Card from) {
        this(from.title.getText(), from.body.getText());
    }

    private RefactorCard(String titleText, String bodyText) {
        setDefaults();
        createUI(titleText, bodyText);
        setupLocationAndSize();
        enableMouseEvents();
    }

    private void setDefaults() {
        setBorder(BorderFactory.createLineBorder(BORDER_COLOR, BORDER_THICKNESS));
        cardCount++;
        setLayout(new BorderLayout());
    }

    private void createUI(String titleText, String bodyText) {
        JPanel top = new JPanel(new BorderLayout());
        title = createTitleTextField(titleText);
        top.add(title, BorderLayout.CENTER);

        costLabel = new JLabel(" ? ");
        cost = 0;
        top.add(costLabel, BorderLayout.EAST);
        add(top, BorderLayout.NORTH);

        body = createBodyTextArea(bodyText);
        add(body, BorderLayout.CENTER);
    }

    private JTextField createTitleTextField(String titleText) {
        JTextField textField = new JTextField(titleText);
        textField.setBackground(BACKGROUND_COLOR);
        textField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                moveToFront();
            }
        });
        return textField;
    }

    private JTextArea createBodyTextArea(String bodyText) {
        JTextArea textArea = new JTextArea(bodyText);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(BACKGROUND_COLOR);
        textArea.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                moveToFront();
            }
        });
        return textArea;
    }

    private void setupLocationAndSize() {
        setLocation((cardCount % ROLLOVER) * OFFSET, (cardCount % ROLLOVER) * OFFSET);
        setSize(WIDTH, HEIGHT);
    }

    private void enableMouseEvents() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
    }

    private void moveToFront() {
        JLayeredPane background = (JLayeredPane) this.getParent();
        background.moveToFront(this);
    }

    private int lastX, lastY;

    @Override
    public void processMouseEvent(MouseEvent e) {
        if (e.getID() == MouseEvent.MOUSE_PRESSED) {
            lastX = e.getX();
            lastY = e.getY();
            moveToFront();
        } else {
            super.processMouseEvent(e);
        }
    }

    @Override
    public void processMouseMotionEvent(MouseEvent e) {
        if (e.getID() == MouseEvent.MOUSE_DRAGGED) {
            Point here = getLocation();
            setLocation((int) (here.getX() + e.getX() - lastX), (int) (here.getY() + e.getY() - lastY));
        } else {
            super.processMouseMotionEvent(e);
        }
    }

    public void rotateCost() {
        String label = costLabel.getText();
        switch (label) {
            case " ? ":
                costLabel.setText(" 1 ");
                cost = 1;
                break;
            case " 1 ":
                costLabel.setText(" 2 ");
                cost = 2;
                break;
            case " 2 ":
                costLabel.setText(" 3 ");
                cost = 3;
                break;
            case " 3 ":
                costLabel.setText(" >3 ");
                cost = 0;
                break;
            case " >3 ":
            default:
                costLabel.setText(" ? ");
                cost = 0;
                break;
        }
    }

    public int getCost() {
        return cost;
    }

    public String getTitle() {
        return title.getText();
    }

    public boolean needsSplit() {
        return costLabel.getText().equals(" >3 ");
    }

    public boolean needsEstimate() {
        return costLabel.getText().equals(" ? ");
    }
}

