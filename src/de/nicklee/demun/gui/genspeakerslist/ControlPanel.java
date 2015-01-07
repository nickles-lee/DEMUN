package de.nicklee.demun.gui.genspeakerslist;

import de.nicklee.demun.CommitteeState;
import de.nicklee.demun.MainWindow;
import de.nicklee.demun.gui.SetSpeakerTimePanel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {

    /**
     * Create the panel.
     */
	private ScrollingListComponent listView;
	
    public ControlPanel() {
        GridBagLayout gbl_controlPanel = new GridBagLayout();
        gbl_controlPanel.columnWidths = new int[]{0, 225, 0};
        gbl_controlPanel.rowHeights = new int[]{32, 25, 25, 25, 25, 25, 150, 70, 0};
        gbl_controlPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_controlPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
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

        JComboBox addToSpeakersList = new JComboBox(MainWindow.getCommState().getPresentCountryList().toArray());
        addToSpeakersList.setPreferredSize(new Dimension(100, 27));
        addToSpeakersList.setName("");
        GridBagConstraints gbc_addToSpeakersList = new GridBagConstraints();
        gbc_addToSpeakersList.insets = new Insets(0, 0, 5, 0);
        gbc_addToSpeakersList.fill = GridBagConstraints.BOTH;
        gbc_addToSpeakersList.gridx = 1;
        gbc_addToSpeakersList.gridy = 1;
        this.add(addToSpeakersList, gbc_addToSpeakersList);

        JButton btnNewButton_6 = new JButton("<html><center>Pause<br>Speaker</center></html>");
        GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
        gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
        gbc_btnNewButton_6.gridx = 0;
        gbc_btnNewButton_6.gridy = 2;
        this.add(btnNewButton_6, gbc_btnNewButton_6);

        listView = new ScrollingListComponent();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.gridheight = 5;
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 2;
        add(listView, gbc_panel);


        JButton btnNewButton_5 = new JButton("<html><center>Next<br>Speaker</center></html>");
        GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
        gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
        gbc_btnNewButton_5.gridx = 0;
        gbc_btnNewButton_5.gridy = 3;
        this.add(btnNewButton_5, gbc_btnNewButton_5);

        JButton btnyieldToquestions = new JButton("<html><center>Yield to<br>Questions</center></html>");
        GridBagConstraints gbc_btnyieldToquestions = new GridBagConstraints();
        gbc_btnyieldToquestions.fill = GridBagConstraints.BOTH;
        gbc_btnyieldToquestions.insets = new Insets(0, 0, 5, 5);
        gbc_btnyieldToquestions.gridx = 0;
        gbc_btnyieldToquestions.gridy = 4;
        add(btnyieldToquestions, gbc_btnyieldToquestions);

        JButton button = new JButton("<html><center>Yield to<br>Chair</center></html>");
        GridBagConstraints gbc_button = new GridBagConstraints();
        gbc_button.fill = GridBagConstraints.BOTH;
        gbc_button.insets = new Insets(0, 0, 5, 5);
        gbc_button.gridx = 0;
        gbc_button.gridy = 5;
        this.add(button, gbc_button);

        JPanel panel_1 = new JPanel();
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 1;
        gbc_panel_1.gridy = 7;
        this.add(panel_1, gbc_panel_1);
        panel_1.setLayout(new GridLayout(0, 2, 0, 0));

        JButton btnNewButton_2 = new JButton("Up");
        panel_1.add(btnNewButton_2);

        JButton btnNewButton = new JButton("Down");
        panel_1.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Clear List");
        panel_1.add(btnNewButton_1);

        JButton btnNewButton_3 = new JButton("Delete");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		listView.deleteSelectedElement();
        	}
        });
        panel_1.add(btnNewButton_3);
    }

    public void update(){
        listView.update();
    }

}
