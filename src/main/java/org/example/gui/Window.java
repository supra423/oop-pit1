package org.example.gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        this.setTitle("Smart Phone Store");
        this.setLayout(new GridBagLayout());

        this.getContentPane().setBackground(Color.decode("#555555"));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        // the dimensions seem a bit arbitrary but this is like the minimum size required so that
        // the panels don't disappear when window is resized by preventing it from getting resized
        // even smaller
        this.setMinimumSize(new Dimension(1302, 1029));

        MainPanel mainPanel = new MainPanel();
        mainPanel.setLayout(new GridBagLayout());


        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        TextAreaPanel paymentPanel = new TextAreaPanel();
        mainPanel.add(paymentPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        ProductPanel productPanel = new ProductPanel();
        mainPanel.add(productPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        BottomPanel bottomPanel = new BottomPanel();
        mainPanel.add(bottomPanel, gbc);

        this.add(mainPanel);

        this.pack();
    }
}
