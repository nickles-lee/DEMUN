package de.nicklee.demun.gui.dynamicdebate;

import de.nicklee.demun.SecondaryWindow;
import de.nicklee.demun.gui.moderatedcaucus.ModeratedCaucusTimer;

import javax.swing.*;
import java.awt.*;

public class TimerView extends JLayeredPane {

    private JPanel genSpeaker, moderatedCaucus, unmoderatedCaucus;

    /**
     * Create the panel.
     */
    public TimerView() {
        setLayout(new CardLayout(0, 0));

        genSpeaker = new SecondaryWindow.generalSpeakersCombinedView();
        setLayer(genSpeaker, 0);
        add(genSpeaker, "name_4119277201351");

        moderatedCaucus = new ModeratedCaucusTimer();
        setLayer(moderatedCaucus, 1);
        add(moderatedCaucus, "name_4119295265475");

        unmoderatedCaucus = new de.nicklee.demun.gui.unmoderatedcaucus.TimerView();
        setLayer(unmoderatedCaucus, 0);
        add(unmoderatedCaucus, "name_4119301061815");

        setVisibleDebate("moderated");
    }

    public void setVisibleDebate(String type) {
        if (type.equals("genSpeaker")) {
            this.setLayer(genSpeaker, 1);
            this.setLayer(moderatedCaucus, 0);
            this.setLayer(unmoderatedCaucus, 0);
        } else if (type.equals("moderated")) {
            this.setLayer(genSpeaker, 0);
            this.setLayer(moderatedCaucus, 1);
            this.setLayer(unmoderatedCaucus, 0);
        } else if (type.equals("unmoderated")) {
            this.setLayer(genSpeaker, 0);
            this.setLayer(moderatedCaucus, 0);
            this.setLayer(unmoderatedCaucus, 1);
        } else {
            System.out.println("[ERROR] Invalid debate type");
            this.setLayer(genSpeaker, 1);
            this.setLayer(moderatedCaucus, 0);
            this.setLayer(unmoderatedCaucus, 0);
        }
    }

}
