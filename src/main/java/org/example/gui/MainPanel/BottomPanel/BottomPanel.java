package org.example.gui.MainPanel.BottomPanel;

import org.example.gui.SuperPanel;

import java.awt.*;

public class BottomPanel extends SuperPanel {
    public BottomPanel() {
        this.setPreferredSize(new Dimension(1300, 200));
        this.setLayout(new GridLayout());

        FieldPanel fieldPanel = new FieldPanel();
        ButtonPanel buttonPanel = new ButtonPanel();

        this.add(fieldPanel);
        this.add(buttonPanel);
    }
}
