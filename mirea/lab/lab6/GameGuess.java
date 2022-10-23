package ru.mirea.lab.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class GameGuess extends JFrame {
    JPanel[] panels;
    JLabel text;
    JTextField jtf;
    JButton guess;
    int randNumber, countOfAttempt;

    {
        panels = new JPanel[3];
        text = new JLabel("Попробуйте угадать число от 0 до 20:", SwingConstants.CENTER);
        Font fnt = new Font("Times new Roman", Font.PLAIN, 20);
        Font textFont = new Font("Times new Roman", Font.PLAIN, 50);
        text.setFont(fnt);
        jtf = new JTextField(SwingConstants.CENTER);
        jtf.setFont(textFont);
        jtf.setForeground(Color.BLACK);
        guess = new JButton("Угадали?");
        guess.setFont(fnt);
        randNumber = (int) (Math.random() * 21);
        countOfAttempt = 0;
    }

    public GameGuess() {
        setTitle("Угадайка!");
        URL url = null;
        try {
            url = new URL("https://tikstar-user-images.oss-cn-hongkong.aliyuncs.com/8325_6808439125467071493.jpg");
            Image img = new ImageIcon(url).getImage();
            setIconImage(img);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        setLayout(new GridLayout(3, 1));

        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());
            add(panels[i]);
        }

        panels[0].add(text, BorderLayout.CENTER);
        panels[1].add(jtf, BorderLayout.CENTER);
        panels[2].add(guess, BorderLayout.CENTER);

        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String readString = jtf.getText();
                int readNumber = Integer.parseInt(readString);
                int substract = readNumber - randNumber;
                if ((substract == 0) & (countOfAttempt <= 3)) {
                    text.setText("Вы угадали! Поздравляем!");
                    jtf.setForeground(Color.GREEN);
                    panels[2].removeAll();
                    JLabel res = new JLabel("Подпишись на канал и поставь лайк! ;)", SwingConstants.CENTER);
                    Font fnt = new Font("Times new Roman", Font.PLAIN, 20);
                    res.setFont(fnt);
                    panels[2].add(res);
                }
                else if ( (substract > 0) && (countOfAttempt < 3)) {
                    countOfAttempt++;
                    text.setText("<html>Вы не угадали! Это число меньше. Попробуйте снова! <p/>Попыток - " + (3 - countOfAttempt) + "</html>");
                    jtf.setForeground(Color.RED);
                } else if ((substract < 0) && (countOfAttempt < 3)){
                    countOfAttempt++;
                    text.setText("<html>Вы не угадали! Это число больше. Попробуйте снова! <p/>Попыток - " + (3 - countOfAttempt) + "</html>");
                    jtf.setForeground(Color.RED);
                } else if (countOfAttempt == 3) {
                    text.setText("Вы не угадали! Это провал. Было задуманно - " + randNumber);
                    countOfAttempt++;
                } else {
                    text.setText("Даже не пытайтесь. У вас было 3 попытки...");
                }
                panels[0].remove(text);
                panels[0].add(text);
            }
        });

        setSize(500, 400);
    }
}