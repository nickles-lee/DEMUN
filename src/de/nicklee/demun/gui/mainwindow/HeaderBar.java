package de.nicklee.demun.gui.mainwindow;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class HeaderBar extends JPanel {
    private JLabel topicDisplay;
    private JLabel committeeDisplay;
    private JLabel presentDisplay;

    /**
     * Create the panel.
     */
    public HeaderBar() {
        setLayout(new BorderLayout(0, 0));

        JPanel panel_1 = new JPanel();
        add(panel_1, BorderLayout.WEST);
        GridBagLayout gbl_panel_1 = new GridBagLayout();
        gbl_panel_1.columnWidths = new int[]{80, 40, 0};
        gbl_panel_1.rowHeights = new int[]{0, 16, 0, 0, 0, 0};
        gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_panel_1.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        panel_1.setLayout(gbl_panel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2.gridx = 1;
        gbc_lblNewLabel_2.gridy = 0;
        panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

        JLabel CommitteeLabel = new JLabel("\nCommittee:");
        GridBagConstraints gbc_CommitteeLabel = new GridBagConstraints();
        gbc_CommitteeLabel.anchor = GridBagConstraints.EAST;
        gbc_CommitteeLabel.insets = new Insets(0, 0, 5, 5);
        gbc_CommitteeLabel.gridx = 0;
        gbc_CommitteeLabel.gridy = 1;
        panel_1.add(CommitteeLabel, gbc_CommitteeLabel);
        CommitteeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        CommitteeLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        committeeDisplay = new JLabel("East Asia Summit (Dynamic)");
        GridBagConstraints gbc_committeeDisplay = new GridBagConstraints();
        gbc_committeeDisplay.anchor = GridBagConstraints.WEST;
        gbc_committeeDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_committeeDisplay.gridx = 1;
        gbc_committeeDisplay.gridy = 1;
        panel_1.add(committeeDisplay, gbc_committeeDisplay);

        JLabel TopicLabel = new JLabel("Topic:");
        GridBagConstraints gbc_TopicLabel = new GridBagConstraints();
        gbc_TopicLabel.anchor = GridBagConstraints.EAST;
        gbc_TopicLabel.insets = new Insets(0, 0, 5, 5);
        gbc_TopicLabel.gridx = 0;
        gbc_TopicLabel.gridy = 2;
        panel_1.add(TopicLabel, gbc_TopicLabel);
        TopicLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        TopicLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        topicDisplay = new JLabel("");
        GridBagConstraints gbc_topicDisplay = new GridBagConstraints();
        gbc_topicDisplay.anchor = GridBagConstraints.WEST;
        gbc_topicDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_topicDisplay.gridx = 1;
        gbc_topicDisplay.gridy = 2;
        panel_1.add(topicDisplay, gbc_topicDisplay);

        JLabel PresentLabel = new JLabel("Present:");
        GridBagConstraints gbc_PresentLabel = new GridBagConstraints();
        gbc_PresentLabel.anchor = GridBagConstraints.EAST;
        gbc_PresentLabel.insets = new Insets(0, 0, 5, 5);
        gbc_PresentLabel.gridx = 0;
        gbc_PresentLabel.gridy = 3;
        panel_1.add(PresentLabel, gbc_PresentLabel);
        PresentLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        PresentLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        presentDisplay = new JLabel("A / B (1/2 = C ; 2/3 = D)");
        GridBagConstraints gbc_presentStats = new GridBagConstraints();
        gbc_presentStats.insets = new Insets(0, 0, 5, 0);
        gbc_presentStats.anchor = GridBagConstraints.WEST;
        gbc_presentStats.gridx = 1;
        gbc_presentStats.gridy = 3;
        panel_1.add(presentDisplay, gbc_presentStats);

        JLabel lblNewLabel_3 = new JLabel("");
        GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        gbc_lblNewLabel_3.gridx = 1;
        gbc_lblNewLabel_3.gridy = 4;
        panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(0, 0, 0, 10));
        add(panel, BorderLayout.EAST);
        panel.setLayout(new BorderLayout(0, 0));

        JLabel ConferenceLogo = new JLabel("");
        ConferenceLogo.setIcon(new ImageIcon("/Users/nick/Projects/DEMUN/DEMUN/Graphics/logo.png"));
        panel.add(ConferenceLogo, BorderLayout.CENTER);

    }

    public void setTopic(String top) {
        topicDisplay.setText("<html>" + top + "</html>");
    }

    public void setCommittee(String com) {
        committeeDisplay.setText(com);
    }

    public void setPresentStats(int present, int max) {
        presentDisplay.setText(present + " / " + max + " (1/2 = " + (int) Math.ceil(max / 2.0) + "; 2/3 = " + (int) Math.ceil(max / 1.5) + ")");
    }
}
