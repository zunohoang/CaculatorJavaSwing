package org.example;

import javax.swing.*;

public class demoSwing {
    private JPanel mainPanel;
    private JTextField screenText;
    private JButton a0Button;
    private JButton a3Button;
    private JButton a7Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton button11;
    private JButton button12;
    private JButton xButton;
    private JButton button14;
    private JButton button15;
    private JButton buttonOut;

    private int valueAtTime = 1;

    private String caculatorString = "=";
    public JPanel getMainPanel() {
        return mainPanel;
    }
    public void clickButton(String valueClick){
        switch (valueClick){
            case "=" :
                screenText.setText(Integer.toString(valueAtTime));
                valueAtTime = 0;
                caculatorString = "+";
                break;
            case "+" : case "-" : case "x" : case "/" :
                caculatorString = valueClick;
                screenText.setText(valueClick);
                break;
            case "1" : case "2" : case "3" : case "4" : case "5" : case "6" : case "7" : case "8" : case "9" : case "0" :
                screenText.setText(valueClick);
                switch (caculatorString){
                    case "+":
                        valueAtTime += Integer.parseInt(valueClick);
                        break;
                    case "-":
                        valueAtTime -= Integer.parseInt(valueClick);
                        break;
                    case "x":
                        valueAtTime *= Integer.parseInt(valueClick);
                        break;
                    case "/":
                        valueAtTime /= Integer.parseInt(valueClick);
                        break;
                }
                break;
        }
    }
    public demoSwing() {
        a0Button.addActionListener(e -> {
            clickButton("0");
        });
        a1Button.addActionListener(e -> {
            clickButton("1");
        });
        a2Button.addActionListener(e -> {
            clickButton("2");
        });
        a3Button.addActionListener(e -> {
            clickButton("3");
        });
        a4Button.addActionListener(e -> {
            clickButton("4");
        });
        a5Button.addActionListener(e -> {
            clickButton("5");
        });
        a6Button.addActionListener(e -> {
            clickButton("6");
        });
        a7Button.addActionListener(e -> {
            clickButton("7");
        });
        a8Button.addActionListener(e -> {
            clickButton("8");
        });
        a9Button.addActionListener(e -> {
            clickButton("9");
        });
        button11.addActionListener(e -> {
            clickButton("=");
        });
        button12.addActionListener(e -> {
            clickButton("-");
        });
        xButton.addActionListener(e -> {
            clickButton("x");
        });
        button14.addActionListener(e -> {
            clickButton("/");
        });
        button15.addActionListener(e -> {
            clickButton("+");
        });
    }
}
