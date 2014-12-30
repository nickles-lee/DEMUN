package de.nicklee.demun.gui.mainwindow;

import de.nicklee.demun.gui.PresentCountriesList;
import de.nicklee.demun.gui.SetSpeakerTimePanel;

import javax.swing.*;
import java.awt.*;

public class SingleSpeakerConsole extends JPanel {

    /**
     * Create the panel.
     */
    public SingleSpeakerConsole() {
        GridBagLayout gbl_controlPanel = new GridBagLayout();
        gbl_controlPanel.columnWidths = new int[]{0, 225, 0};
        gbl_controlPanel.rowHeights = new int[]{32, 25, 25, 25, 25, 25, 0};
        gbl_controlPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_controlPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        this.setLayout(gbl_controlPanel);

        JPanel setSpeakerTime = new SetSpeakerTimePanel();
        GridBagConstraints gbc_setSpeakerTime = new GridBagConstraints();
        gbc_setSpeakerTime.anchor = GridBagConstraints.NORTHWEST;
        gbc_setSpeakerTime.insets = new Insets(0, 0, 5, 0);
        gbc_setSpeakerTime.gridx = 1;
        gbc_setSpeakerTime.gridy = 0;
        this.add(setSpeakerTime, gbc_setSpeakerTime);
        setSpeakerTime.setLayout(new BoxLayout(setSpeakerTime, BoxLayout.X_AXIS));

        JButton btnNewButton_4 = new JButton("<html><center>Yield to<br>Delegate</center></html>");
        GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
        gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
        gbc_btnNewButton_4.gridx = 0;
        gbc_btnNewButton_4.gridy = 1;
        this.add(btnNewButton_4, gbc_btnNewButton_4);

        JButton btnNewButton_6 = new JButton("<html><center>Pause<br>Speaker</center></html>");
        GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
        gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
        gbc_btnNewButton_6.gridx = 0;
        gbc_btnNewButton_6.gridy = 2;
        this.add(btnNewButton_6, gbc_btnNewButton_6);

        JButton btnNewButton_5 = new JButton("<html><center>Yield to<br>Questions</center></html>");
        GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
        gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
        gbc_btnNewButton_5.gridx = 0;
        gbc_btnNewButton_5.gridy = 3;
        this.add(btnNewButton_5, gbc_btnNewButton_5);

        JButton button = new JButton("<html><center>Yield to<br>Chair</center></html>");
        GridBagConstraints gbc_button = new GridBagConstraints();
        gbc_button.fill = GridBagConstraints.BOTH;
        gbc_button.insets = new Insets(0, 0, 5, 5);
        gbc_button.gridx = 0;
        gbc_button.gridy = 4;
        this.add(button, gbc_button);

        PresentCountriesList presentCountriesList = new PresentCountriesList();
        GridBagConstraints gbc_presentCountriesList = new GridBagConstraints();
        gbc_presentCountriesList.gridheight = 5;
        gbc_presentCountriesList.fill = GridBagConstraints.BOTH;
        gbc_presentCountriesList.gridx = 1;
        gbc_presentCountriesList.gridy = 1;
        this.add(presentCountriesList, gbc_presentCountriesList);
    }

}
