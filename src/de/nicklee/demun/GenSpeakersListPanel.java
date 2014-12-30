package de.nicklee.demun;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class GenSpeakersListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public GenSpeakersListPanel() {
		setLayout(new BorderLayout(0, 0));
		
		GenSpeakerControlPanel controlPanel = new GenSpeakerControlPanel();
		add(controlPanel, BorderLayout.EAST);
		
		GenSpeakerTimer timerPanel = new GenSpeakerTimer();
		add(timerPanel);

	}

}
