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

        // the dimensions seem a bit arbitrary but this is like the minimum size required so that
        // the panels don't disappear when window is resized by preventing it from getting resized
        // even smaller
        this.setMinimumSize(new Dimension(1302, 1029));

        MainPanel mainPanel = new MainPanel();

        this.add(mainPanel);

        this.pack();
    }
}
