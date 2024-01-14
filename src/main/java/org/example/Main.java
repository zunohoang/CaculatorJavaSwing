package org.example;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        demoSwing demo = new demoSwing();
        JFrame frame = new JFrame("demoSwing");
        frame.setContentPane(demo.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}