
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

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;


public class Event extends JFrame{

	private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	   private JLabel msglabel;
	   
	   public Event(){
		   eventSetup();
	   }
	   public static void main(String[] args){
		   Event eventGUI = new Event();  
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
	 
	   private void showGridLayoutDemo(){
		   
		  // Row one in grid layout
	      headerLabel.setText("Brick Street");
	      headerLabel.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 100));
	      headerLabel.setForeground(Color.RED.darker());
	      
	      
	      //Row two in grid layout
	      //image, type, price 
	      JPanel img = new JPanel();
	      img.setBackground(Color.white);
	      img.setSize(300,300);
	      Color navy = new Color(0, 0, 204); 
	      
	      img.setLayout(new GridLayout(1, 2));   
	      
	      //image
	      BufferedImage myPicture;
	      JLabel picLabel;
	      
	      try {
			myPicture = ImageIO.read(new File("brick.png"));
			picLabel = new JLabel(new ImageIcon(myPicture));
			img.add(picLabel);
	      } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	      }
	      
	      //Type
	      
	      JLabel type = new JLabel("", JLabel.CENTER);
	      type.setText("Venue Type: ");
	      type.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      type.setForeground(Color.BLACK);
	      img.add(type);
	      JLabel bar = new JLabel("", JLabel.CENTER);
	      bar.setText("bar");
	      bar.setFont(new Font ("TimesRoman", Font.ITALIC, 20));
	      bar.setForeground(navy);
	      img.add(bar);
	      
	      //Price 
	      JLabel p1 = new JLabel("", JLabel.CENTER);
	      p1.setText("Price: ");
	      p1.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      p1.setForeground(Color.BLACK);
	      img.add(p1);
	      JLabel p2 = new JLabel("", JLabel.CENTER);
	      p2.setText("$$");
	      p2.setFont(new Font ("TimesRoman", Font.ITALIC, 20));
	      p2.setForeground(navy);
	      img.add(p2);
	      
	      controlPanel.add(img);

	      
	      //****************************************************** row 3 in grid layout
	      //link, number, address
	      JPanel panel = new JPanel();
	      panel.setBackground(Color.white);
	      panel.setSize(500, 500);
	      
	      panel.setLayout(new GridLayout(9,1));     

	      // Website info
	      JLabel web = new JLabel("", JLabel.CENTER);
	      web.setText("Visit the Website: ");
	      web.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      web.setForeground(Color.BLACK);
	      panel.add(web);
	      JLabel link = new JLabel("", JLabel.CENTER);
	      link.setText("https://brickstreetoxford.com/");
	      link.setFont(new Font ("TimesRoman", Font.ITALIC, 20));
	      link.setForeground(navy);
	      panel.add(link);
	      
	      //Phone number
	      JLabel num = new JLabel("", JLabel.CENTER);
	      num.setText("Contact the Venue: ");
	      num.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      num.setForeground(Color.BLACK);
	      panel.add(num);
	      JLabel contact= new JLabel("", JLabel.CENTER);
	      contact.setText("(513) 280-6341");
	      contact.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      contact.setForeground(navy);
	      panel.add(contact);
	      
	      //Address
	      JLabel location = new JLabel("", JLabel.CENTER);
	      location.setText("Venue Address: ");
	      location.setFont(new Font ("TimesRoman", Font.BOLD, 20));
	      location.setForeground(Color.BLACK);
	      panel.add(location);
	      JLabel address= new JLabel("", JLabel.CENTER);
	      address.setText("36 E. High Street, Oxford, Ohio, 45056 USA");
	      address.setFont(new Font ("TimesRoman", Font.PLAIN, 20));
	      address.setForeground(navy);
	      panel.add(address);

	      controlPanel.add(panel);

	      
	      //****************************************************** row 4 in grid layout
	      JPanel description = new JPanel();
	      description.setBackground(Color.RED.darker());
	      description.setSize(900,900);
	      description.setLayout(new GridLayout(9,1));     
	      
	      JLabel blurb = new JLabel(" Oxford’s premiere bar and music venue. Due to COVID-19 Reservations are required for certain days/times!", JLabel.CENTER);
	      blurb.setFont(new Font ("TimesRoman", Font.PLAIN, 30));
	      blurb.setForeground(Color.WHITE);
	      description.add(blurb);
	      
	      controlPanel.add(description);
	      mainFrame.setVisible(true); 
	      
	   }
}
