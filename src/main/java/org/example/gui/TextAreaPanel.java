package org.example.gui;

import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends SuperPanel {

    private static JTextArea orderTextArea = new JTextArea(30, 25);
    public TextAreaPanel() {

        this.setLayout(new GridBagLayout());
        this.setBackground(Color.decode("#888888"));
        this.setPreferredSize(new Dimension(400, 1000));

        GridBagConstraints gbc = new GridBagConstraints();

        orderTextArea.setBackground(Color.decode("#999999"));
        orderTextArea.setFont(new Font("Arial", Font.PLAIN, 16));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        JScrollPane scrollPane = new JScrollPane(orderTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(scrollPane, gbc);

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

    static public JTextArea getOrderTextArea() {
        return orderTextArea;
    }
}