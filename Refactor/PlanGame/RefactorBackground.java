package Refactor.PlanGame;

import java.awt.*;
import javax.swing.*;

public class RefactorBackground extends JLayeredPane {
    private static final Color BACKGROUND_COLOR = Color.YELLOW;
    private static final Color LINE_COLOR = Color.ORANGE;
    private final int lineDistance;

    public RefactorBackground(int width, int height, int lineDistance) {
        setPreferredSize(new Dimension(width, height));
        this.lineDistance = lineDistance;

        setOpaque(true);
        setBackground(BACKGROUND_COLOR);
        setForeground(LINE_COLOR);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int height = getHeight();
        int width = getWidth();

        g2d.setColor(getForeground());
        for (int i = 0; i < width; i += lineDistance) {
            g2d.drawLine(i, 0, i, height);
        }
    }
}

