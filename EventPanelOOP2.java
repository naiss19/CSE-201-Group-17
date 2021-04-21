import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This is the Event Panel class that displays Events and all their information dynamically by using object-oriented programming
 * @author Zach Katz, Brandon Hall, Hannah Ahlstrom
 * 
 */
public class EventPanelOOP2 extends JFrame{
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel basePanel;
	private JLabel msglabel;

	private String name;
	private String type;
	private String price;
	private String url;
	private String phoneNum;
	private String address;
	private String description;
	private String imageUrl;
	private String hoursString;
	private HashMap<String, String> hours;

	/**
	 * This constructor creates the base panel and initializes local variables
	 * @param headerLabel
	 * @param name
	 * @param type
	 * @param price
	 * @param url
	 * @param phoneNum
	 * @param address
	 * @param description
	 * @param imageUrl
	 * @param hoursString
	 * @param hours
	 */
	public EventPanelOOP2(String name, String type, String price, String url, String phoneNum, String address,
			String description, String imageUrl, HashMap<String, String> hours) {

		this.name = name;
		this.type = type;
		this.price = price;
		this.url = url;
		this.phoneNum = phoneNum;
		this.address = address;
		this.description = description;
		this.imageUrl = imageUrl;
		this.hoursString = "";
		this.hours = hours;

		hoursString = "Sunday: " + hours.get("Sunday") + " ";
		hoursString += "Monday: " + hours.get("Monday") + " ";
		hoursString += "Tuesday: " + hours.get("Tuesday") + " ";
		hoursString += "Wednesday: " + hours.get("Wednesday") + " ";
		hoursString += "Thursday: " + hours.get("Thursday") + " ";
		hoursString += "Friday: " + hours.get("Friday") + " ";
		hoursString += "Saturday: " + hours.get("Saturday") + " ";
		
		basePanel = new JPanel(new GridLayout(2,1));
		
		basePanel.add(titlePanel());
		
		basePanel.add(labelPanel());
		this.setSize(1000, 800);
		this.add(basePanel);
		this.setVisible(true);
		
	}

	/**
	 * This method creates the events title
	 * @return JPanel
	 */
	public JPanel titlePanel() {
		JPanel j = new JPanel(new GridLayout(1, 2));
		j.add(addImg());
		System.out.println(name);
		headerLabel = new JLabel(name);
//		headerLabel.setText("Brick Street");
		headerLabel.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 80));
		headerLabel.setForeground(Color.RED.darker());

		j.add(headerLabel);
		return j;

	}

	/**
	 * This method creates the labels with all the event information
	 * @return JPanel
	 */
	public JPanel labelPanel() {
		JPanel l = new JPanel(new GridLayout(9, 2));
		l.setSize(800, 500);
	    Color navy = new Color(0, 0, 204); 
	    JLabel typeLabel = new JLabel("", JLabel.RIGHT);
	      typeLabel.setText("Venue Type: ");
	      typeLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      typeLabel.setForeground(Color.BLACK);
	      l.add(typeLabel);
	      JLabel eventType = new JLabel("", JLabel.LEFT);
	      eventType.setText(type);
	      eventType.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventType.setForeground(Color.black);
	      l.add(eventType);
	      
	      //Price 
	      JLabel priceLabel = new JLabel("", JLabel.RIGHT);
	      priceLabel.setText("Price: ");
	      priceLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      priceLabel.setForeground(Color.BLACK);
	      l.add(priceLabel);
	      JLabel eventPrice = new JLabel("", JLabel.LEFT);
	      eventPrice.setText(price);
	      eventPrice.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventPrice.setForeground(Color.black);
	      l.add(eventPrice);

	      // Website info
	      JLabel weblink = new JLabel("", JLabel.RIGHT);
	      weblink.setText("Visit the Website: ");
	      weblink.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      weblink.setForeground(Color.BLACK);
	      l.add(weblink);
	      JLabel eventWeblink = new JLabel("", JLabel.LEFT);
	      eventWeblink.setText(url);
	      eventWeblink.setFont(new Font ("TimesRoman", Font.ITALIC, 20));
	      eventWeblink.setForeground(navy);
	      l.add(eventWeblink);
	      
	      //Phone number
	      JLabel contact = new JLabel("", JLabel.RIGHT);
	      contact.setText("Contact the Venue: ");
	      contact.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      contact.setForeground(Color.BLACK);
	      l.add(contact);
	      JLabel eventContact= new JLabel("", JLabel.LEFT);
	      eventContact.setText(phoneNum);
	      eventContact.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventContact.setForeground(navy);
	      l.add(eventContact);
	      
	      //Address
	      JLabel addressLabel = new JLabel("", JLabel.RIGHT);
	      addressLabel.setText("Venue Address: ");
	      addressLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      addressLabel.setForeground(Color.BLACK);
	      l.add(addressLabel);
	      JLabel eventAddress= new JLabel("", JLabel.LEFT);
	      eventAddress.setText(address);
	      eventAddress.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventAddress.setForeground(navy);
	      l.add(eventAddress);
	      
	      //Hours
	      JLabel hours = new JLabel("", JLabel.RIGHT);
	      hours.setText("Hours: ");
	      hours.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      hours.setForeground(Color.BLACK);
	      l.add(hours);
	      JLabel eventHours= new JLabel("", JLabel.LEFT);
	      eventHours.setText(hoursString);
	      eventHours.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventHours.setForeground(navy);
	      l.add(eventHours);
	      
	      //description 
	      JLabel descriptionLabel = new JLabel("", JLabel.RIGHT);
	      descriptionLabel.setText("About: ");
	      descriptionLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      descriptionLabel.setForeground(Color.BLACK);
	      l.add(descriptionLabel);
	      JLabel eventDescription= new  JLabel("", JLabel.LEFT);
	      eventDescription.setText(description);
	      eventDescription.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventDescription.setForeground(Color.black);
	      l.add(eventDescription);
		return l;

	}

	/**
	 * This method creates the image label to display the logo of the Event
	 * @return JLabel
	 */
	JLabel addImg() {

		// image
		String path = imageUrl;
		System.out.println(path);
		URL url;
		BufferedImage image = null;

		try {
			url = new URL(path);
			image = ImageIO.read(url);
			image = resize(image, 400, 300);
		} catch (IOException exception) {
		}

		JLabel label = new JLabel(new ImageIcon(image));
		this.getContentPane().add(label);
		this.pack();
		return label;

	}
	
	/**
	 * This method resizes the image created to a specific size
	 * @param BufferedImage img
	 * @param int newW
	 * @param int newH
	 * @return BufferedImage
	 */
	public static BufferedImage resize(BufferedImage img, int newW, int newH) { 
	    Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
	    BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2d = dimg.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();

	    return dimg;
	}  
}
