import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

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
	
	public static void buildCatalogue() {
		cataloguePanel = new JPanel();
		cataloguePanel.setLayout(new GridLayout(10, 1));
		
		ArrayList<Entry> events = buildEvents();
		
		for (int i = 0; i < 10; i++) {
			cataloguePanel.add(events.get(i));
		}
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
		cataloguePanel.setBorder(border);
	}
	
	public static ArrayList<Entry> buildEvents() {
		ArrayList<Entry> events = new ArrayList<Entry>();
		boolean pink;
		for (int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				pink = true;
			} else {
				pink = false;
			}
			events.add(new Entry("Brick Street", "Bar", "$$", pink));
		}
		return events;
	}
}
