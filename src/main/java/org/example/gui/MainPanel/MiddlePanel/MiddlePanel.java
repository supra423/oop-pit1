package org.example.gui.MainPanel.MiddlePanel;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel extends JPanel {
    public MiddlePanel() {
        this.setLayout(new BorderLayout());

        TextAreaPanel textAreaPanel = new TextAreaPanel();
        this.add(textAreaPanel, BorderLayout.WEST);

        ProductPanel productPanel = new ProductPanel();
        this.add(productPanel, BorderLayout.EAST);
    }
}
