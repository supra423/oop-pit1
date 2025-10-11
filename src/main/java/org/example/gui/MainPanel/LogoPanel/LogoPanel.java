package org.example.gui.MainPanel.LogoPanel;

import org.example.Inventory;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.Objects;

public class LogoPanel extends JPanel {
    private String sloganText = "| Experience the Boldness.";
    public LogoPanel() {
        this.setPreferredSize(new Dimension(1300, 100));
        this.setBackground(Color.decode("#2A354E"));
        this.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.decode("#98CEE0"), Color.decode("#98CEE0") ));
        ImageIcon logo = new ImageIcon(Objects.requireNonNull(Inventory.class.getResource("/assets/logoEdited.png")));

        Image scaledLogo = logo.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon newLogo = new ImageIcon(scaledLogo);

        JLabel labelLogo = new JLabel(newLogo);
        JLabel companyLabel = new JLabel("JNJS");
        JLabel sloganLabel = new JLabel(sloganText);
        companyLabel.setFont(new Font("Arial", Font.BOLD, 40));
        sloganLabel.setFont(new Font("Arial", Font.BOLD, 35));
        companyLabel.setForeground(Color.decode("#3BB4FF"));
        sloganLabel.setForeground(Color.WHITE);

        this.add(labelLogo);
        this.add(companyLabel);
        this.add(sloganLabel);
    }
    public void setSloganText(String newText) {
        sloganText = newText;
    }
}
