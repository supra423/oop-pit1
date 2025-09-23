package org.example.gui;

import java.awt.*;

public class MainPanel extends SuperPanel {
    public MainPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        TextAreaPanel paymentPanel = new TextAreaPanel();
        this.add(paymentPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        ProductPanel productPanel = new ProductPanel();
        this.add(productPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        BottomPanel bottomPanel = new BottomPanel();
        this.add(bottomPanel, gbc);
    }
}
