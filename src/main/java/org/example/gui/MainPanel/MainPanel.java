package org.example.gui.MainPanel;

import org.example.gui.MainPanel.BottomPanel.BottomPanel;
import org.example.gui.MainPanel.LogoPanel.LogoPanel;
import org.example.gui.MainPanel.MiddlePanel.MiddlePanel;
import org.example.gui.SuperPanel;

import java.awt.*;

public class MainPanel extends SuperPanel {
    public MainPanel() {
        this.setLayout(new BorderLayout());

        LogoPanel logoPanel = new LogoPanel();
        this.add(logoPanel, BorderLayout.NORTH);

        MiddlePanel middlePanel = new MiddlePanel();
        this.add(middlePanel, BorderLayout.CENTER);

        BottomPanel bottomPanel = new BottomPanel();
        this.add(bottomPanel, BorderLayout.SOUTH);
    }
}
