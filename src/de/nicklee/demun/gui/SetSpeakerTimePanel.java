package de.nicklee.demun.gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SetSpeakerTimePanel extends JPanel {

    private JSpinner secSpinner;
    private JSpinner minSpinner;
    /**
     * Create the panel.
     */
    public SetSpeakerTimePanel() {
        GridBagConstraints gbc_setSpeakerTime = new GridBagConstraints();
        gbc_setSpeakerTime.anchor = GridBagConstraints.NORTHWEST;
        gbc_setSpeakerTime.insets = new Insets(0, 0, 5, 0);
        gbc_setSpeakerTime.gridx = 1;
        gbc_setSpeakerTime.gridy = 0;
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblNewLabel = new JLabel("Set Speaking Time:\n");
        this.add(lblNewLabel);

        minSpinner = new JSpinner();
        this.add(minSpinner);
        minSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
//				target.defaultSpeakingMinutes = (int) minSpinner.getValue();
            }
        });
        minSpinner.setEditor(new JSpinner.NumberEditor(minSpinner, "00"));

        JLabel lblNewLabel_1 = new JLabel(" : ");
        this.add(lblNewLabel_1);

        secSpinner = new JSpinner();
        this.add(secSpinner);
        secSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
//				target.defaultSpeakingSeconds = (int) secSpinner.getValue();
            }
        });
        secSpinner.setEditor(new JSpinner.NumberEditor(secSpinner, "00"));

    }

    public int getSeconds() {
        return (int) secSpinner.getValue();
    }

    public void setSeconds(int seconds) {
        this.secSpinner.setValue(seconds);
    }

    public int getMinutes() {
        return (int) minSpinner.getValue();
    }

    public void setMinutes(int minutes) {
        this.minSpinner.setValue(minutes);
    }
}
