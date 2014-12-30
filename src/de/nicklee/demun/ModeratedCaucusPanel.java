package de.nicklee.demun;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ModeratedCaucusPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ModeratedCaucusPanel() {
		setLayout(new BorderLayout(0, 0));
		
		ModeratedCaucusTimer panel = new ModeratedCaucusTimer();
		add(panel, BorderLayout.CENTER);
		
		ModeratedCaucusControlPanel list = new ModeratedCaucusControlPanel();
		add(list, BorderLayout.EAST);

	}

}
