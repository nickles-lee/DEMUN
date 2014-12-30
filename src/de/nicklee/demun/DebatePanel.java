package de.nicklee.demun;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;

public class DebatePanel extends JLayeredPane {
	
	private JPanel genSpeaker, moderatedCaucus, unmoderatedCaucus;
	/**
	 * Create the panel.
	 */
	public DebatePanel() {
		setLayout(new CardLayout(0, 0));
		
		genSpeaker = new GenSpeakersListPanel();
		setLayer(genSpeaker, 0);
		add(genSpeaker, "name_4119277201351");
		
		moderatedCaucus = new ModeratedCaucusPanel();
		setLayer(moderatedCaucus, 1);
		add(moderatedCaucus, "name_4119295265475");
		
		unmoderatedCaucus = new JPanel();
		setLayer(unmoderatedCaucus, 0);
		add(unmoderatedCaucus, "name_4119301061815");

		setVisibleDebate("moderated");
	}
	
	public void setVisibleDebate(String type){
		if(type.equals("genSpeaker")){
			this.setLayer(genSpeaker,1);
			this.setLayer(moderatedCaucus, 0);
			this.setLayer(unmoderatedCaucus, 0);
		}
		else if(type.equals("moderated")){
			this.setLayer(genSpeaker, 0);
			this.setLayer(moderatedCaucus, 1);
			this.setLayer(unmoderatedCaucus, 0);
		}
		else if(type.equals("unmoderated")){
			this.setLayer(genSpeaker, 0);
			this.setLayer(moderatedCaucus, 0);
			this.setLayer(unmoderatedCaucus, 1);
		}
		else{
			System.out.println("[ERROR] Invalid debate type");
			this.setLayer(genSpeaker,1);
			this.setLayer(moderatedCaucus, 0);
			this.setLayer(unmoderatedCaucus, 0);
		}
	}

}
