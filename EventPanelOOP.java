import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Button;  
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import org.w3c.dom.events.Event;


public class EventPanelOOP extends JFrame{

	   private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
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
	   
	   public EventPanelOOP(String name, String type, String price, String url, String phoneNum, String address, String description, String imageUrl, HashMap<String, String> hours){
		   //initializing variables from passed in Event object 
		   this.name=name;
		   this.type=type;
		   this.price=price;
		   this.url=url;
		   this.phoneNum= phoneNum;
		   this.address= address;
		   this.description = description;
		   this.imageUrl = imageUrl;
		   this.hours = hours;
		   
		   //getting day and hours from hashmap
		   hoursString = "Sunday: " + hours.get("Sunday") + " ";
		   hoursString += "Monday: " + hours.get("Monday") + " ";
		   hoursString += "Tuesday: " + hours.get("Tuesday") + " ";
		   hoursString += "Wednesday: " + hours.get("Wednesday") + " ";
		   hoursString += "Thursday: " + hours.get("Thursday") + " ";
		   hoursString += "Friday: " + hours.get("Friday") + " ";
		   hoursString += "Saturday: " + hours.get("Saturday") + " ";
		   
		   eventSetup();
		   showGridLayoutDemo();
	   }
//	   public static void main(String[] args){
//		   System.out.print("type " + type);
//		   //displaying the event panel
//		  EventPanel eventGUI = new EventPanel();  
//	      eventGUI.showGridLayoutDemo();       
//	   }
	
	   public void eventSetup() {
		   
		  //setting up JFrame
		  mainFrame = new JFrame("CincySearch: Event");
	      mainFrame.setSize(1500,900);
	      mainFrame.setLayout(new GridLayout(2, 1));

	      headerLabel = new JLabel("",JLabel.CENTER );
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.setVisible(true);  
	   }
	 
	   void showGridLayoutDemo(){
		   
		  // Row one in grid layout, Event Name
	      headerLabel.setText(name);
	      headerLabel.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 100));
	      headerLabel.setForeground(Color.RED.darker());
	      
	      //link, number, address
	      JPanel panel = new JPanel();
	      panel.setSize(800, 500);
	      Color navy = new Color(0, 0, 204); 
	      
	      panel.setLayout(new GridLayout(9,1));     
	      

	      //Type      
	      JLabel typeLabel = new JLabel("", JLabel.CENTER);
	      typeLabel.setText("Venue Type: ");
	      typeLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      typeLabel.setForeground(Color.BLACK);
	      panel.add(typeLabel);
	      JLabel eventType = new JLabel("", JLabel.CENTER);
	      eventType.setText(type);
	      eventType.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventType.setForeground(Color.black);
	      panel.add(eventType);
	      
	      //Price 
	      JLabel priceLabel = new JLabel("", JLabel.CENTER);
	      priceLabel.setText("Price: ");
	      priceLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      priceLabel.setForeground(Color.BLACK);
	      panel.add(priceLabel);
	      JLabel eventPrice = new JLabel("", JLabel.CENTER);
	      eventPrice.setText(price);
	      eventPrice.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventPrice.setForeground(Color.black);
	      panel.add(eventPrice);

	      // Website info
	      JLabel weblink = new JLabel("", JLabel.CENTER);
	      weblink.setText("Visit the Website: ");
	      weblink.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      weblink.setForeground(Color.BLACK);
	      panel.add(weblink);
	      JLabel eventWeblink = new JLabel("", JLabel.CENTER);
	      eventWeblink.setText(url);
	      eventWeblink.setFont(new Font ("TimesRoman", Font.ITALIC, 20));
	      eventWeblink.setForeground(navy);
	      panel.add(eventWeblink);
	      
	      //Phone number
	      JLabel contact = new JLabel("", JLabel.CENTER);
	      contact.setText("Contact the Venue: ");
	      contact.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      contact.setForeground(Color.BLACK);
	      panel.add(contact);
	      JLabel eventContact= new JLabel("", JLabel.CENTER);
	      eventContact.setText(phoneNum);
	      eventContact.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventContact.setForeground(navy);
	      panel.add(eventContact);
	      
	      //Address
	      JLabel addressLabel = new JLabel("", JLabel.CENTER);
	      addressLabel.setText("Venue Address: ");
	      addressLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      addressLabel.setForeground(Color.BLACK);
	      panel.add(addressLabel);
	      JLabel eventAddress= new JLabel("", JLabel.CENTER);
	      eventAddress.setText(address);
	      eventAddress.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventAddress.setForeground(navy);
	      panel.add(eventAddress);
	      
	      //Hours
	      JLabel hours = new JLabel("", JLabel.CENTER);
	      hours.setText("Hours: ");
	      hours.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      hours.setForeground(Color.BLACK);
	      panel.add(hours);
	      JLabel eventHours= new JLabel("", JLabel.CENTER);
	      eventHours.setText(hoursString);
	      eventHours.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventHours.setForeground(navy);
	      panel.add(eventHours);
	      
	      //description 
	      JLabel descriptionLabel = new JLabel("", JLabel.CENTER);
	      descriptionLabel.setText("About: ");
	      descriptionLabel.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      descriptionLabel.setForeground(Color.BLACK);
	      panel.add(descriptionLabel);
	      JLabel eventDescription= new  JLabel("", JLabel.CENTER);
	      eventDescription.setText(description);
	      eventDescription.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventDescription.setForeground(Color.black);
	      panel.add(eventDescription);

	      controlPanel.add(panel);
	      
	      
	      // possible text area for description
//	      JPanel textPanel = new JPanel();
//	      textPanel.setSize(800, 500);
//	      panel.setLayout(new GridLayout(9,1));    
//	      
//	      JTextArea eventDescription= new  JTextArea(30,40);
//	      eventDescription.setText("Oxford’s premiere bar and music venue.");
//	      eventDescription.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
//	      eventDescription.setForeground(Color.black);
//	      panel.add(eventDescription);
//	      
//	      controlPanel.add(textPanel);
	     
	      JPanel img = new JPanel();
	      img.setSize(100,100);
	      
	      img.setLayout(new GridLayout(1, 2));   
	      
	      //image
	      String path = imageUrl;
	      URL url;
	      BufferedImage image = null;
	      
	      try {
	    	url= new URL(path);
	    	image = ImageIO.read(url);
	      } catch (IOException exception) {	  
	      }
	      
	      JLabel label = new JLabel(new ImageIcon(image));
	      mainFrame.getContentPane().add(label);
	      //mainFrame.pack();
	      mainFrame.setVisible(true); 
	      
	   }
}
