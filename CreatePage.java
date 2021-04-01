import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreatePage extends JPanel implements ActionListener {
	String[] eventTypes = { "Bar", "Restaurant", "Museum", "Entertainment", "Indoor", "Outdoor" };
	JButton addButton = new JButton("Add Event");
	JTextField name = new JTextField(30), price = new JTextField(30), description = new JTextField(30),
			phoneNum = new JTextField(30), link = new JTextField(30), hoursOfOp = new JTextField(30);
	JComboBox type = new JComboBox(eventTypes);

	//All of the labels for the 
	JLabel nameLabel = new JLabel("Name:"), priceLabel = new JLabel("Price:"), descLabel = new JLabel("Description:"),
			typeLabel = new JLabel("Type of Attraction:"), phoneLabel = new JLabel("Phone Number:"),
			linkLabel = new JLabel("Link:"), hourLabel = new JLabel("Hours of Operation:");


	private class Event {
		String name, type, description, phoneNum, link, hoursOfOp;

		Event() {
			this.name = "Brick Street";
			this.type = "Night Life";
			this.description = "The biggest bar in uptown Oxford";
			this.phoneNum = "614-672-2863";
			this.link = "www.brickstreetbar.com";
		}
	}

	public JPanel eventAdd() {
		JPanel bigPanel = new JPanel(new BorderLayout());
		JPanel addPanel = new JPanel(new GridLayout(7, 2));
		Event newEvent = new Event();
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
		addPanel.add(hoursOfOp);
		bigPanel.add(addPanel, BorderLayout.NORTH);
		bigPanel.add(addButton, BorderLayout.CENTER);
		addButton.addActionListener(this);
		return bigPanel;

	}

	public static void main(String[] args) {
		CreatePage c = new CreatePage();
		JFrame j = new JFrame("Create an event");
		j.setSize(500, 300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.add(c.eventAdd());
		j.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
