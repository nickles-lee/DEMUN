package de.nicklee.demun.gui.genspeakerslist;

import de.nicklee.demun.MainWindow;

import javax.swing.*;
import java.awt.*;

public class ScrollingListComponent extends JPanel {

    /**
     * Create the panel.
     */
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

        JList speakersListView = new JList(MainWindow.getCommState().getSpeakersList().toArray());
        scrollPane.setViewportView(speakersListView);
        speakersListView.setLayoutOrientation(JList.VERTICAL_WRAP);
    }

}
