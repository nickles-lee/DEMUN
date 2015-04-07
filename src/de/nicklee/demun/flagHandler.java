package de.nicklee.demun;

import de.nicklee.demun.gui.genspeakerslist.TimerView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class FlagHandler {

    public static ImageIcon getScaledFlag(String flagName, float maxDim) throws IOException {
        Image flagFile = null;
        flagFile = ImageIO.read(TimerView.class.getResource("/de/nicklee/demun/resources/flags/" + flagName));

        if (flagFile.getHeight(null) < flagFile.getWidth(null))
            return new ImageIcon(flagFile = flagFile.getScaledInstance((int) maxDim, (int) (maxDim / flagFile.getWidth(null) * flagFile.getHeight(null)), Image.SCALE_SMOOTH));
        else
            return new ImageIcon(flagFile = flagFile.getScaledInstance((int) (maxDim / flagFile.getHeight(null) * flagFile.getWidth(null)), (int) maxDim, Image.SCALE_SMOOTH));

    }

}
