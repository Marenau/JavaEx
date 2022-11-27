package ru.mirea.lab.lab5;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 20; i++) {
            int choise = (int) (Math.random() * 7);
            g2.setPaint(randColor());
            if (choise == 0)
                g2.fillRect(rand(800, 50), rand(800, 50), rand(100, 50), rand(100, 50));
            else if (choise == 1)
                g2.fillOval(rand(800, 50), rand(800, 50), rand(100, 50), rand(100, 50));
            else if (choise == 2)
                g2.fillRoundRect(rand(800, 50), rand(800, 50),
                        rand(100, 50), rand(100, 50),
                        rand(100, 50), rand(100, 50));
            else if (choise == 3) {
                int j = rand(100, 50);
                g2.fillOval(rand(800, 50), rand(800, 50), j, j);
            }
            else if (choise == 4) {
                int k = rand(100, 50);
                g2.fillRect(rand(800, 50), rand(800, 50), k, k);
            }
            else if (choise == 5){
                int rand1 = rand(700, 50);
                int rand2 = rand(700, 50);
                int rand3 = rand(70, 20);
                int x[] = {rand1, rand1 + rand3, rand1 + rand3 * 2};
                int y[] = {rand2, rand2 - rand3, rand2};
                g2.fillPolygon(x, y, 3);
            }
            else {
                int rand1 = rand(700, 50);
                int rand2 = rand(700, 50);
                int rand3 = rand(70, 20);
                int x[] = {rand1, rand1 + rand3, rand1 + rand3 * 2, rand1 + rand3};
                int y[] = {rand2, rand2 - rand3, rand2, rand2 + rand3};
                g2.fillPolygon(x, y, 4);
            }
        }
    }

    protected Color randColor() {
        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        return new Color(r, g, b);
    }
    protected int rand(int max, int min) { return (int) (Math.random() * max) + min; }
}