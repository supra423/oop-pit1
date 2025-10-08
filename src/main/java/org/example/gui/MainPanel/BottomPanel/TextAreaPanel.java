package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    private static final JTextArea orderTextArea = new JTextArea();
    public TextAreaPanel() {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(470, 370));
        this.setBackground(Color.decode("#9EC3DD"));
        this.setBorder(new EmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();

        //Order List Label
        JLabel headerLabel = new JLabel("ORDER LIST", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setBackground(Color.WHITE);
        headerLabel.setOpaque(true);
        headerLabel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.WHITE, Color.decode("#1E3A5F"), Color.WHITE, Color.decode("#1E3A5F")));
        headerLabel.setPreferredSize(new Dimension(450, 50));

        // Add header label at the top
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0; // Don't expand vertically
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //gbc.insets = new Insets(0, 0, 5, 0); // Small gap below header
        this.add(headerLabel, gbc);

        orderTextArea.setBackground(Color.decode("#E8F6FF"));
        orderTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        orderTextArea.setForeground(Color.BLACK);
        orderTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(orderTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(scrollPane, gbc);

        // Add scroll pane below header
        gbc.gridy = 1;
        gbc.weighty = 1.0; // Expand to fill remaining space
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 0, 0);
        this.add(scrollPane, gbc);
    }
    static public JTextArea getOrderTextArea() { return orderTextArea; }
}