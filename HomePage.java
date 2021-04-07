import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author BrandonHall
 *
 */
public class HomePage extends JPanel implements ActionListener {
	//TODO: Change sort into a JComboBox
	String[] sortTypes = {"Name",  "Type", "Price", "Location", "Rating"};
	
	JComboBox sort = new JComboBox(sortTypes);
	JButton go = new JButton("Go!");
	JButton addEvent = new JButton("Create a new attraction");
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
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
		
		
		
				
		sort.addActionListener(this);
		
		//Adding all of the components to the internal panels
		searchBarPanel.add(bar);
		buttonPanel.add(go);
		buttonPanel.add(sort);
		buttonPanel.add(addEvent);
		addEvent.addActionListener(this);
		bar.setSize(200, 24);
		
		//Aligning all of the internal panels for aesthetic purposes
		bar.setAlignmentX(CENTER_ALIGNMENT);
		go.setAlignmentX(CENTER_ALIGNMENT);
		go.addActionListener(this);
		label.setAlignmentX(CENTER_ALIGNMENT);
		
		//Adding all of the smaller panels and label to the larger JFrame
		search.add(label);
		search.add(searchBarPanel);
		search.add(buttonPanel);
		

		return search;
		
	}
	
	public HomePage() {
		mainPanel.add(searchBar());
		mainFrame.setSize(500, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}
	/**
	 * This method creates a JFrame in which the main JPanel is added.
	 * @param args main parameter for the main method
	 */
	public static void main(String[] args) {
		HomePage home = new HomePage();
	}
	/**
	 * The action listener that will be used for the search button and the sort by menu
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == go) {
			mainFrame.setContentPane(Catalogue.buildCatalogue());
			mainFrame.pack();
		}
		if (e.getSource() == addEvent) {
//			mainPanel.setVisible(false);
			CreatePage c = new CreatePage();
			mainFrame.setContentPane(c.eventAdd());
			mainFrame.pack();
		}
		
		
	}
}
