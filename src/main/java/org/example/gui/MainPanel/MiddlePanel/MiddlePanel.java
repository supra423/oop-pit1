package org.example.gui.MainPanel.MiddlePanel;

import org.example.gui.SuperPanel;

import java.awt.*;

public class MiddlePanel extends SuperPanel {
    public MiddlePanel() {
        this.setLayout(new BorderLayout());

        TextAreaPanel textAreaPanel = new TextAreaPanel();
        this.add(textAreaPanel, BorderLayout.WEST);

        ProductPanel productPanel = new ProductPanel();
        this.add(productPanel, BorderLayout.EAST);
    }
}
