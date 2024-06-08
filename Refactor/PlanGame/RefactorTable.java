package Refactor.PlanGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RefactorTable extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Table::new);
    }

    private JComponent body;
    private Card selection;
    private JLabel summary;
    private static final int INITIAL_VELOCITY = 1;
    private static final int MAX_VELOCITY = 10;
    private int velocity = INITIAL_VELOCITY;
    private static final int BUDGET = 4;

    public RefactorTable() {
        super("Planning Game Simulation");
        initializeUI();
        setupEventListeners();
    }

    private void initializeUI() {
        JComponent buttons = makeButtons();
        this.getContentPane().add(buttons, BorderLayout.WEST);

        body = new Background(1000, 1000, 190);
        JScrollPane scroll = new JScrollPane(body);
        scroll.setPreferredSize(new Dimension(100, 100));
        this.getContentPane().add(scroll, BorderLayout.CENTER);

        summary = new JLabel("", SwingConstants.CENTER);
        updateCost();
        this.getContentPane().add(summary, BorderLayout.SOUTH);

        this.pack();
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private JComponent makeButtons() {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        addCustomerButtons(panel);
        panel.add(new JLabel(" "));
        addProgrammerButtons(panel);

        JPanel outer = new JPanel(new BorderLayout());
        outer.add(panel, BorderLayout.NORTH);
        outer.add(new JLabel(""), BorderLayout.CENTER);
        return outer;
    }

    private void addCustomerButtons(JPanel panel) {
        panel.add(new JLabel("Customer"));
        addButton(panel, "New", e -> addNewCard());
        addButton(panel, "Split", e -> splitCard());
        addButton(panel, "Delete", e -> deleteCard());
        addButton(panel, "Plan", e -> plan());
    }

    private void addProgrammerButtons(JPanel panel) {
        panel.add(new JLabel("Programmer"));
        addButton(panel, "Cost", e -> rotateCost());
        addButton(panel, "Velocity", e -> updateVelocity());
    }

    private void addButton(JPanel panel, String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        panel.add(button);
    }

    private void setupEventListeners() {
        body.addContainerListener(new ContainerAdapter() {
            public void componentAdded(ContainerEvent e) {
                resetSelection();
            }

            public void componentRemoved(ContainerEvent e) {
                resetSelection();
            }

            private void resetSelection() {
                if (selection != null) {
                    selection.setBorder(BorderFactory.createLineBorder(Color.blue, 6));
                }

                if (body.getComponentCount() == 0) {
                    selection = null;
                } else {
                    selection = (Card) body.getComponent(0);
                    selection.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                }
            }
        });
    }

    private void addNewCard() {
        Card card = new Card();
        body.add(card, 0);
        selection = card;
        updateCost();
        repaint();
    }

    private void splitCard() {
        if (selection == null) return;
        Card card = new Card(selection);
        body.add(card, 0);
        selection = card;
        updateCost();
        body.repaint();
    }

    private void deleteCard() {
        if (body.getComponentCount() == 0) return;
        body.remove(0);
        selection = (body.getComponentCount() == 0) ? null : (Card) body.getComponent(0);
        updateCost();
        body.repaint();
    }

    private void plan() {
        StringBuilder report = new StringBuilder();
        for (Component comp : body.getComponents()) {
            RefactorCard card = (RefactorCard) comp;
            if (card.needsEstimate()) {
                report.append("Needs estimate: ").append(card.getTitle()).append("\n");
            } else if (card.needsSplit()) {
                report.append("Needs to be split: ").append(card.getTitle()).append("\n");
            }
        }

        if (report.length() == 0) {
            JOptionPane.showMessageDialog(body, "Plan OK; no cards need estimates or splitting",
                    "Issues in plan", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(body, report.toString(),
                    "Issues in plan", JOptionPane.OK_OPTION);
        }
    }

    private void rotateCost() {
        if (selection != null) {
            selection.rotateCost();
            updateCost();
        }
    }

    private void updateVelocity() {
        velocity = (velocity % (MAX_VELOCITY - 1)) + 1;
        updateCost();
    }

    private void updateCost() {
        summary.setText(getSummary());
    }

    private String getSummary() {
        int totalCost = getTotalCost();
        int iterations = (totalCost + velocity - 1) / velocity;
        return String.format("Est. Velocity (points/iteration): %d.   Total cost (points): %d.   " +
                        "#Cards: %d.   Est. #iterations: %d.",
                velocity, totalCost, body.getComponentCount(), iterations);
    }

    private int getTotalCost() {
        int total = 0;
        for (Component comp : body.getComponents()) {
            RefactorCard card = (RefactorCard) comp;
            total += card.getCost();
        }
        return total;
    }
}
