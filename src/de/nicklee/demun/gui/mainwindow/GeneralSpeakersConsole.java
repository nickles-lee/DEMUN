package de.nicklee.demun.gui.mainwindow;

import de.nicklee.demun.gui.genspeakerslist.ControlPanel;
import de.nicklee.demun.gui.genspeakerslist.TimerView;

import javax.swing.*;
import java.awt.*;

public class GeneralSpeakersConsole extends JPanel {

        private ControlPanel controlPanel;
        private TimerView timerPanel;
    /**
     * Create the panel.
     */
    public GeneralSpeakersConsole() {
        setLayout(new BorderLayout(0, 0));

        controlPanel = new ControlPanel();
        add(controlPanel, BorderLayout.EAST);

        timerPanel = new TimerView();
        add(timerPanel);

    }

    public void update(){
        controlPanel.update();
    }

}
