import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreatePage extends HomePage implements ActionListener {

	HashMap<String, String> hours = new HashMap<String, String>();
	String[] testDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	String[] eventTypes = { "Bar", "Restaurant", "Museum", "Entertainment", "Zoo", "Indoor", "Outdoor" };
	JButton addButton = new JButton("Add Event");
	JButton backButton = new JButton("Back");
	JTextField name = new JTextField(30), price = new JTextField(30), description = new JTextField(30),
			phoneNum = new JTextField(30), link = new JTextField(30), address = new JTextField(30),
			imgUrl = new JTextField(30);
	// TODO: change the JTextfield to JComboBox and create start and end variables
	// for each day
	JTextField mon = new JTextField(30), tue = new JTextField(30), wed = new JTextField(30), thurs = new JTextField(30),
			fri = new JTextField(30), sat = new JTextField(30), sun = new JTextField(30);

	JComboBox type = new JComboBox(eventTypes);

	// All of the labels for the
	JLabel nameLabel = new JLabel("Name:"), priceLabel = new JLabel("Price:"), descLabel = new JLabel("Description:"),
			typeLabel = new JLabel("Type of Attraction:"), phoneLabel = new JLabel("Phone Number:"),
			linkLabel = new JLabel("Link:"), hourLabel = new JLabel("Hours of Operation:"), imgLabel = new JLabel("Image Link:");

	public JPanel eventAdd() {
		JPanel bigPanel = new JPanel(new BorderLayout());
		JPanel addPanel = new JPanel(new GridLayout(8, 2));
		addPanel.add(nameLabel);
		addPanel.add(name);
		addPanel.add(priceLabel);
		addPanel.add(price);
		addPanel.add(descLabel);
		addPanel.add(description);
		addPanel.add(typeLabel);
		addPanel.add(type);
		addPanel.add(phoneLabel);
		addPanel.add(phoneNum);
		addPanel.add(linkLabel);
		addPanel.add(link);
		addPanel.add(imgLabel);
		addPanel.add(imgUrl);
		addPanel.add(hourLabel);

		hourLabel.setAlignmentX(CENTER_ALIGNMENT);
		bigPanel.add(addPanel, BorderLayout.NORTH);
		bigPanel.add(hoursOfOpPanel(), BorderLayout.CENTER);
		bigPanel.add(buttonPanel(), BorderLayout.SOUTH);
		addButton.addActionListener(this);
		backButton.addActionListener(this);
		return bigPanel;

	}

	// TODO make the hoursofOpPanel
	public JPanel hoursOfOpPanel() {

		JPanel opPanel = new JPanel(new GridLayout(7, 2));
		opPanel.add(new JLabel("Monday:"));
		opPanel.add(mon);
		opPanel.add(new JLabel("Tuesday:"));
		opPanel.add(tue);
		opPanel.add(new JLabel("Wednesday:"));
		opPanel.add(wed);
		opPanel.add(new JLabel("Thursday:"));
		opPanel.add(thurs);
		opPanel.add(new JLabel("Friday:"));
		opPanel.add(fri);
		opPanel.add(new JLabel("Saturday:"));
		opPanel.add(sat);
		opPanel.add(new JLabel("Sunday:"));
		opPanel.add(sun);
		return opPanel;
	}

	public JPanel buttonPanel() {
		JPanel j = new JPanel(new BorderLayout());
		j.add(addButton, BorderLayout.CENTER);
		j.add(backButton, BorderLayout.EAST);
		return j;
	}

//	private void test() {
//		
//		for (int i = 0; i < 7; i++)
//			testHours.put(testDays[i],"10:00am-5:00pm");
//	}

	public void addData() {
//		test();
//		hoursToString(hours);
		hourAdd();
		EventClass e = new EventClass(name.getText(), type.getSelectedItem().toString(), price.getText(),
				link.getText(), phoneNum.getText(), address.getText(), description.getText(), imgUrl.getText(),
				getHours());

//		EventClass e = new EventClass("Brandon's Bar", "Bar", "$$$", "www.brandonsbar.com", "6154952722","704 Wesleywood", "It's aight", "www.googleimages.com", testHours);

		try {

			File dataFile = new File("data.txt");
			FileWriter fr = new FileWriter(dataFile, true);
			BufferedWriter br = new BufferedWriter(fr);
			PrintWriter p = new PrintWriter(br);

			p.println(e.getName() + "#" + e.getType() + "#" + hoursToString(e.hours) + e.getUrl() + "#"
					+ e.getPhoneNum() + "#" + e.getAddress() + "#" + e.getDescription() + "#" + e.getImageUrl());
			p.close();
			br.close();
			fr.close();
		} catch (IOException ex) {
			System.out.println("This data file does not exist");
		}

	}

	private String hoursToString(HashMap<String, String> hash) {

		StringBuilder totalHours = new StringBuilder();
		for (String key : hash.keySet())
			totalHours.append(hash.get(key) + "#");

		return totalHours.toString();

	}

	// TODO: make the getHours method
	public HashMap<String, String> getHours() {
		return hours;
	}
	
	private void hourAdd() {
		hours.put("Monday", mon.getText());
		hours.put("Tuesday", mon.getText());
		hours.put("Wednesday", mon.getText());
		hours.put("Thursday", mon.getText());
		hours.put("Friday", mon.getText());
		hours.put("Saturday", mon.getText());
		hours.put("Sunday", mon.getText());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addButton) {
			addData();
		}
		if (e.getSource() == backButton) {
			HomePage h = new HomePage();
			h.run();
			System.out.println("this shit works");
		}
	}
//	public static void main(String[] args) {
//		CreatePage p = new CreatePage();
//		for(int i = 0; i < 10; i++) {
//			p.addData();
//			System.out.println("Data added");
//		}

}
