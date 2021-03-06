package de.nicklee.demun;

import de.nicklee.demun.gui.committeeSettingsDialog;
import de.nicklee.demun.gui.genspeakerslist.TimerView;
import de.nicklee.demun.gui.mainwindow.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;

import javax.swing.JTabbedPane;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JSeparator;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	protected JPanel contentPane;
	private static CommitteeState commState;
	private SecondaryWindow secondWindow;
	private HeaderBar headerBar;
	private MainWindow selfReference;
	private JMenuItem menuItem_topicA, menuItem_topicB;
	private DynamicDebateConsole currentDynamicDebateConsole;
	private GeneralSpeakersConsole generalSpeakersList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
    	System.setProperty("apple.laf.useScreenMenuBar", "true");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		selfReference = this;
		commState = new CommitteeState();
		secondWindow = new SecondaryWindow();

		setTitle("DEMUN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 740);
        setMinimumSize(new Dimension(950, 740));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Import Committee");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Export Committee");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Import Custom Delegations");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Export Custom Delegations");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JCheckBoxMenuItem mntmNewMenuItem_8 = new JCheckBoxMenuItem("Enable Secondary Window");
		mntmNewMenuItem_8.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				secondWindow.toggleVisibility();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Export Committee Log");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondWindow.dispose();
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Committee");
		menuBar.add(mnNewMenu_1);
		
		JMenu topicSelectMenu = new JMenu("Select Topic");
		mnNewMenu_1.add(topicSelectMenu);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("General Discussion");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommitteeState.setCurrentTopic("General Discussion");
				selfReference.update();
			}
		});
		topicSelectMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Agenda Setting");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommitteeState.setCurrentTopic("Agenda Setting");
				selfReference.update();
			}
		});
		topicSelectMenu.add(mntmNewMenuItem_12);
		
		menuItem_topicA = new JMenuItem("Topic A: " + CommitteeState.getTopic1());
		menuItem_topicA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommitteeState.setCurrentTopic(CommitteeState.getTopic1());
				selfReference.update();
			}
		});
		topicSelectMenu.add(menuItem_topicA);
		
		menuItem_topicB = new JMenuItem("Topic B: " + CommitteeState.getTopic2());
		menuItem_topicB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommitteeState.setCurrentTopic(CommitteeState.getTopic2());
				selfReference.update();
			}
		});
		topicSelectMenu.add(menuItem_topicB);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Take Roll Call");
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Committee Settings");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new committeeSettingsDialog(commState, selfReference);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmViewCommitteeLog = new JMenuItem("View Committee Log");
		mnNewMenu_1.add(mntmViewCommitteeLog);
		contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{1000, 0};
		gbl_contentPane.rowHeights = new int[]{75, 400, 200, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 3.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		headerBar = new HeaderBar(commState);
		headerBar.setPreferredSize(new Dimension(560, 75));
		headerBar.setMinimumSize(new Dimension(560, 75));
		headerBar.setMaximumSize(new Dimension(2147483647, 75));
		GridBagConstraints gbc_headerBar = new GridBagConstraints();
		gbc_headerBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_headerBar.insets = new Insets(0, 10, 5, 0);
		gbc_headerBar.gridx = 0;
		gbc_headerBar.gridy = 0;
		contentPane.add(headerBar, gbc_headerBar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				update();
			}
		});
		tabbedPane.setMinimumSize(new Dimension(560, 400));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 0);
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		generalSpeakersList = new GeneralSpeakersConsole();
		tabbedPane.addTab("General Speakers List", null, generalSpeakersList, null);
				
				JPanel singleSpeaker = new JPanel();
				tabbedPane.addTab("Single Speaker", null, singleSpeaker, null);
				singleSpeaker.setLayout(new BorderLayout(0, 0));
				
				TimerView singleSpeakerTimer = new TimerView();
				GridBagLayout gbl_singleSpeakerTimer = (GridBagLayout) singleSpeakerTimer.getLayout();
				gbl_singleSpeakerTimer.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
				gbl_singleSpeakerTimer.rowHeights = new int[]{47, 79, 20, 0, 0, 0};
				gbl_singleSpeakerTimer.columnWeights = new double[]{1.0};
				gbl_singleSpeakerTimer.columnWidths = new int[]{0};
				singleSpeaker.add(singleSpeakerTimer, BorderLayout.CENTER);
				
				SingleSpeakerConsole singleSpeakerConsole = new SingleSpeakerConsole();
				singleSpeaker.add(singleSpeakerConsole, BorderLayout.EAST);
				
				currentDynamicDebateConsole = new DynamicDebateConsole();
				tabbedPane.addTab("Current Debate", null, currentDynamicDebateConsole, null);
				
				RollcallVoteConsole rollcallVoteConsole = new RollcallVoteConsole();
				tabbedPane.addTab("Roll Call Vote", null, rollcallVoteConsole, null);
		
		MotionManager motionManager = new MotionManager();
		motionManager.setMinimumSize(new Dimension(710, 250));
		motionManager.setMaximumSize(new Dimension(2147483647, 500));
		GridBagConstraints gbc_motionManager = new GridBagConstraints();
		gbc_motionManager.fill = GridBagConstraints.BOTH;
		gbc_motionManager.gridx = 0;
		gbc_motionManager.gridy = 2;
		contentPane.add(motionManager, gbc_motionManager);
		update();
	}
	
	public static CommitteeState getCommState(){if(commState != null) return commState; else return new CommitteeState();}
	public void update(){
		headerBar.update();
		menuItem_topicA.setText("Topic A: " + CommitteeState.getTopic1());
		menuItem_topicB.setText("Topic B: " + CommitteeState.getTopic2());
		DynamicDebateConsole.update();
		generalSpeakersList.update();
	}
}
