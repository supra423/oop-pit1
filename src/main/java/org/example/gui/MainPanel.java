package org.example.gui;

import org.example.Inventory;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends SuperPanel {
    private static final int NUMBER_OF_BUTTONS = 9;
    public MainPanel() {
        this.setLayout(new GridLayout(3, 3));
        this.setBackground(Color.decode("#333333"));
        this.setPreferredSize(new Dimension(900, 1000));

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {
            this.add(addButton(Inventory.inventory[i].getName()));
        }
    }

    JButton addButton(String itemName) {
        JButton button = new JButton(itemName);
        button.setPreferredSize(new Dimension(100, 100));
        button.setBackground(Color.decode("#777777"));
        return button;
    }
}
