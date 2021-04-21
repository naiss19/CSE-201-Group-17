import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * This is the Catalogue class that displays all the events the user can view.
 * @author Zach Katz, Brandon Hall, Hannah Ahlstrom
 * 
 */

public class Catalogue {
	static JFrame frame;
	static JPanel cataloguePanel;
	
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setSize(600, 850);
		frame.setTitle("Cincy Catalogue");
		
		buildCatalogue();
		frame.add(cataloguePanel);
		frame.setVisible(true);
	}
	
	/**
	 * This is the method that adds each event to the cataloge JPanel
	 */
	public static void buildCatalogue(int sort) {
		cataloguePanel = new JPanel();
		cataloguePanel.setLayout(new GridLayout(10, 1));
		
		ArrayList<Entry> events = buildEvents(sort);
		
		for (int i = 0; i < 10; i++) {
			cataloguePanel.add(events.get(i));
		}
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
		cataloguePanel.setBorder(border);
	}
	
	/**
	 * This is the method that stores each event in an ArrayList
	 * @return ArrayList<Entry>
	 */
	public static ArrayList<Entry> buildEvents(int sort) {
		File data = null;
		Scanner dataScanner = null;
		try {
			data = new File("data.txt");
			dataScanner = new Scanner(data);
			dataScanner.useDelimiter("#");
		} catch (Exception e) {
			System.out.println("error with file");
			e.printStackTrace();
		}
		ArrayList<Entry> catEntries = null;
		if (sort == -1) {
			catEntries = new ArrayList<Entry>();
			boolean pink;
			for (int i = 0; i < 10; i++) {
				if (i%2 == 0) {
					pink = true;
				} else {
					pink = false;
				}
	
				String name = dataScanner.next();
				String type = dataScanner.next();
				String price = dataScanner.next();
				catEntries.add(new Entry(name, type, price, pink));
				dataScanner.nextLine();		
			}
		}
		else if (sort == 0) {
			catEntries = new ArrayList<Entry>();
			ArrayList<String> used = new ArrayList<String>();
			boolean pink;
			for (int i = 0; i < 10; i++) {
				if (i%2 == 0) {
					pink = true;
				} else {
					pink = false;
				}
				String min_name = "z";
				for (int j = 0; j < 10; j++) {
					String name = dataScanner.next();
					if (min_name.compareTo(name) > 0 && !used.contains(name)) {
						min_name = name;
						// System.out.println(name);
					}
					dataScanner.nextLine();
				}
				used.add(min_name);
				try {
				dataScanner = new Scanner(data);
				dataScanner.useDelimiter("#");
				} catch (FileNotFoundException e) {}
				
				String n = dataScanner.next();
				while (!n.equals(min_name)) {
					System.out.println("n = " + n + ", " + "i = " + i);
					dataScanner.nextLine();
					n = dataScanner.next();
					//System.out.println("min n = " + min_name);
				}
				String cat_name = n;
				String type = dataScanner.next();
				String price = dataScanner.next();
				catEntries.add(new Entry(cat_name, type, price, pink));
				try {
					dataScanner = new Scanner(data);
					dataScanner.useDelimiter("#");
					} catch (FileNotFoundException e) {}
			}
		}
		else if (sort == 1) {
			catEntries = new ArrayList<Entry>();
			ArrayList<String> used = new ArrayList<String>();
			boolean pink;
			for (int i = 0; i < 10; i++) {
				if (i%2 == 0) {
					pink = true;
				} else {
					pink = false;
				}
				String name = null;
				String min_price_name = null;
				String min_price = "%";
				for (int j = 0; j < 10; j++) {
					name = dataScanner.next();
					dataScanner.next();
					String price = dataScanner.next();
					if (min_price.compareTo(price) > 0 && !used.contains(name)) {
						min_price = price;
						min_price_name = name;
						// System.out.println(name);
					}
					dataScanner.nextLine();
				}
				used.add(min_price_name);
				try {
				dataScanner = new Scanner(data);
				dataScanner.useDelimiter("#");
				} catch (FileNotFoundException e) {}
				
				String n = dataScanner.next();
				while (!n.equals(min_price_name)) {
					System.out.println("n = " + n + ", " + "i = " + i);
					dataScanner.nextLine();
					n = dataScanner.next();
					//System.out.println("min n = " + min_name);
				}
				String cat_name = n;
				String type = dataScanner.next();
				String price = dataScanner.next();
				catEntries.add(new Entry(cat_name, type, price, pink));
				try {
					dataScanner = new Scanner(data);
					dataScanner.useDelimiter("#");
					} catch (FileNotFoundException e) {}
			}
		}
		
	
		return catEntries;
	}
}
