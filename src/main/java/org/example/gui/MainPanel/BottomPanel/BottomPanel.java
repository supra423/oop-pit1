package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {
    public BottomPanel() {
        this.setPreferredSize(new Dimension(1300, 400));
        this.setBackground(Color.decode("#9EC3DD"));
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        CashFieldPanel cashFieldPanel = new CashFieldPanel();
        ButtonPanel buttonPanel = new ButtonPanel();
        TextAreaPanel textAreaPanel = new TextAreaPanel();

        gbc.gridx = 0;
        this.add(textAreaPanel, gbc);
        gbc.gridx = 1;
        this.add(cashFieldPanel, gbc);
        gbc.gridx = 2;
        this.add(buttonPanel, gbc);
    }
}
