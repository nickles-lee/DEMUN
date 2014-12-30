package de.nicklee.demun;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class SpeakersListView extends JPanel {

	/**
	 * Create the panel.
	 */
	public SpeakersListView() {
		setLayout(new BorderLayout(0, 0));
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		add(scrollPane);
		
		JList speakersListView = new JList(MainFrame.getCommState().speakersList.toArray());
		scrollPane.setViewportView(speakersListView);
		speakersListView.setLayoutOrientation(JList.VERTICAL_WRAP);
	}

}
