package org.example.gui.MainPanel.LogoPanel;

import org.example.Inventory;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class LogoPanel extends JPanel {
    public LogoPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.setPreferredSize(new Dimension(1300, 100));
        this.setBackground(Color.decode("#9EC3DD"));
        ImageIcon logo = new ImageIcon(
                Objects.requireNonNull(Inventory.class.getResource("/assets/logoEdited.png"))
        );

        Image scaledLogo = logo.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);

        ImageIcon newLogo = new ImageIcon(scaledLogo);

        JLabel labelLogo = new JLabel(newLogo);
        JLabel companyLabel = new JLabel("JNJS");
        companyLabel.setFont(new Font("Arial", Font.BOLD, 40));
        gbc.anchor = GridBagConstraints.WEST;
        this.add(labelLogo, gbc);
        gbc.weightx = 1.0;
        this.add(companyLabel, gbc);
    }
}
