import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreatePage extends JPanel implements ActionListener {
	String[] eventTypes = { "Bar", "Restaurant", "Museum", "Entertainment", "Zoo", "Indoor", "Outdoor" };
	JButton addButton = new JButton("Add Event");
	JTextField name = new JTextField(30), price = new JTextField(30), description = new JTextField(30),
			phoneNum = new JTextField(30), link = new JTextField(30), address = new JTextField(30),
			imgUrl = new JTextField(30);
	//TODO: change the JTextfield to JComboBox and create start and end variables for each day
	JTextField mon = new JTextField(30), tue = new JTextField(30), wed = new JTextField(30), thurs = new JTextField(30),
			fri = new JTextField(30), sat = new JTextField(30), sun = new JTextField(30);

	JComboBox type = new JComboBox(eventTypes);

	// All of the labels for the
	JLabel nameLabel = new JLabel("Name:"), priceLabel = new JLabel("Price:"), descLabel = new JLabel("Description:"),
			typeLabel = new JLabel("Type of Attraction:"), phoneLabel = new JLabel("Phone Number:"),
			linkLabel = new JLabel("Link:"), hourLabel = new JLabel("Hours of Operation:");

	public JPanel eventAdd() {
		JPanel bigPanel = new JPanel(new BorderLayout());
		JPanel addPanel = new JPanel(new GridLayout(7, 2));
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
		addPanel.add(hourLabel);
		hourLabel.setAlignmentX(CENTER_ALIGNMENT);
		bigPanel.add(addPanel, BorderLayout.NORTH);
//		bigPanel.add(hoursOfOpPanel(), BorderLayout.CENTER);
		bigPanel.add(addButton, BorderLayout.CENTER);
		addButton.addActionListener(this);
		return bigPanel;

	}

	// TODO make the hoursofOpPanel
	public JPanel hoursOfOpPanel() {
		JPanel opPanel = new JPanel(new GridLayout(7, 1));
		opPanel.add(mon);
		opPanel.add(tue);
		opPanel.add(wed);
		opPanel.add(thurs);
		opPanel.add(fri);
		opPanel.add(sat);
		opPanel.add(sun);
		return opPanel;
	}

	public void addData() {
		EventClass e = new EventClass(name.getText(), type.getSelectedItem().toString(), price.getText(),
				link.getText(), phoneNum.getText(), address.getText(), description.getText(), imgUrl.getText(),
				getHours());

		try {

			File dataFile = new File("/CincySearch/data.txt");
			PrintWriter p = new PrintWriter(dataFile);

			p.write(e.getName() + "#" + e.getType() + "#" + hoursToString(e.hours) + "#" + e.getUrl() + "#"
					+ e.getPhoneNum() + "#" + e.getAddress() + "#" + e.getDescription() + "#" + e.getImageUrl());

		} catch (IOException ex) {
			System.out.println("This data file does not exist");
		}

	}

	public String hoursToString(HashMap<String, String> hash) {
		String totalHours = "";
		Iterator hashIterator = hash.entrySet().iterator();

		while (hashIterator.hasNext()) {
			totalHours += hashIterator.next() + "#";
			hashIterator = (Iterator) hashIterator.next();

		}

		return totalHours;

	}

	// TODO: make the getHours method
	public HashMap<String, String> getHours() {
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addButton) {
			addData();
		}
	}

}
