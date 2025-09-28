package org.example.ButtonHandlers;
import org.example.Order;
import org.example.gui.MainPanel.MiddlePanel.ProductPanel;
import org.example.gui.MainPanel.MiddlePanel.ProductPanel.*;

import javax.swing.*;
import java.awt.event.*;

import static org.example.gui.MainPanel.BottomPanel.CashFieldPanel.*;

public class ConfirmButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        double change = 0;
        try {
            change = Double.parseDouble(cashTextField.getText()) - Order.calculateTotal();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Only input numbers!");
        }
        if (change < 0) {
            JOptionPane.showMessageDialog(null, "Insufficient cash!");
        } else {
            changeLabel.setText(String.format("<html>Change:<br>Php%.2f</html>", change));
            for (JButton button : ProductPanel.getButtons()) {
                button.setEnabled(false);
            }
        }

    }
}