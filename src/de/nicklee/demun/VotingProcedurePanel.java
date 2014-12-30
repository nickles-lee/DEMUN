package de.nicklee.demun;

import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

import net.miginfocom.swing.MigLayout;

import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.JSeparator;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class VotingProcedurePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public VotingProcedurePanel() {
		setLayout(new MigLayout("", "[72px,grow][89px,grow][grow]", "[16px][grow][40px:n:40px][][::10px][]"));
		
		JLabel lblNewLabel = new JLabel("First Round");
		add(lblNewLabel, "cell 0 0,alignx center,aligny center");
		
		JLabel lblSecondRound = new JLabel("Second Round");
		add(lblSecondRound, "cell 1 0,alignx center,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("Votes Cast");
		add(lblNewLabel_1, "cell 2 0,alignx center");
		
		PresentCountriesList panel = new PresentCountriesList();
		add(panel, "cell 0 1 1 4,grow");
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 1 1 1 4,grow");
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"List of secondary votes (pass option)"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		add(scrollPane_1, "cell 2 1,grow");
		
		JButton btnDeleteVote = new JButton("Delete Vote");
		add(btnDeleteVote, "cell 2 2,grow");
		
		JPanel panel_1 = new JPanel();
		add(panel_1, "cell 0 5 2 1,grow");
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
		
		JLabel lblConfiguration = new JLabel("Configuration");
		add(lblConfiguration, "cell 2 3,alignx center,aligny center");
		
		JSeparator separator = new JSeparator();
		add(separator, "cell 2 4,growx");
		
		JPanel panel_3 = new JPanel();
		add(panel_3, "cell 2 5,alignx left");
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		ButtonGroup voteType = new ButtonGroup();
		
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
