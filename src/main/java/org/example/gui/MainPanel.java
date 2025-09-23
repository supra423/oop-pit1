package org.example.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends SuperPanel {
    public MainPanel() {
        this.setLayout(new BorderLayout());

        LogoPanel logoPanel = new LogoPanel();
        this.add(logoPanel, BorderLayout.NORTH);

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());

        TextAreaPanel textAreaPanel = new TextAreaPanel();
        middlePanel.add(textAreaPanel, BorderLayout.WEST);

        ProductPanel productPanel = new ProductPanel();
        middlePanel.add(productPanel, BorderLayout.EAST);

        this.add(middlePanel, BorderLayout.CENTER);

        BottomPanel bottomPanel = new BottomPanel();

        this.add(bottomPanel, BorderLayout.SOUTH);
    }
}
