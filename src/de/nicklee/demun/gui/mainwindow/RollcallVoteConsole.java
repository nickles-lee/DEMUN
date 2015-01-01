package de.nicklee.demun.gui.mainwindow;

import de.nicklee.demun.gui.PresentCountriesList;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class RollcallVoteConsole extends JPanel {

    /**
     * Create the panel.
     */
    public RollcallVoteConsole() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{128, 144, 184, 0};
        gridBagLayout.rowHeights = new int[]{16, 35, 40, 16, 1, 140, 0};
        gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);
                
                        JLabel lblNewLabel = new JLabel("First Round");
                        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
                        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
                        gbc_lblNewLabel.gridx = 0;
                        gbc_lblNewLabel.gridy = 0;
                        add(lblNewLabel, gbc_lblNewLabel);
                
                        JLabel lblSecondRound = new JLabel("Second Round");
                        GridBagConstraints gbc_lblSecondRound = new GridBagConstraints();
                        gbc_lblSecondRound.insets = new Insets(0, 0, 5, 5);
                        gbc_lblSecondRound.gridx = 1;
                        gbc_lblSecondRound.gridy = 0;
                        add(lblSecondRound, gbc_lblSecondRound);
        
                JLabel lblNewLabel_1 = new JLabel("Votes Cast");
                GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
                gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
                gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
                gbc_lblNewLabel_1.gridx = 2;
                gbc_lblNewLabel_1.gridy = 0;
                add(lblNewLabel_1, gbc_lblNewLabel_1);
                        
                                PresentCountriesList panel = new PresentCountriesList();
                                GridBagConstraints gbc_panel = new GridBagConstraints();
                                gbc_panel.fill = GridBagConstraints.BOTH;
                                gbc_panel.insets = new Insets(0, 0, 5, 5);
                                gbc_panel.gridheight = 4;
                                gbc_panel.gridx = 0;
                                gbc_panel.gridy = 1;
                                add(panel, gbc_panel);
                
                        JScrollPane scrollPane = new JScrollPane();
                        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
                        gbc_scrollPane.fill = GridBagConstraints.BOTH;
                        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
                        gbc_scrollPane.gridheight = 4;
                        gbc_scrollPane.gridx = 1;
                        gbc_scrollPane.gridy = 1;
                        add(scrollPane, gbc_scrollPane);
                        
                                JList list = new JList();
                                list.setModel(new AbstractListModel() {
                                    String[] values = new String[]{"List of secondary votes (pass option)"};

                                    public int getSize() {
                                        return values.length;
                                    }

                                    public Object getElementAt(int index) {
                                        return values[index];
                                    }
                                });
                                scrollPane.setViewportView(list);
                
                        JScrollPane scrollPane_1 = new JScrollPane();
                        GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
                        gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
                        gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
                        gbc_scrollPane_1.gridx = 2;
                        gbc_scrollPane_1.gridy = 1;
                        add(scrollPane_1, gbc_scrollPane_1);
                        
                                JButton btnDeleteVote = new JButton("Delete Vote");
                                GridBagConstraints gbc_btnDeleteVote = new GridBagConstraints();
                                gbc_btnDeleteVote.fill = GridBagConstraints.BOTH;
                                gbc_btnDeleteVote.insets = new Insets(0, 0, 5, 0);
                                gbc_btnDeleteVote.gridx = 2;
                                gbc_btnDeleteVote.gridy = 2;
                                add(btnDeleteVote, gbc_btnDeleteVote);
                
                        JLabel lblConfiguration = new JLabel("Configuration");
                        GridBagConstraints gbc_lblConfiguration = new GridBagConstraints();
                        gbc_lblConfiguration.insets = new Insets(0, 0, 5, 0);
                        gbc_lblConfiguration.gridx = 2;
                        gbc_lblConfiguration.gridy = 3;
                        add(lblConfiguration, gbc_lblConfiguration);
        
                JSeparator separator = new JSeparator();
                GridBagConstraints gbc_separator = new GridBagConstraints();
                gbc_separator.fill = GridBagConstraints.BOTH;
                gbc_separator.insets = new Insets(0, 0, 5, 0);
                gbc_separator.gridx = 2;
                gbc_separator.gridy = 4;
                add(separator, gbc_separator);
        
                JPanel panel_1 = new JPanel();
                GridBagConstraints gbc_panel_1 = new GridBagConstraints();
                gbc_panel_1.fill = GridBagConstraints.BOTH;
                gbc_panel_1.insets = new Insets(0, 0, 0, 5);
                gbc_panel_1.gridwidth = 2;
                gbc_panel_1.gridx = 0;
                gbc_panel_1.gridy = 5;
                add(panel_1, gbc_panel_1);
                panel_1.setLayout(new GridLayout(2, 3, 0, 0));
                
                        JButton btnNewButton = new JButton("Yes");
                        panel_1.add(btnNewButton);
                        
                                JButton btnNewButton_1 = new JButton("No");
                                panel_1.add(btnNewButton_1);
                                
                                        JButton btnNewButton_2 = new JButton("Abstain");
                                        panel_1.add(btnNewButton_2);
                                        
                                                JButton btnNewButton_4 = new JButton("<html><center>Yes<br>With Rights</center></html>");
                                                panel_1.add(btnNewButton_4);
                                                
                                                        JButton btnNewButton_5 = new JButton("<html><center>No<br>With Rights</center></html>");
                                                        panel_1.add(btnNewButton_5);
                                                        
                                                                JButton btnNewButton_3 = new JButton("Defer");
                                                                panel_1.add(btnNewButton_3);


        ButtonGroup voteType = new ButtonGroup();
        
                JPanel panel_3 = new JPanel();
                GridBagConstraints gbc_panel_3 = new GridBagConstraints();
                gbc_panel_3.anchor = GridBagConstraints.NORTHWEST;
                gbc_panel_3.gridx = 2;
                gbc_panel_3.gridy = 5;
                add(panel_3, gbc_panel_3);
                panel_3.setLayout(new GridLayout(0, 1, 0, 0));
                
                        JRadioButton rdbtnSimpleMajority = new JRadioButton("Simple Majority");
                        rdbtnSimpleMajority.setSelected(true);
                        panel_3.add(rdbtnSimpleMajority);
                        voteType.add(rdbtnSimpleMajority);
                        
                                JRadioButton rdbtnNewRadioButton = new JRadioButton("Consensus");
                                panel_3.add(rdbtnNewRadioButton);
                                voteType.add(rdbtnNewRadioButton);
                                
                                        JPanel panel_2 = new JPanel();
                                        FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
                                        flowLayout.setVgap(0);
                                        flowLayout.setHgap(0);
                                        flowLayout.setAlignment(FlowLayout.LEFT);
                                        panel_3.add(panel_2);
                                        
                                                JRadioButton radioButton = new JRadioButton("Custom:");
                                                panel_2.add(radioButton);
                                                voteType.add(radioButton);
                                                
                                                        JSpinner spinner = new JSpinner();
                                                        panel_2.add(spinner);
                                                        
                                                                JCheckBox tglbtnPVeto = new JCheckBox("Permanent Member Veto");
                                                                panel_3.add(tglbtnPVeto);
                                                                
                                                                        JCheckBox chckbxVotingWithRights = new JCheckBox("Voting with Rights");
                                                                        panel_3.add(chckbxVotingWithRights);

    }

}
