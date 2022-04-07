package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CounterApp extends JFrame {
    private int value;
    public static void main(String[] args) {
        new CounterApp(0);
    }
    CounterApp(final int intialValue) {
        setTitle("Simple Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 500, 400, 400);
        setLocationRelativeTo(null);
        Font font = new Font("Arial", Font.BOLD, 42);
        value = intialValue;

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }

            });
        add(decrementButton, BorderLayout.WEST);
        JButton intcrementButton = new JButton(">");
        intcrementButton.setFont(font);
        intcrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(intcrementButton, BorderLayout.EAST);

        JButton intcrement10Button = new JButton(">>");
        intcrement10Button.setFont(font);
        intcrement10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value+= 10;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(intcrement10Button, BorderLayout.SOUTH);

        JButton resetButton = new JButton("Reset");
        resetButton.setFont(font);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(resetButton, BorderLayout.NORTH);

        setVisible(true);
            }
    private void setBounds(int i, int i1) {
        }
}
//конец
