package org.example.gui.MainPanel.BottomPanel;

import org.example.gui.SuperPanel;

import javax.swing.*;
import java.awt.*;

public class CashFieldPanel extends SuperPanel {
    public CashFieldPanel() {
        this.setLayout(new GridLayout());
        JPanel panel1 = new JPanel(new GridBagLayout());

        JPanel totalPanel = new JPanel();
        totalPanel.setBackground(Color.decode("#aaaaaa"));
        totalPanel.setPreferredSize(new Dimension(300, 180));
        panel1.add(totalPanel);

        JPanel panel2 = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JPanel cashPanel = new JPanel();
        JPanel changePanel = new JPanel();
        cashPanel.setBackground(Color.decode("#aaaaaa"));
        cashPanel.setPreferredSize(new Dimension(300, 85));
        changePanel.setBackground(Color.decode("#aaaaaa"));
        changePanel.setPreferredSize(new Dimension(300, 85));

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridy = 0;
        panel2.add(cashPanel, gbc);
        gbc.gridy = 1;
        panel2.add(changePanel, gbc);

        this.add(panel1);
        this.add(panel2);
    }
}