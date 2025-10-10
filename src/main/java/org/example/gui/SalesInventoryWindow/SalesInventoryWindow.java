package org.example.gui.SalesInventoryWindow;
import javax.swing.*;
import java.awt.*;

public class SalesInventoryWindow extends JFrame {
    public SalesInventoryWindow() {
        this.setTitle("JNJS SALES INVENTORY");
        this.setVisible(true);
        SalesInventoryPanel salesInventoryPanel = new SalesInventoryPanel();

        JScrollPane scrollPane = new JScrollPane(salesInventoryPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(20);

        this.add(scrollPane);
        this.pack();
    }
}
