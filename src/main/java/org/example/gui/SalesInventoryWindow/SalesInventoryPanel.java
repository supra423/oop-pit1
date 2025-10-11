package org.example.gui.SalesInventoryWindow;

import org.example.gui.MainPanel.LogoPanel.LogoPanel;

import javax.swing.*;
import java.awt.*;

public class SalesInventoryPanel extends JPanel {
    public SalesInventoryPanel() {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(800, 900));
        this.setBackground(Color.decode("#9EC3DD"));
        GridBagConstraints gbc = new GridBagConstraints();

        LogoPanel logoPanel = new LogoPanel();
        logoPanel.setPreferredSize(new Dimension(800, 100));
        logoPanel.getSloganLabel().setText("| Sales Inventory");

        JPanel innerSalesInventoryPanel = new JPanel(new GridBagLayout());
        innerSalesInventoryPanel.setPreferredSize(new Dimension(750, 800));

        SalesInventoryTextArea salesInventoryTextArea = new SalesInventoryTextArea();

        JScrollPane scrollPane = new JScrollPane(salesInventoryTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(20);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        innerSalesInventoryPanel.add(scrollPane, gbc);
        this.add(logoPanel, gbc);
        gbc.gridy = 1;
        this.add(innerSalesInventoryPanel, gbc);
    }
}
