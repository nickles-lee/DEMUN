package de.nicklee.demun.gui.mainwindow;

import de.nicklee.demun.gui.unmoderatedcaucus.TimerView;

import javax.swing.*;
import java.awt.*;

public class DynamicDebateConsole extends JLayeredPane {

    private static GeneralSpeakersConsole genSpeaker;
    private static ModeratedCaucusConsole moderatedCaucus;
    private static JPanel unmoderatedCaucus;

    /**
     * Create the panel.
     */
    public DynamicDebateConsole() {
        setLayout(new CardLayout(0, 0));

        genSpeaker = new GeneralSpeakersConsole();
        setLayer(genSpeaker, 0);
        add(genSpeaker, "name_4119277201351");

        moderatedCaucus = new ModeratedCaucusConsole();
        setLayer(moderatedCaucus, 1);
        add(moderatedCaucus, "name_4119295265475");

        unmoderatedCaucus = new TimerView();
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

    public static void update() {
        if(genSpeaker != null)
            genSpeaker.update();
        //moderatedCaucus.update();
    }
}
