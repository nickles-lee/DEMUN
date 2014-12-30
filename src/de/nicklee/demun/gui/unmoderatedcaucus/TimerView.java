package de.nicklee.demun.gui.unmoderatedcaucus;

import javax.swing.*;
import java.awt.*;

public class TimerView extends JPanel {

    /**
     * Create the panel.
     */
    public TimerView() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 0};
        gridBagLayout.rowHeights = new int[]{47, 79, 20, 0, 0, 0, 0, -8, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);
        JLabel lblNewLabel_2 = new JLabel("");
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2.gridx = 0;
        gbc_lblNewLabel_2.gridy = 0;
        add(lblNewLabel_2, gbc_lblNewLabel_2);

        JLabel lblNewLabel = new JLabel("<html>\n\t<center>\n\t\t<h1>\n\t\t\t<nobr>\n\t\t\t\tUnmoderated Caucus\n\t\t\t</nobr>\n\t\t</h1>\n\t</center>\n</html>");
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

        JLabel lblNewLabel_1 = new JLabel("");
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
        gbc_lblNewLabel_1.gridx = 0;
        gbc_lblNewLabel_1.gridy = 7;
        add(lblNewLabel_1, gbc_lblNewLabel_1);

    }

}
