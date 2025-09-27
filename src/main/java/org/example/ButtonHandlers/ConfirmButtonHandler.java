package org.example.ButtonHandlers;
import org.example.Order;

import javax.swing.*;
import java.awt.event.*;

import static org.example.gui.MainPanel.BottomPanel.CashFieldPanel.*;

public class ConfirmButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        double change = Double.parseDouble(cashTextField.getText()) - Order.calculateTotal();
        if (change < 0) {
            JOptionPane.showMessageDialog(null, "Insufficient cash!");
        } else {
            changeLabel.setText(String.format("<html>Change:<br>Php%.2f</html>", change));
        }
    }
}