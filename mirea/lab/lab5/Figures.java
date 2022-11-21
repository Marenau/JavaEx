package ru.mirea.lab.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class Figures extends JFrame {
    JPanel panel;
    Shapes sh;

    public Figures() {
        setTitle("Figures");
        try {
            URL url = new URL("https://raskraski-kids.ru/wp-content/uploads/2021/10/т-2.jpg");
            Image img = new ImageIcon(url).getImage();
            setIconImage(img);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        sh = new Shapes();
        panel.add(sh);
        setContentPane(panel);

        setJMenuBar(generateMenu());

        setSize(1000, 1000);
        setVisible(true);
    }

    private JMenuBar generateMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem redraw = new JMenuItem("Redraw");
        menu.add(redraw);
        menuBar.add(menu);

        redraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sh = new Shapes();
                panel.removeAll();
                panel.add(sh);
                remove(panel);
                setContentPane(panel);
            }
        });

        return menuBar;
    };
}