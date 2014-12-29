package de.nicklee.demun;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.Image;

import javax.swing.Box;

import java.awt.Insets;

import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.SwingConstants;

public class ModeratedCaucusTimer extends JPanel {

	/**
	 * Create the panel.
	 */
	public ModeratedCaucusTimer() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0};
		gridBagLayout.rowHeights = new int[]{47, 79, 20, 0, 0, 0, 0, -8, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel CountryFlag = new JLabel("");
		try {
			CountryFlag.setIcon(flagHandler.getScaledFlag("UNST.png", 250));
		} catch (IOException e) {
			CountryFlag.setText("File Error");
		}
		
		JLabel lblNewLabel_2 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		GridBagConstraints gbc_CountryFlag = new GridBagConstraints();
		gbc_CountryFlag.insets = new Insets(0, 0, 5, 0);
		gbc_CountryFlag.gridx = 0;
		gbc_CountryFlag.gridy = 1;
		add(CountryFlag, gbc_CountryFlag);
		
		JLabel lblNewLabel = new JLabel("<html>\n\t<center>\n\t\t<h1>\n\t\t\t<nobr>\n\t\t\t\tUnited States of America\n\t\t\t</nobr>\n\t\t</h1>\n\t</center>\n</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.insets = new Insets(0, 5, 5, 0);
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 3;
		add(progressBar, gbc_progressBar);
		
		JLabel label = new JLabel("<html>\n\t<center>\n\t\t<h1>\n\t\t\t<nobr>\n\t\t\t\t00:00 / 00:30\n\t\t\t</nobr>\n\t\t</h1>\n\t</center>\n</html>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 4;
		add(label, gbc_label);
		
		JLabel lblNewLabel_3 = new JLabel("<html>\n\t<center>\n\t\t<h3>\n\t\t\t<nobr>\n\t\t\t\tAdding more freedom\n\t\t\t</nobr>\n\t\t</h3>\n\t</center>\n</html>");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JProgressBar progressBar_1 = new JProgressBar();
		GridBagConstraints gbc_progressBar_1 = new GridBagConstraints();
		gbc_progressBar_1.fill = GridBagConstraints.BOTH;
		gbc_progressBar_1.insets = new Insets(0, 5, 5, 0);
		gbc_progressBar_1.gridx = 0;
		gbc_progressBar_1.gridy = 6;
		add(progressBar_1, gbc_progressBar_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 7;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel label_1 = new JLabel("<html>\n\t<center>\n\t\t<h2>\n\t\t\t<nobr>\n\t\t\t\t00:00 / 00:30\n\t\t\t</nobr>\n\t\t</h2>\n\t</center>\n</html>");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 8;
		add(label_1, gbc_label_1);

	}

}
