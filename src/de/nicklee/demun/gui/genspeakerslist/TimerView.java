package de.nicklee.demun.gui.genspeakerslist;

import de.nicklee.demun.Country;
import de.nicklee.demun.FlagHandler;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import java.awt.Insets;

import javax.swing.JProgressBar;

import java.io.IOException;

import javax.swing.SwingConstants;

public class TimerView extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel countryFlag, speakingCountryName, speakingTime;
	public TimerView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0};
		gridBagLayout.rowHeights = new int[]{47, 79, 20, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		//Text to display flag

		countryFlag = new JLabel("");
		try {
			countryFlag.setIcon(FlagHandler.getScaledFlag("UNST.png", 250));
		} catch (IOException e) {
			countryFlag.setText("");
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
		add(countryFlag, gbc_CountryFlag);


		JLabel speakingCountryName = new JLabel("<html>\n\t<center>\n\t\t<h1>\n\t\t\t<nobr>\n\t\t\t\t" + "United States of America" + "\n\t\t\t</nobr>\n\t\t</h1>\n\t</center>\n</html>");
		speakingCountryName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(speakingCountryName, gbc_lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.insets = new Insets(0, 5, 5, 5);
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 3;
		add(progressBar, gbc_progressBar);
		
		JLabel speakingTime = new JLabel("<html>\n\t<center>\n\t\t<h1>\n\t\t\t<nobr>\n\t\t\t\t00:00 / 00:00\n\t\t\t</nobr>\n\t\t</h1>\n\t</center>\n</html>");
		speakingTime.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 4;
		add(speakingTime, gbc_label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

	}

	void setSpeakingCountry(Country c){
		speakingCountryName.setText("<html>\n\t<center>\n\t\t<h1>\n\t\t\t<nobr>\n\t\t\t\t" + c.getShortName() + "\n\t\t\t</nobr>\n\t\t</h1>\n\t</center>\n</html>");
		try {
			countryFlag.setIcon(FlagHandler.getScaledFlag(c.getFlagName(), 250));
		} catch (IOException e) {
			countryFlag.setText("");
		}

	}

}
