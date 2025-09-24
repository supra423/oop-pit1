package org.example.gui.MainPanel.BottomPanel;

import org.example.gui.SuperPanel;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends SuperPanel {
    public ButtonPanel() {
        this.setLayout(new GridLayout());
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.decode("#ff0000"));
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.decode("#00ff00"));

        this.add(panel1);
        this.add(panel2);
    }
}
