package de.nicklee.demun;

import de.nicklee.demun.gui.dynamicdebate.TimerView;
import de.nicklee.demun.gui.genspeakerslist.ScrollingListComponent;

import javax.swing.*;
import java.awt.*;

public class SecondaryWindow {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SecondaryWindow window = new SecondaryWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public SecondaryWindow() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 640, 460);
        frame.setMinimumSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        TimerView TimerView = new TimerView();
        frame.getContentPane().add(TimerView);
    }

    public void toggleVisibility() {
        if (frame.isVisible())
            frame.setVisible(false);
        else frame.setVisible(true);
    }

    public void dispose() {
        frame.dispose();
        // TODO Auto-generated method stub

    }

    public static class generalSpeakersCombinedView extends JPanel {

        /**
         * Create the panel.
         */
        public generalSpeakersCombinedView() {
            setLayout(new BorderLayout(0, 0));

            JPanel speakersListView = new ScrollingListComponent();
            add(speakersListView, BorderLayout.EAST);

            JPanel Timer = new de.nicklee.demun.gui.genspeakerslist.TimerView();
            add(Timer, BorderLayout.CENTER);

        }

    }
}
