
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

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;


public class EventPanel extends JFrame{

	private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	   private JLabel msglabel;
	   
	   public EventPanel(){
		   eventSetup();
	   }
	   public static void main(String[] args){
		  EventPanel eventGUI = new EventPanel();  
	      eventGUI.showGridLayoutDemo();       
	   }
	
	   public void eventSetup() {
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
		   
		  // Row one in grid layout
	      headerLabel.setText("Brick Street");
	      headerLabel.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 100));
	      headerLabel.setForeground(Color.RED.darker());
	      
	      
	    

	      //****************************************************** row 3 in grid layout
	      //link, number, address
	      JPanel panel = new JPanel();
	      panel.setSize(800, 500);
	      Color navy = new Color(0, 0, 204); 
	      
	      panel.setLayout(new GridLayout(9,1));     
	      

	      //Type      
	      JLabel type = new JLabel("", JLabel.CENTER);
	      type.setText("Venue Type: ");
	      type.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      type.setForeground(Color.BLACK);
	      panel.add(type);
	      JLabel eventType = new JLabel("", JLabel.CENTER);
	      eventType.setText("bar");
	      eventType.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventType.setForeground(Color.black);
	      panel.add(eventType);
	      
	      //Price 
	      JLabel price = new JLabel("", JLabel.CENTER);
	      price.setText("Price: ");
	      price.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      price.setForeground(Color.BLACK);
	      panel.add(price);
	      JLabel eventPrice = new JLabel("", JLabel.CENTER);
	      eventPrice.setText("$$");
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
	      eventWeblink.setText("https://brickstreetoxford.com/");
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
	      eventContact.setText("(513) 280-6341");
	      eventContact.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventContact.setForeground(navy);
	      panel.add(eventContact);
	      
	      //Address
	      JLabel address = new JLabel("", JLabel.CENTER);
	      address.setText("Venue Address: ");
	      address.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      address.setForeground(Color.BLACK);
	      panel.add(address);
	      JLabel eventAddress= new JLabel("", JLabel.CENTER);
	      eventAddress.setText("36 E. High Street, Oxford, Ohio, 45056 USA");
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
	      eventHours.setText("5:00pm - 2:00am");
	      eventHours.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventHours.setForeground(navy);
	      panel.add(eventHours);
	      
	      //Hours
	      JLabel description = new JLabel("", JLabel.CENTER);
	      description.setText("About: ");
	      description.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      description.setForeground(Color.BLACK);
	      panel.add(description);
	      JLabel eventDescription= new  JLabel("", JLabel.CENTER);
	      eventDescription.setText("Oxford’s premiere bar and music venue.");
	      eventDescription.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      eventDescription.setForeground(Color.black);
	      panel.add(eventDescription);

	      controlPanel.add(panel);
	      
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
	      
	      //Row two in grid layout
	      //image, type, price 
	      JPanel img = new JPanel();
	      img.setSize(100,100);
	      
	      img.setLayout(new GridLayout(1, 2));   
	      
	      //image
	      String path = "https://brickstreetoxford.com/wp-content/uploads/2020/04/BrickStreetLogo_Transparent-300x178.png";
	      URL url;
	      BufferedImage image = null;
	      
	      try {
	    	url= new URL(path);
	    	image = ImageIO.read(url);
	      } catch (IOException exception) {	  
	      }
	      
	      JLabel label = new JLabel(new ImageIcon(image));
	      mainFrame.getContentPane().add(label);
	      mainFrame.pack();
	      mainFrame.setVisible(true); 
	      
	   }
}
