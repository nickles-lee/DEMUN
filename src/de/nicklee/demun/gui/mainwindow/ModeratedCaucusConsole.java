package de.nicklee.demun.gui.mainwindow;

import de.nicklee.demun.gui.moderatedcaucus.ModeratedCaucusControlPanel;
import de.nicklee.demun.gui.moderatedcaucus.ModeratedCaucusTimer;

import javax.swing.*;
import java.awt.*;

public class ModeratedCaucusConsole extends JPanel {

    /**
     * Create the panel.
     */
    public ModeratedCaucusConsole() {
        setLayout(new BorderLayout(0, 0));

        ModeratedCaucusTimer panel = new ModeratedCaucusTimer();
        add(panel, BorderLayout.CENTER);

        ModeratedCaucusControlPanel list = new ModeratedCaucusControlPanel();
        add(list, BorderLayout.EAST);

    }

}
