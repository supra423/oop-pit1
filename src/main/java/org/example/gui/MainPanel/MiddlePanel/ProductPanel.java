package org.example.gui.MainPanel.MiddlePanel;

import org.example.Inventory;
import org.example.ButtonHandlers.ProductButtonHandler;

import javax.swing.*;
import java.awt.*;

public class ProductPanel extends JPanel {
    private static final int NUMBER_OF_BUTTONS = 8;
    private static final Inventory inventory = new Inventory();
    public ProductPanel() {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(880, 680));
        this.setBackground(Color.decode("#B8E4FF"));
        JPanel innerProductPanel = new JPanel(new GridLayout(3, 3));
        innerProductPanel.setBackground(Color.decode("#9EC3DD"));
        innerProductPanel.setPreferredSize(new Dimension(860, 680));

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {
            GridBagConstraints gbc = new GridBagConstraints();
            JButton button = new JButton();
            ProductButtonHandler productButtonHandler = new ProductButtonHandler(inventory.getInventory()[i]);
            button.setLayout(new GridBagLayout());
            button.addActionListener(productButtonHandler);
            JLabel image = new JLabel(inventory.getInventory()[i].icon());
            JLabel productInfo = new JLabel(String.format("<html>%s<br>Price: Php%.2f</html>",
                    inventory.getInventory()[i].name(),
                    inventory.getInventory()[i].price()));
            productInfo.setFont(new Font("Arial", Font.BOLD, 20));
            gbc.gridy = 0;
            button.add(image, gbc);
            gbc.gridy = 1;
            button.add(productInfo, gbc);
            button.setBackground(Color.WHITE);
            innerProductPanel.add(button);
        }

        this.add(innerProductPanel);
    }
}
