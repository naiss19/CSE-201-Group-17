import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author BrandonHall
 *
 */
public class HomePage extends JPanel implements ActionListener {
	// TODO: Change sort into a JComboBox
	String[] sortTypes = { " ", "Name", "Price" };

	JComboBox sort = new JComboBox(sortTypes);
	JButton go = new JButton("Go!");
	JButton faq = new JButton("FAQ");
	JButton addEvent = new JButton("Create a new attraction");
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	Color pink = new Color(255, 192, 203);
	JTextField bar = new JTextField("Search", 30);

	/**
	 * Creates the home page using a couple JPanels, a JButton, and a JMenu to sort
	 * by a certain criteria
	 * 
	 * @return the home page jpanel
	 */
	public JPanel searchBar() {
		// Creating the main JPanel
		JPanel search = new JPanel();
		search.setLayout(new BoxLayout(search, BoxLayout.Y_AXIS));

		// An internal panel that helps for aesthetics of the home page panel
		JPanel searchBarPanel = new JPanel();
		searchBarPanel.setSize(100, 24);

		// An internal panel that houses the search button and the sort menu
		JPanel buttonPanel = new JPanel();

		// Adding and formatting text for the label and text field

		JLabel label = new JLabel("CincySearch");
		label.setSize(100, 100);
		label.setFont(label.getFont().deriveFont(64.0f));
		label.setFont(new Font("Times New Roman", Font.BOLD, 64));

		sort.addActionListener(this);

		// Adding all of the components to the internal panels
		searchBarPanel.add(bar);
		buttonPanel.add(go);
		buttonPanel.add(sort);
		buttonPanel.add(addEvent);
		buttonPanel.add(faq);
		addEvent.addActionListener(this);
		bar.setSize(200, 24);

		// Aligning all of the internal panels for aesthetic purposes
		bar.setAlignmentX(CENTER_ALIGNMENT);
		go.setAlignmentX(CENTER_ALIGNMENT);
		faq.setAlignmentX(CENTER_ALIGNMENT);
		faq.addActionListener(this);
		go.addActionListener(this);
		label.setAlignmentX(CENTER_ALIGNMENT);

		// Adding all of the smaller panels and label to the larger JFrame
		search.add(label);
		search.add(searchBarPanel);
		search.add(buttonPanel);
		search.setBackground(pink);
		buttonPanel.setBackground(pink);
		searchBarPanel.setBackground(pink);

		return search;

	}

	public void run() {

		mainPanel.add(searchBar());
		mainFrame.setSize(500, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(mainPanel);
		mainPanel.setBackground(pink);
		mainFrame.setVisible(true);
	}

	public void FAQ() {
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		JTextArea t = new JTextArea();
		t.setText("");
		p.add(t);
		j.setVisible(true);
		j.setSize(500, 400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void easterEgg() {

		JFrame easterEgg = new JFrame();
		ImageIcon TA = new ImageIcon("TaEasterEgg.jpg");
		easterEgg.add(new JLabel(TA));
		easterEgg.setSize(TA.getIconHeight(), TA.getIconWidth());
		easterEgg.setVisible(true);
		easterEgg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("It work");

	}

	public static void exactName(String name) throws NoSuchElementException {

		Scanner s = null;
		File f = null;
		String eventName = null;

		


			try {
				f = new File("data.txt");
				s = new Scanner(f);
				s.useDelimiter("#");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 10; i++) {

				eventName = s.next();
				if (eventName.equals(name))
					break;
				else {
					System.out.println(eventName);
					s.nextLine();
				}

			}
			String monday = s.next();
			String tuesday = s.next();
			String wednesday = s.next();
			String thursday = s.next();
			String friday = s.next();
			String saturday = s.next();
			String sunday = s.next();
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("Monday", monday);
			map.put("Tuesday", tuesday);
			map.put("Wednesday", wednesday);
			map.put("Thursday", thursday);
			map.put("Friday", friday);
			map.put("Saturday", saturday);
			map.put("Sunday", sunday);
			EventClass event = new EventClass(eventName, s.next(), s.next(), s.next(), s.next(), s.next(), s.next(),
					s.next(), map);
			EventPanelOOP2 eventpanel = new EventPanelOOP2(event.getName(), event.getType(), event.getPrice(),
					event.getUrl(), event.getPhoneNum(), event.getAddress(), event.getDescription(),
					event.getImageUrl(), map);

		}

	/**
	 * This method creates a JFrame in which the main JPanel is added.
	 * 
	 * @param args main parameter for the main method
	 */
	public static void main(String[] args) {
		HomePage home = new HomePage();
		home.run();
//		exactName("American Sign Museum");
	}

	/**
	 * The action listener that will be used for the search button and the sort by
	 * menu
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == go) {
//			System.out.println(bar.getText());
			if (bar.getText().equals(new String("Search"))) {
				System.out.println("We searchin");
				Catalogue.buildCatalogue(sort.getSelectedIndex());
				mainFrame.setContentPane(Catalogue.cataloguePanel);
				mainFrame.pack();
				return;
			}
			System.out.println(bar.getText());
			exactName(bar.getText());
			if(bar.getText().equals("Patricia Lennon"))
				easterEgg();
		}
		if (e.getSource() == addEvent) {
//			mainPanel.setVisible(false);
			CreatePage c = new CreatePage();
			mainFrame.setContentPane(c.eventAdd());
			mainFrame.pack();
		}
		if (e.getSource() == faq) {
			FAQ();
		}

	}
}
