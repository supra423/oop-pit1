package org.example.gui.MainPanel.MiddlePanel;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel extends JPanel {
    public MiddlePanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.decode("#9EC3DD"));

        ProductPanel productPanel = new ProductPanel();
        this.add(productPanel);
    }
}
