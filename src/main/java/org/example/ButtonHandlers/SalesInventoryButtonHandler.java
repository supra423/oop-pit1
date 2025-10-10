package org.example.ButtonHandlers;
import org.example.gui.SalesInventoryWindow.SalesInventoryWindow;

import java.awt.event.*;

public class SalesInventoryButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        new SalesInventoryWindow();
    }
}
