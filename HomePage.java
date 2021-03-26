import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author BrandonHall
 *
 */
public class HomePage extends JPanel implements ActionListener{
	//public static Event[] eventList = new Event[1]; 
	/**
	 * 
	 * Inner class that is used to test the UI and eventList iteration.
	 *
	 */
	private class Event {
		String name, type, description, phoneNum, link;
		Event() {
			this.name = "Brick Street";
			this.type = "Night Life";
			this.description = "The biggest bar in uptown Oxford";
			this.phoneNum = "614-672-2863";
			this.link = "www.brickstreetbar.com";
		}
	}
	/**
	 * Creates the home page using a couple JPanels, a JButton, and a JMenu to sort by a certain criteria
	 * @return the home page jpanel
	 */
	public JPanel searchBar() {
		//Creating the main JPanel
		JPanel search = new JPanel();
		search.setLayout(new BoxLayout(search, BoxLayout.Y_AXIS));
		
		//An internal panel that helps for aesthetics of the home page panel
		JPanel searchBarPanel = new JPanel();
		searchBarPanel.setSize(100,24);
		
		//An internal panel that houses the search button and the sort menu
		JPanel buttonPanel = new JPanel();
		
		//Adding and formatting text for the label and text field
		JTextField bar = new JTextField("Search", 30);
		JLabel label = new JLabel("CincySearch");
		label.setSize(100, 100);
		label.setFont (label.getFont ().deriveFont (64.0f));
		label.setFont(new Font("Times New Roman", Font.BOLD, 64));
		
		JButton go = new JButton("Go!");
		
		//Creating the JMenu and adding JMenuItems for the sort menu
		JMenu sort = new JMenu("Sort by:");
		JMenuItem m1 = new JMenuItem("Name");
		JMenuItem m2 = new JMenuItem("Type");
		JMenuItem m3 = new JMenuItem("Price");
		JMenuItem m4 = new JMenuItem("Location");
		JMenuItem m5 = new JMenuItem("Rating");
		sort.add(m1); sort.add(m2);	sort.add(m3); sort.add(m4);	sort.add(m5);
		sort.addActionListener(this);
		
		//Adding all of the components to the internal panels
		searchBarPanel.add(bar);
		buttonPanel.add(go);
		buttonPanel.add(sort);
		bar.setSize(200, 24);
		
		//Aligning all of the internal panels for aesthetic purposes
		bar.setAlignmentX(CENTER_ALIGNMENT);
		go.setAlignmentX(CENTER_ALIGNMENT);
		label.setAlignmentX(CENTER_ALIGNMENT);
		
		//Adding all of the smaller panels and label to the larger JFrame
		search.add(label);
		search.add(searchBarPanel);
		search.add(buttonPanel);
		

		return search;
		
	}
	/**
	 * This method creates a JFrame in which the main JPanel is added.
	 * @param args main parameter for the main method
	 */
	public static void main(String[] args) {
		HomePage p = new HomePage();
		JFrame mainFrame = new JFrame();
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(p.searchBar());
		mainFrame.setSize(1000, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
		
		
	}
	/**
	 * The action listener that will be used for the search button and the sort by menu
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
