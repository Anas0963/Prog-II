package Ü1;

import javax.swing.*;
import java.awt.*;

public class aufgabe1 extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getSize().width;
            int height = getSize().height;

            // Linie von links oben nach rechts unten
            g.drawLine(0, 0, width, height);

            // Linie von rechts oben nach links unten
            g.drawLine(width, 0, 0, height);
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Linien Zeichnen");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new aufgabe1());
            frame.setVisible(true);
        }
    }
