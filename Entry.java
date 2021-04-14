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

public class Entry extends JPanel implements ActionListener{
	String name, type, dollar;
	JButton visit;
	
	public Entry(String name, String type, String dollar, boolean red) {
		this.name = name;
		this.type = type;
		this.dollar = dollar;
		
		super.setLayout(new GridLayout(3,3));
		JLabel grid1 = new JLabel("Name: ");
		grid1.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		
		JLabel grid2 = new JLabel(name);
		grid2.setFont(new Font ("TimesRoman", Font.BOLD, 17));
		grid2.setForeground(Color.RED.darker());
		JButton grid3_clear = new JButton("");
		grid3_clear.setVisible(false);
		JLabel grid4 = new JLabel("Type: ");
		grid4.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		
		JLabel grid5 = new JLabel(type);
		grid5.setFont(new Font ("TimesRoman", Font.BOLD, 17));
		grid5.setForeground(Color.RED.darker());
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

	@Override
	public void actionPerformed(ActionEvent e) {
		File f = null;
		Scanner s = null;
		try {
			f = new File("data.txt");
			s = new Scanner(f);
			s.useDelimiter("#");
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		String findName = s.next();

		for (int i = 0; i < 5; i++) {
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
		
		Event event = new Event(findName, type, price, url, phoneNum, address, description, imageUrl, map);
		
		
		EventPanelOOP eventpanel= new EventPanelOOP(event.getName(), event.getType(), event.getPrice(), event.getUrl(), event.getPhoneNum(), event.getAddress(), event.getDescription(), event.getImageUrl(), map);
		// TODO Auto-generated method stub
		
	}
}
