package de.nicklee.demun.gui.genspeakerslist;

import de.nicklee.demun.CommitteeState;
import de.nicklee.demun.Country;
import de.nicklee.demun.MainWindow;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

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

        speakersListView = new JList(CommitteeState.getSpeakersList().toArray());
        speakersListView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(speakersListView);


        speakersListView.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList) evt.getSource();
                //Actions to take on doubleclick
                if (evt.getClickCount() == 2) {
                    int index = list.locationToIndex(evt.getPoint());
                    deleteElementsBefore(index);
                    update();
                    //Pass next speaker to handler
                    //advanceSpeakersList()
                }
            }
        });
    }

    private void deleteElementsBefore(int index){
        ArrayList speakersList = (ArrayList) CommitteeState.getSpeakersList();
        for(int i = 0; (i <= index) && (i < speakersList.size()); i++)
            speakersList.remove(0);
    }

	public void deleteSelectedElement() {
		int oldIndex = speakersListView.getSelectedIndex();
		CommitteeState.getSpeakersList().remove(speakersListView.getSelectedValue());
		speakersListView.setListData(CommitteeState.getSpeakersList().toArray());
		speakersListView.setSelectedIndex(oldIndex);
		// TODO Auto-generated method stub
		
	}

    public void raiseSelectedElement() {
        int oldIndex = speakersListView.getSelectedIndex();
        if(oldIndex == 0)
            return;

        Country swap = CommitteeState.getSpeakersList().get(oldIndex - 1);
        CommitteeState.getSpeakersList().set(oldIndex - 1, CommitteeState.getSpeakersList().get(oldIndex));
        CommitteeState.getSpeakersList().set(oldIndex, swap);

        speakersListView.setListData(CommitteeState.getSpeakersList().toArray());
        speakersListView.setSelectedIndex(oldIndex - 1);
        // TODO Auto-generated method stub

    }

    public void lowerSelectedElement() {
        int oldIndex = speakersListView.getSelectedIndex();
        if(oldIndex == CommitteeState.getSpeakersList().size() - 1)
            return;
        Country swap = CommitteeState.getSpeakersList().get(oldIndex + 1);
        CommitteeState.getSpeakersList().set(oldIndex + 1, CommitteeState.getSpeakersList().get(oldIndex));
        CommitteeState.getSpeakersList().set(oldIndex, swap);

        speakersListView.setListData(CommitteeState.getSpeakersList().toArray());
        speakersListView.setSelectedIndex(oldIndex + 1);
        // TODO Auto-generated method stub

    }

	public void update(){
		speakersListView.setListData(CommitteeState.getSpeakersList().toArray());
	}
}
