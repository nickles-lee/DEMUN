package de.nicklee.demun.gui.mainwindow;

import de.nicklee.demun.gui.genspeakerslist.ControlPanel;
import de.nicklee.demun.gui.genspeakerslist.TimerView;

import javax.swing.*;
import java.awt.*;

public class GeneralSpeakersConsole extends JPanel {

    /**
     * Create the panel.
     */
    public GeneralSpeakersConsole() {
        setLayout(new BorderLayout(0, 0));

        ControlPanel controlPanel = new ControlPanel();
        add(controlPanel, BorderLayout.EAST);

        TimerView timerPanel = new TimerView();
        add(timerPanel);

    }

}
