import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * This is the Entry class that creates entry events to store the data for the Catalogue event display.
 * @author Zach Katz, Brandon Hall, Hannah Ahlstrom
 * 
 */
public class Entry extends JPanel implements ActionListener{
	String name, type, dollar;
	JButton visit;
	
	/**
	 * This Constructor creates an entry object with the following values
	 * @param String name
	 * @param String type
	 * @param String dollar
	 * @param boolean red
	 */
	public Entry(String name, String type, String dollar, boolean red) {
		this.name = name;
		this.type = type;
		this.dollar = dollar;
		
		super.setLayout(new GridLayout(3,3));
		JLabel grid1 = new JLabel("Name: ");
		grid1.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		grid1.setForeground(Color.GRAY.darker());
		
		JLabel grid2 = new JLabel(name);
		grid2.setFont(new Font ("TimesRoman", Font.BOLD, 17));
		JButton grid3_clear = new JButton("");
		grid3_clear.setVisible(false);
		JLabel grid4 = new JLabel("Type: ");
		grid4.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		grid4.setForeground(Color.GRAY.darker());
		
		JLabel grid5 = new JLabel(type);
		grid5.setFont(new Font ("TimesRoman", Font.BOLD, 17));
		JButton grid6_clear = new JButton("");
		grid6_clear.setVisible(false);
		JLabel grid7 = new JLabel(dollar);
		grid7.setFont(new Font ("TimesRoman", Font.BOLD, 15));
		
		JButton grid8_clear = new JButton("");
		grid8_clear.setVisible(false);
		JButton grid9 = new JButton("Visit");
		grid9.addActionListener(this);
		
		super.add(grid1);
		super.add(grid2);
		super.add(grid3_clear);
		super.add(grid4);
		super.add(grid5);
		super.add(grid6_clear);
		super.add(grid7);
		super.add(grid8_clear);
		super.add(grid9);
		
		Color pink = new Color(255, 192, 203);
		Color very_light_blue = new Color(51,204,255);
		grid9.setBackground(very_light_blue);
		if (red) {
			super.setBackground(pink);
		}
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		super.setBorder(border);
	}

	/**
	 * This method overrides the actionPerformed method to grab values from our data file to call our Event and EventPanel classes
	 * @param ActionEvent
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		File f = null;
		Scanner s = null;
		try {
			f = new File("/Users/BrandonHall/Documents/Development/eclipse/CincySearch/data.txt");
			s = new Scanner(f);
			s.useDelimiter("#");
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		String findName = s.next();

		for (int i = 0; i < 10; i++) {
			if (findName.equals(this.name)) {
				break;
			} else {
				s.nextLine();
				findName = s.next();
			}
		}
		
		String type = s.next();
		String price = s.next();
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
		String url = s.next();
		String phoneNum = s.next();
		String address = s.next();
		String description = s.next();
		String imageUrl = s.next();
		
		EventClass event = new EventClass(findName, type, price, url, phoneNum, address, description, imageUrl, map);
		
		System.out.println(event.getName());
		EventPanelOOP2 eventpanel= new EventPanelOOP2(event.getName(), event.getType(), event.getPrice(), event.getUrl(), event.getPhoneNum(), event.getAddress(), event.getDescription(), event.getImageUrl(), map);
		// TODO Auto-generated method stub
		
	}
	
	
}
