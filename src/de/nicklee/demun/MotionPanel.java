package de.nicklee.demun;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Font;

public class MotionPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtDoctitlefield;
	private JTextField txtMainsponsorfield;
	private JTextField textField_3;
	private JLabel txtCreateUnmoderatedCaucus;

	/**
	 * Create the panel.
	 */
	public MotionPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JTabbedPane motionBuilder = new JTabbedPane(JTabbedPane.LEFT);
		motionBuilder.setFont(new Font("SansSerif", Font.PLAIN, 11));
		add(motionBuilder);
		
		JPanel modCaucus = new JPanel();
		motionBuilder.addTab("Mod", null, modCaucus, null);
		GridBagLayout gbl_modCaucus = new GridBagLayout();
		gbl_modCaucus.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_modCaucus.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_modCaucus.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_modCaucus.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		modCaucus.setLayout(gbl_modCaucus);
		
		JLabel lblCreateModeratedCaucus = new JLabel("Create Moderated Caucus");
		GridBagConstraints gbc_lblCreateModeratedCaucus = new GridBagConstraints();
		gbc_lblCreateModeratedCaucus.gridwidth = 6;
		gbc_lblCreateModeratedCaucus.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreateModeratedCaucus.gridx = 0;
		gbc_lblCreateModeratedCaucus.gridy = 0;
		modCaucus.add(lblCreateModeratedCaucus, gbc_lblCreateModeratedCaucus);
		
		JLabel label = new JLabel(":");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 2;
		modCaucus.add(label, gbc_label);
		
		JLabel lblNewLabel = new JLabel("Overall Time:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		modCaucus.add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner spinner_1 = new JSpinner();
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_1.gridx = 2;
		gbc_spinner_1.gridy = 1;
		modCaucus.add(spinner_1, gbc_spinner_1);
		spinner_1.setEditor(new JSpinner.NumberEditor(spinner_1, "00"));
		
				
				JLabel lblNewLabel_3 = new JLabel(":");
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 3;
				gbc_lblNewLabel_3.gridy = 1;
				modCaucus.add(lblNewLabel_3, gbc_lblNewLabel_3);
				
				JSpinner spinner = new JSpinner();
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.insets = new Insets(0, 0, 5, 5);
				gbc_spinner.gridx = 4;
				gbc_spinner.gridy = 1;
				spinner.setEditor(new JSpinner.NumberEditor(spinner, "00"));
				modCaucus.add(spinner, gbc_spinner);
				
						
						
						JLabel lblNewLabel_1 = new JLabel("Speaking Time");
						lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
						GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
						gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
						gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_1.gridx = 1;
						gbc_lblNewLabel_1.gridy = 2;
						modCaucus.add(lblNewLabel_1, gbc_lblNewLabel_1);
						
						JSpinner spinner_2 = new JSpinner();
						spinner_2.setEditor(new JSpinner.NumberEditor(spinner_2, "00"));
						GridBagConstraints gbc_spinner_2 = new GridBagConstraints();
						gbc_spinner_2.insets = new Insets(0, 0, 5, 5);
						gbc_spinner_2.gridx = 2;
						gbc_spinner_2.gridy = 2;
						modCaucus.add(spinner_2, gbc_spinner_2);
						
						JSpinner spinner_3 = new JSpinner();
						spinner_3.setEditor(new JSpinner.NumberEditor(spinner_3, "00"));
						GridBagConstraints gbc_spinner_3 = new GridBagConstraints();
						gbc_spinner_3.insets = new Insets(0, 0, 5, 5);
						gbc_spinner_3.gridx = 4;
						gbc_spinner_3.gridy = 2;
						modCaucus.add(spinner_3, gbc_spinner_3);
						
						JLabel lblNewLabel_2 = new JLabel("Topic:");
						GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
						gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
						gbc_lblNewLabel_2.gridx = 1;
						gbc_lblNewLabel_2.gridy = 3;
						modCaucus.add(lblNewLabel_2, gbc_lblNewLabel_2);
						
						textField = new JTextField();
						GridBagConstraints gbc_textField = new GridBagConstraints();
						gbc_textField.gridwidth = 3;
						gbc_textField.insets = new Insets(0, 0, 5, 5);
						gbc_textField.fill = GridBagConstraints.HORIZONTAL;
						gbc_textField.gridx = 2;
						gbc_textField.gridy = 3;
						modCaucus.add(textField, gbc_textField);
						textField.setColumns(10);
		
		JPanel unmodCaucus = new JPanel();
		motionBuilder.addTab("Unmod", null, unmodCaucus, null);
		GridBagLayout gbl_unmodCaucus = new GridBagLayout();
		gbl_unmodCaucus.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_unmodCaucus.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_unmodCaucus.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_unmodCaucus.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		unmodCaucus.setLayout(gbl_unmodCaucus);
		
		txtCreateUnmoderatedCaucus = new JLabel();
		txtCreateUnmoderatedCaucus.setText("Create Unmoderated Caucus");
		GridBagConstraints gbc_txtCreateUnmoderatedCaucus = new GridBagConstraints();
		gbc_txtCreateUnmoderatedCaucus.gridwidth = 6;
		gbc_txtCreateUnmoderatedCaucus.insets = new Insets(0, 0, 5, 5);
		gbc_txtCreateUnmoderatedCaucus.gridx = 0;
		gbc_txtCreateUnmoderatedCaucus.gridy = 0;
		unmodCaucus.add(txtCreateUnmoderatedCaucus, gbc_txtCreateUnmoderatedCaucus);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 4;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 1;
		unmodCaucus.add(separator, gbc_separator);
		
		JLabel label_2 = new JLabel("Overall Time:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 2;
		unmodCaucus.add(label_2, gbc_label_2);
		
		JSpinner spinner_4 = new JSpinner();
		GridBagConstraints gbc_spinner_4 = new GridBagConstraints();
		gbc_spinner_4.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_4.gridx = 2;
		gbc_spinner_4.gridy = 2;
		spinner_4.setEditor(new JSpinner.NumberEditor(spinner_4, "00"));
		unmodCaucus.add(spinner_4, gbc_spinner_4);
		
		JLabel label_3 = new JLabel(":");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 2;
		unmodCaucus.add(label_3, gbc_label_3);
		
		JSpinner spinner_5 = new JSpinner();
		GridBagConstraints gbc_spinner_5 = new GridBagConstraints();
		gbc_spinner_5.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_5.gridx = 4;
		gbc_spinner_5.gridy = 2;
		spinner_5.setEditor(new JSpinner.NumberEditor(spinner_5, "00"));
		unmodCaucus.add(spinner_5, gbc_spinner_5);
		
		JLabel label_5 = new JLabel("Topic:");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 3;
		unmodCaucus.add(label_5, gbc_label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		unmodCaucus.add(textField_1, gbc_textField_1);
		
		JPanel introDoc = new JPanel();
		motionBuilder.addTab("Intro", null, introDoc, null);
		GridBagLayout gbl_introDoc = new GridBagLayout();
		gbl_introDoc.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_introDoc.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_introDoc.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_introDoc.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		introDoc.setLayout(gbl_introDoc);
		
		JLabel lblNewLabel_12 = new JLabel("Introduce Document");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.gridwidth = 4;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 0;
		gbc_lblNewLabel_12.gridy = 0;
		introDoc.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel lblNewLabel_7 = new JLabel("<html><b>Document Title:</b></html>");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 1;
		introDoc.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtDoctitlefield = new JTextField();
		txtDoctitlefield.setText("docTitleField");
		GridBagConstraints gbc_txtDoctitlefield = new GridBagConstraints();
		gbc_txtDoctitlefield.insets = new Insets(0, 0, 5, 5);
		gbc_txtDoctitlefield.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDoctitlefield.gridx = 2;
		gbc_txtDoctitlefield.gridy = 1;
		introDoc.add(txtDoctitlefield, gbc_txtDoctitlefield);
		txtDoctitlefield.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("<html><b>Main Sponsor:</b></html>");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 2;
		introDoc.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		txtMainsponsorfield = new JTextField();
		txtMainsponsorfield.setText("mainSponsorField");
		GridBagConstraints gbc_txtMainsponsorfield = new GridBagConstraints();
		gbc_txtMainsponsorfield.insets = new Insets(0, 0, 5, 5);
		gbc_txtMainsponsorfield.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMainsponsorfield.gridx = 2;
		gbc_txtMainsponsorfield.gridy = 2;
		introDoc.add(txtMainsponsorfield, gbc_txtMainsponsorfield);
		txtMainsponsorfield.setColumns(10);
		
		JPanel closeTopic = new JPanel();
		motionBuilder.addTab("Close", null, closeTopic, null);
		GridBagLayout gbl_closeTopic = new GridBagLayout();
		gbl_closeTopic.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_closeTopic.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_closeTopic.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_closeTopic.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		closeTopic.setLayout(gbl_closeTopic);
		
		JLabel lblNewLabel_11 = new JLabel("Close Debate");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.gridwidth = 4;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 0;
		gbc_lblNewLabel_11.gridy = 0;
		closeTopic.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JLabel lblNewLabel_4 = new JLabel("<html><b>Type:<b></html>");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 1;
		closeTopic.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dynamic");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 1;
		closeTopic.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblTopic = new JLabel("<html><b>Topic:<b></html>");
		GridBagConstraints gbc_lblTopic = new GridBagConstraints();
		gbc_lblTopic.anchor = GridBagConstraints.EAST;
		gbc_lblTopic.insets = new Insets(0, 0, 5, 5);
		gbc_lblTopic.gridx = 1;
		gbc_lblTopic.gridy = 2;
		closeTopic.add(lblTopic, gbc_lblTopic);
		
		JLabel lblNewLabel_6 = new JLabel("Dynamic");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 2;
		closeTopic.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JPanel panel = new JPanel();
		motionBuilder.addTab("Chair", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_13 = new JLabel("Custom Chair Action");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.gridwidth = 4;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 0;
		gbc_lblNewLabel_13.gridy = 0;
		panel.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridwidth = 2;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 1;
		panel.add(separator_1, gbc_separator_1);
		
		JLabel lblNewLabel_9 = new JLabel("<html><b>Action:</b></html>");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 2;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 2;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("<html><b>Percent to Pass:</b></html>");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 3;
		panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JSpinner spinner_6 = new JSpinner();
		GridBagConstraints gbc_spinner_6 = new GridBagConstraints();
		gbc_spinner_6.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_6.gridx = 2;
		gbc_spinner_6.gridy = 3;
		panel.add(spinner_6, gbc_spinner_6);
		
		JPanel motionQueue = new JPanel();
		add(motionQueue);
		GridBagLayout gbl_motionQueue = new GridBagLayout();
		gbl_motionQueue.columnWidths = new int[]{130, 130, 130, 0};
		gbl_motionQueue.rowHeights = new int[]{34, 50, 50, 0};
		gbl_motionQueue.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_motionQueue.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		motionQueue.setLayout(gbl_motionQueue);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		motionQueue.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus", "10m 20s moderated caucus for anarchy, 1m speaking time", "05m 15s unmoderated caucus"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton btnNewButton = new JButton("Add Motion");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		motionQueue.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Motion");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		motionQueue.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Move Up");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 2;
		motionQueue.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Move Down");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 2;
		motionQueue.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JPanel passFailPanel = new JPanel();
		add(passFailPanel);
		passFailPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_4 = new JButton("Pass Motion");
		passFailPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Fail Motion");
		passFailPanel.add(btnNewButton_5);

	}

}
