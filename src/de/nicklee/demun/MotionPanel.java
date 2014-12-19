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

public class MotionPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public MotionPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Moderated Caucus", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel(":");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 2;
		panel.add(label, gbc_label);
		
		JLabel lblNewLabel = new JLabel("Overall Time:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner spinner_1 = new JSpinner();
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_1.gridx = 2;
		gbc_spinner_1.gridy = 1;
		panel.add(spinner_1, gbc_spinner_1);
		spinner_1.setEditor(new JSpinner.NumberEditor(spinner_1, "00"));

		
		JLabel lblNewLabel_3 = new JLabel(":");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 1;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.gridx = 4;
		gbc_spinner.gridy = 1;
		spinner.setEditor(new JSpinner.NumberEditor(spinner, "00"));
		panel.add(spinner, gbc_spinner);

		
		
		JLabel lblNewLabel_1 = new JLabel("Speaking Time");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setEditor(new JSpinner.NumberEditor(spinner_2, "00"));
		GridBagConstraints gbc_spinner_2 = new GridBagConstraints();
		gbc_spinner_2.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_2.gridx = 2;
		gbc_spinner_2.gridy = 2;
		panel.add(spinner_2, gbc_spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setEditor(new JSpinner.NumberEditor(spinner_3, "00"));
		GridBagConstraints gbc_spinner_3 = new GridBagConstraints();
		gbc_spinner_3.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_3.gridx = 4;
		gbc_spinner_3.gridy = 2;
		panel.add(spinner_3, gbc_spinner_3);
		
		JLabel lblNewLabel_2 = new JLabel("Topic:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{130, 130, 130, 0};
		gbl_panel_1.rowHeights = new int[]{34, 50, 50, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_1.add(scrollPane, gbc_scrollPane);
		
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
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Motion");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Move Up");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 2;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Move Down");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 2;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_4 = new JButton("Pass Motion");
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Fail Motion");
		panel_2.add(btnNewButton_5);

	}

}
