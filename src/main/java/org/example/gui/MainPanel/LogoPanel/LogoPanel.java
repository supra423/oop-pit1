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
        this.setBackground(Color.decode("#2A354E"));
        ImageIcon logo = new ImageIcon(
                Objects.requireNonNull(Inventory.class.getResource("/assets/logoEdited.png"))
        );

        Image scaledLogo = logo.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);

        ImageIcon newLogo = new ImageIcon(scaledLogo);

        JLabel labelLogo = new JLabel(newLogo);
        JLabel companyLabel = new JLabel("JNJS");
        JLabel sloganLabel = new JLabel("| Experience the Boldness.");
        companyLabel.setFont(new Font("Arial", Font.BOLD, 40));
        sloganLabel.setFont(new Font("Arial", Font.BOLD, 35));
        companyLabel.setForeground(Color.decode("#3BB4FF"));
        sloganLabel.setForeground(Color.WHITE);
        gbc.insets = new Insets(10, 10, 10, 10);
        this.add(labelLogo, gbc);
        this.add(companyLabel, gbc);
        this.add(sloganLabel, gbc);
    }
}
