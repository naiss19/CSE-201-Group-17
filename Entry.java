import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Entry extends JPanel {
	String name, type, dollar;
	JButton visit;
	
	public Entry(String name, String type, String dollar, boolean red) {
		super.setLayout(new GridLayout(3,3));
		JLabel grid1 = new JLabel("Name: ");
		JLabel grid2 = new JLabel(name);
		JButton grid3_clear = new JButton("");
		grid3_clear.setVisible(false);
		JLabel grid4 = new JLabel("Type: ");
		JLabel grid5 = new JLabel(type);
		JButton grid6_clear = new JButton("");
		grid6_clear.setVisible(false);
		JLabel grid7 = new JLabel(dollar);
		JButton grid8_clear = new JButton("");
		grid8_clear.setVisible(false);
		JButton grid9 = new JButton("Visit");
		
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
}
