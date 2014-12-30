package de.nicklee.demun;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class GenSpeakerView extends JPanel {

	/**
	 * Create the panel.
	 */
	public GenSpeakerView() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel speakersListView = new SpeakersListView();
		add(speakersListView, BorderLayout.EAST);
		
		JPanel Timer = new GenSpeakerTimer();
		add(Timer, BorderLayout.CENTER);

	}

}
