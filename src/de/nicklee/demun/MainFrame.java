package de.nicklee.demun;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;

import java.awt.GridBagLayout;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

	protected JPanel contentPane;
	private static CommitteeState commState;
	private SecondaryDisplay secondWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
    	System.setProperty("apple.laf.useScreenMenuBar", "true");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		commState = new CommitteeState();
		secondWindow = new SecondaryDisplay();

		setTitle("DEMUN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 740);
        setMinimumSize(new Dimension(950, 700));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Import Committee");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Export Committee");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Create Committee");
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Modify Committee");
		mnNewMenu.add(mntmNewMenuItem_7);
		
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
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Undefined");
		topicSelectMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Agenda Setting");
		topicSelectMenu.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Topic A: $SHORTNAME$");
		topicSelectMenu.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Topic B: $SHORTNAME$");
		topicSelectMenu.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Take Roll Call");
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
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
		
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.setPreferredSize(new Dimension(560, 75));
		headerPanel.setMinimumSize(new Dimension(560, 75));
		headerPanel.setMaximumSize(new Dimension(2147483647, 75));
		headerPanel.setTopic(commState.currentTopic);
		headerPanel.setCommittee(commState.committeeName);
		headerPanel.setPresentStats(5,18);
		GridBagConstraints gbc_headerPanel = new GridBagConstraints();
		gbc_headerPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_headerPanel.insets = new Insets(0, 0, 5, 0);
		gbc_headerPanel.gridx = 0;
		gbc_headerPanel.gridy = 0;
		contentPane.add(headerPanel, gbc_headerPanel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setMinimumSize(new Dimension(560, 400));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 0);
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		GenSpeakersListPanel generalSpeakersList = new GenSpeakersListPanel();
		tabbedPane.addTab("General Speakers List", null, generalSpeakersList, null);
				
				JPanel singleSpeaker = new JPanel();
				tabbedPane.addTab("Single Speaker", null, singleSpeaker, null);
				singleSpeaker.setLayout(new BorderLayout(0, 0));
				
				GenSpeakerTimer singleSpeakerTimer = new GenSpeakerTimer();
				GridBagLayout gbl_singleSpeakerTimer = (GridBagLayout) singleSpeakerTimer.getLayout();
				gbl_singleSpeakerTimer.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
				gbl_singleSpeakerTimer.rowHeights = new int[]{47, 79, 20, 0, 0, 0};
				gbl_singleSpeakerTimer.columnWeights = new double[]{1.0};
				gbl_singleSpeakerTimer.columnWidths = new int[]{0};
				singleSpeaker.add(singleSpeakerTimer, BorderLayout.CENTER);
				
				SingleSpeakerControlPanel singleSpeakerControlPanel = new SingleSpeakerControlPanel();
				singleSpeaker.add(singleSpeakerControlPanel, BorderLayout.EAST);
				
				DebatePanel CurrentDebatePanel = new DebatePanel();
				tabbedPane.addTab("Current Debate", null, CurrentDebatePanel, null);
		
		MotionPanel motionManager = new MotionPanel();
		motionManager.setMinimumSize(new Dimension(710, 250));
		motionManager.setMaximumSize(new Dimension(2147483647, 500));
		GridBagConstraints gbc_motionManager = new GridBagConstraints();
		gbc_motionManager.fill = GridBagConstraints.BOTH;
		gbc_motionManager.gridx = 0;
		gbc_motionManager.gridy = 2;
		contentPane.add(motionManager, gbc_motionManager);
	}
	
	public static CommitteeState getCommState(){if(commState != null) return commState; else return new CommitteeState();}
	
}
