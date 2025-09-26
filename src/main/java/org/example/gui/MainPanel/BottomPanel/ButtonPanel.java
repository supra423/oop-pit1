package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        this.setLayout(new GridLayout());
        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());

        JButton nextCustomerButton = new JButton();
        JButton salesInventoryButton = new JButton();

        nextCustomerButton.setPreferredSize(new Dimension(130, 170));
        salesInventoryButton.setPreferredSize(new Dimension(130, 170));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(10, 10, 10, 11);
        panel1.add(nextCustomerButton, gbc);

        panel1.add(salesInventoryButton, gbc);

        JButton confirmButton = new JButton();
        JButton cancelButton = new JButton();

        confirmButton.setPreferredSize(new Dimension(300, 80));
        cancelButton.setPreferredSize(new Dimension(300, 80));

        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel2.add(confirmButton, gbc);

        gbc.gridy = 1;
        panel2.add(cancelButton, gbc);

        this.add(panel1);
        this.add(panel2);
    }
}
