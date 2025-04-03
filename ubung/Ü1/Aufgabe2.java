package Ü1;

import javax.swing.*;
import java.awt.*;

public class Aufgabe2 extends JComponent {
    private final int m;
    private final int n;

    public Aufgabe2(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getSize().width;
        int height = getSize().height;

        int rectWidth = (width - (m + 1) * 2) / m;
        int rectHeight = (height - (n + 1) * 2) / n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = 2 + j * (rectWidth + 2);
                int y = 2 + i * (rectHeight + 2);
                g.fillRect(x, y, rectWidth, rectHeight);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rechtecke Zeichnen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Aufgabe2(5, 5));
        frame.setVisible(true);
    }
}
