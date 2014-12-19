package de.nicklee.demun;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class flagHandler {

	public static ImageIcon getScaledFlag(String flagName, float maxDim) throws IOException{
		Image flagFile = null;
		flagFile = ImageIO.read(GenSpeakerTimer.class.getResource("/de/nicklee/demun/flags/" + flagName));
		
		if(flagFile.getHeight(null) < flagFile.getWidth(null))
			return new ImageIcon(flagFile = flagFile.getScaledInstance((int) maxDim, (int)(maxDim/flagFile.getWidth(null) * flagFile.getHeight(null)), Image.SCALE_SMOOTH));
		else
			return new ImageIcon(flagFile = flagFile.getScaledInstance((int)(maxDim/flagFile.getHeight(null) * flagFile.getWidth(null)), (int) maxDim, Image.SCALE_SMOOTH));
		
	}
	
}
