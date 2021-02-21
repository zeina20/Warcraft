
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Building extends JPanel {
	String name;
	String description;
	ImageIcon ic;

	public Building(String name, String description, ImageIcon ic) {
		this.name = name;
		this.description = description;
		this.ic = ic;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(ic.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	}
}
