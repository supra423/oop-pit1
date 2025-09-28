package org.example.ButtonHandlers;

import org.example.Order;
import org.example.gui.MainPanel.BottomPanel.CashFieldPanel;
import org.example.gui.MainPanel.MiddlePanel.TextAreaPanel;

import java.awt.event.*;

public class NextCustomerButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        Order.resetOrders();
        CashFieldPanel.totalLabel.setText("<html>Total:<br>Php00.00</html>");
        CashFieldPanel.changeLabel.setText("<html>Change:<br>Php00.00</html>");
        CashFieldPanel.cashTextField.setText("");
        TextAreaPanel.getOrderTextArea().setText("");
    }
}
