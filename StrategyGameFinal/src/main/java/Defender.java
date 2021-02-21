import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeina ayman
 */
public class Defender extends JPanel {
	ImageIcon imageic = new ImageIcon("/Users/fady/Desktop/Warcraft/defender.jpg");

	Point imageCorner1;
	Point prevPt1;

	public Defender() {
		imageCorner1 = new Point(0, 0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		imageic.paintIcon(this, g, (int) imageCorner1.getX(), (int) imageCorner1.getY());
	}

	private class ClickListener extends MouseAdapter {

		public void mousePressed(MouseEvent e) {
			prevPt1 = e.getPoint();
		}
	}

	private class DragListener extends MouseMotionAdapter {

		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			imageCorner1.translate((int) (currentPt.getX() - prevPt1.getX()),
					(int) (currentPt.getY() - prevPt1.getY()));
			prevPt1 = currentPt;
			repaint();
		}
	}

}