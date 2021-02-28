package lesson8GUI;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultButtonListener implements ActionListener {
    private final JTextField inputField;
    private final float aNumber;
    private float bNumber;
    private String operation;
    private float result;

    public ResultButtonListener(JTextField inputField, float aNumber, String operation) {
        this.inputField = inputField;
        this.aNumber = aNumber;
        this.operation = operation;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        bNumber = Float.parseFloat(inputField.getText());
        System.out.println("b = " + bNumber + " \n operation " + operation);
        switch (operation) {
            case "+":
                result = aNumber + bNumber;
                break;
            case "-":
                result = aNumber - bNumber;
                break;

            case "/":
                result = aNumber / bNumber;
                break;
            case "*":
                result = aNumber * bNumber;
                break;
        }
        inputField.setText(Float.toString(result));
    }
}
