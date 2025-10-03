package org.example.gui;

import org.example.gui.MainPanel.MainPanel;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        this.setTitle("Smart Phone Store");
        this.setLayout(new GridBagLayout());

        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        GridBagConstraints gbc = new GridBagConstraints();

        MainPanel mainPanel = new MainPanel();
        JScrollPane scrollPane = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(20);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        this.add(scrollPane, gbc);

        this.pack();
    }
}
