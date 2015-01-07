package de.nicklee.demun.gui.genspeakerslist;

import de.nicklee.demun.CommitteeState;
import de.nicklee.demun.Country;
import de.nicklee.demun.MainWindow;

import javax.swing.*;

import java.awt.*;

public class ScrollingListComponent extends JPanel {

    /**
     * Create the panel.
     */
	public JList speakersListView;
	
    public ScrollingListComponent() {
        setLayout(new BorderLayout(0, 0));
        JScrollPane scrollPane = new JScrollPane();
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridheight = 5;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 1;
        gbc_scrollPane.gridy = 2;
        add(scrollPane);

        speakersListView = new JList(MainWindow.getCommState().getSpeakersList().toArray());
        speakersListView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(speakersListView);
    }

	public void deleteSelectedElement() {
		int oldIndex = speakersListView.getSelectedIndex();
		CommitteeState.getSpeakersList().remove(speakersListView.getSelectedValue());
		speakersListView.setListData(CommitteeState.getSpeakersList().toArray());
		speakersListView.setSelectedIndex(oldIndex);
		// TODO Auto-generated method stub
		
	}
	public void update(){
		speakersListView.setListData(CommitteeState.getSpeakersList().toArray());
	}
}
