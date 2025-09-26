package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {
    public BottomPanel() {
        this.setPreferredSize(new Dimension(1300, 200));
        this.setBackground(Color.decode("#9EC3DD"));
        this.setLayout(new GridLayout());

        CashFieldPanel cashFieldPanel = new CashFieldPanel();
        ButtonPanel buttonPanel = new ButtonPanel();

        this.add(cashFieldPanel);
        this.add(buttonPanel);
    }
}
