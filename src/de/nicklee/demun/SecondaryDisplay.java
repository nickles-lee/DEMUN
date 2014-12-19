package de.nicklee.demun;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SecondaryDisplay {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondaryDisplay window = new SecondaryDisplay();
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
	public SecondaryDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void toggleVisibility(){
		if(frame.isVisible())
			frame.setVisible(false);
		else frame.setVisible(true);
	}

	public void dispose() {
		frame.dispose();
		// TODO Auto-generated method stub
		
	}

}
