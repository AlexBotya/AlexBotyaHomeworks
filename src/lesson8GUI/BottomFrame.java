package lesson8GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame {
    private final JPanel panel;
    private String operation;
    float aNumber;
    float bNumber;
    float cResult;


    public BottomFrame(JTextField inputField) {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(6, 3));
        DigitButtonListener buttonListener = new DigitButtonListener(inputField);
        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            panel.add(btn);
        }
        JButton punto = new JButton(".");
        punto.addActionListener(buttonListener);
        panel.add(punto);

        JButton multiplcation = new JButton("*");
        multiplcation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aNumber = Float.parseFloat(inputField.getText());
                inputField.setText("");
                operation = (((JButton) e.getSource()).getText());
                System.out.println("operation check: " + operation);
            }
        });
        panel.add(multiplcation);


        JButton dividing = new JButton("/");
        dividing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aNumber = Float.parseFloat(inputField.getText());
                inputField.setText("");
                operation = (((JButton) e.getSource()).getText());
                System.out.println("operation check: " + operation);
            }
        });
        panel.add(dividing);


        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        panel.add(clear);

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aNumber = Float.parseFloat(inputField.getText());
                inputField.setText("");
                operation = (((JButton) e.getSource()).getText());
                System.out.println("operation check: " + operation);
            }
        });
        panel.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aNumber = Float.parseFloat(inputField.getText());
                inputField.setText("");
                operation = (((JButton) e.getSource()).getText());
                System.out.println("operation check: " + operation);
            }
        });
        panel.add(minus);

        JButton sqrt = new JButton("SQRT");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aNumber = Float.parseFloat(inputField.getText());
                cResult = (float) Math.sqrt(aNumber);
                inputField.setText(Float.toString(cResult));
            }
        });
        panel.add(sqrt);

        JButton result = new JButton("=");
        //ResultButtonListener resultButtonListener = new ResultButtonListener(inputField, aNumber, operation);
        //result.addActionListener(resultButtonListener);
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    bNumber = Float.parseFloat(inputField.getText());
                    System.out.println("b = " + bNumber + " \n operation " + operation);
                    switch (operation) {
                        case "+":
                            cResult = aNumber + bNumber;
                            break;
                        case "-":
                            cResult = aNumber - bNumber;
                            break;

                        case "/":
                            cResult = aNumber / bNumber;
                            break;
                        case "*":
                            cResult = aNumber * bNumber;
                            break;
                    }
                    inputField.setText(Float.toString(cResult));
            }
        });
        panel.add(result);
    }

    public JPanel getPanel() {
        return panel;
    }
}





