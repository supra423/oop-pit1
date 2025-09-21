package org.example.gui;

import javax.swing.*;
import java.awt.*;

public class PaymentPanel extends SuperPanel {

    private static JTextArea orderList = new JTextArea(35, 30);
    public PaymentPanel() {

        this.setLayout(new GridBagLayout());
        this.setBackground(Color.decode("#888888"));
        this.setPreferredSize(new Dimension(400, 1000));

        GridBagConstraints gbc = new GridBagConstraints();

        orderList.setBackground(Color.decode("#999999"));
        orderList.setFont(new Font("Arial", Font.PLAIN, 16));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        this.add(orderList, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(addButton(), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(addButton(), gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(addButton(), gbc);
    }

    @Override
    JButton addButton() {
        JButton button = new JButton("Click Button");
        button.setPreferredSize(new Dimension(300, 100));
        button.setBackground(Color.decode("#777777"));
        return button;
    }

    public JTextArea getOrderList() {
        return orderList;
    }
}