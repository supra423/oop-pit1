package org.example.gui;

import javax.swing.*;
import java.awt.*;

public abstract class SuperPanel extends JPanel {
    public SuperPanel() {
        this.setBackground(Color.decode("#aaaaaa"));

    }

    JButton addButton() {
        JButton button = new JButton("Click Button");
        button.setPreferredSize(new Dimension(100, 100));
        button.setBackground(Color.decode("#777777"));
        return button;
    }

}
