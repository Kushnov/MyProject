package Homework_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public void init() {
        setVisible(true);
        setTitle("Test Window");
        setSize(500, 500);
        setLocation(650, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton button1 = new JButton("Выход");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(button1);

        JButton button2 = new JButton("Кнопка 2");
        panel.add(button2);
        add(panel, BorderLayout.SOUTH);
    }
}
