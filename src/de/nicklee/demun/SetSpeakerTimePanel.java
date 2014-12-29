package de.nicklee.demun;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.FlowLayout;
import org.jdesktop.swingx.JXPanel;

public class SetSpeakerTimePanel extends JPanel {

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
		
		JSpinner minSpinner = new JSpinner();
		this.add(minSpinner);
		minSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
//				target.defaultSpeakingMinutes = (int) minSpinner.getValue();
			}
		});
		minSpinner.setEditor(new JSpinner.NumberEditor(minSpinner, "00"));
		
		JLabel lblNewLabel_1 = new JLabel(" : ");
		this.add(lblNewLabel_1);
		
		JSpinner secSpinner = new JSpinner();
		this.add(secSpinner);
		secSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
//				target.defaultSpeakingSeconds = (int) secSpinner.getValue();
			}
		});
		secSpinner.setEditor(new JSpinner.NumberEditor(secSpinner, "00"));
		
	}

}
