package de.nicklee.demun.gui;

import de.nicklee.demun.CommitteeState;
import de.nicklee.demun.Country;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PresentCountriesList extends JPanel {

    /**
     * Create the panel.
     */

    private JList list;
    public PresentCountriesList() {
        setLayout(new BorderLayout(0, 0));
        JScrollPane scrollPane = new JScrollPane();
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridheight = 5;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 1;
        gbc_scrollPane.gridy = 2;
        add(scrollPane);

        String placeholder[] = {"1","2"};
        list = new JList();
        list.setListData(CommitteeState.getPresentCountryList().toArray());
        list.setListData(placeholder);
        scrollPane.setViewportView(list);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                //Actions to take on doubleclick
                if (evt.getClickCount() == 2) {
                    int index = list.locationToIndex(evt.getPoint());
                    //Pass action to the CommitteeState debate handler
                }
            }
        });
    }

    public void update(){
        list.setListData(CommitteeState.getPresentCountryList().toArray());
    }


}
