package ru.mirea.pr.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class Game extends JFrame {
    JPanel[] panels;
    int resMilan, resMadrid;
    String winner;
    JLabel res, lastScore, win;

    {
        panels = new JPanel[6];
        resMilan = 0; resMadrid = 0;
        winner = "N/A";
        res = new JLabel("Results " + resMilan + " X " + resMadrid, SwingConstants.CENTER);
        res.setForeground(Color.WHITE);
        lastScore = new JLabel("Last score: N/A", SwingConstants.CENTER);
        win = new JLabel(winner.toString(), SwingConstants.CENTER);
        win.setForeground(Color.WHITE);
    }   //блок инициализатора

    public Game() {
        setSize(400, 600);
        setLayout(new GridLayout(3, 2));
        setTitle("Матч Милана и Мадрида");
        try {
            URL im = new URL("https://www.eden-tour.ru/wp-content/uploads/2017/11/1-55.jpg");
            Image image = new ImageIcon(im).getImage();
            setIconImage(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());
            add(panels[i]);
        }   //инициализация панелей

        JButton butMil = new JButton("AC Milan");
        panels[0].add(butMil, BorderLayout.CENTER);

        JButton butMad = new JButton("Real Madrid");
        panels[1].add(butMad, BorderLayout.CENTER);

        panels[2].add(res, BorderLayout.CENTER);
        panels[2].setBackground(Color.BLACK);

        panels[3].add(lastScore, BorderLayout.CENTER);
        panels[3].setBackground(Color.YELLOW);

        JLabel winner1 = new JLabel("Winner", SwingConstants.CENTER);
        winner1.setForeground(Color.BLACK);
        panels[4].add(winner1, BorderLayout.CENTER);
        panels[4].setBackground(Color.WHITE);

        panels[5].add(win, BorderLayout.CENTER);
        panels[5].setBackground(Color.BLUE);


        butMil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resMilan++;
                setRes();
                setLS("AC Milan");
                calcWin();
            }
        });

        butMad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resMadrid++;
                setRes();
                setLS("Real Madrid");
                calcWin();
            }
        });
    }

    public void setRes() {
        res.setText("Results " + resMilan + " X " + resMadrid);
        panels[2].remove(res);
        panels[2].add(res, BorderLayout.CENTER);
    }

    public void setLS(String command) {
        lastScore.setText("Last score: " + command);
        panels[3].remove(lastScore);
        panels[3].add(lastScore, BorderLayout.CENTER);
    }

    public void calcWin() {
        if (resMadrid > resMilan) winner = "Real Madrid";
        else winner = "AC Milan";
        win.setText(winner);
        panels[5].remove(win);
        panels[5].add(win, BorderLayout.CENTER);
    }

}