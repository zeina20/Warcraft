
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Unit extends JPanel {
	String name;
	String discription;
	ImageIcon ic;

	public Unit(String name, String discription, ImageIcon ic) {
		this.name = name;
		this.discription = discription;
		this.ic = ic;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(ic.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	}
}
