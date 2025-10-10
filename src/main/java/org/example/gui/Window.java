package org.example.gui;

import org.example.gui.MainPanel.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Window extends JFrame {
    public Window() {
        this.setTitle("Smart Phone Store");

        ImageIcon logo = new ImageIcon(Objects.requireNonNull(Window.class.getResource("/assets/logoEdited.png")));
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainPanel mainPanel = new MainPanel();
        JScrollPane scrollPane = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(20);

        this.add(scrollPane);
        this.pack();
    }
}
