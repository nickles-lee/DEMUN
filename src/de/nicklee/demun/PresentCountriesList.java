package de.nicklee.demun;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ScrollPaneConstants;

public class PresentCountriesList extends JScrollPane {

	/**
	 * Create the panel.
	 */
	public PresentCountriesList() {
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"USA", "USA", "USA", "Canada"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		setViewportView(list);

	}

}
