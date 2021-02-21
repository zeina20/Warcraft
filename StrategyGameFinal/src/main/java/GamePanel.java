import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GamePanel extends JPanel {
	List<JPanel> mypanels = new ArrayList<JPanel>();
	DefendingUnit laser;
	
	GamePanel() {
		setBackground(Color.lightGray);
               
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		for (int i=0;i<800;i++) {
			g.drawString("||", 575, i);
		}
	}

	public void addBuilding1() {	
		ImageIcon ic = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\castle4.JPG");
		JPanel castle = new Castle("Buckingham Palace", "Royal EnglishHouse", ic, "Queen Elizabeth");
		castle.setBounds(50, 150, 100, 100);
		castle.setBackground(Color.magenta);
		mypanels.add(castle);
		add(castle);
		repaint();
		handleDrag(castle);
	}
	
	//THIS IS THE MAIN FUNCTION TO REFERENCE.
	public void addAttacker1() {	
		ImageIcon initial = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\attacker1.JPG");
    	ImageIcon swords = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\flameshock.JPG");

		AttackingUnit gladiator = new AttackingUnit("Gladiator", "The mighty one!", initial , 80);
		gladiator.setBounds(150, 150, 100, 100);
		mypanels.add(gladiator);
		add(gladiator);
		repaint();
		handleDrag(gladiator);
		
		gladiator.addMouseListener(new MouseAdapter() {

			@Override
            public void mousePressed(MouseEvent e) {
            	if (gladiator.ic == initial) {
                	gladiator.ic = swords;
            	} else {
                	gladiator.ic = initial;
            	}
            	
            	gladiator.repaint();
            }
        });
	}
	

	
	public void addDefender1() {	
		ImageIcon ic = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\defender1.JPG");
		DefendingUnit arrow = new DefendingUnit("Arrow", "The precise one!", ic , 60);
		arrow.setBounds(150, 250, 100, 100);
		arrow.setBackground(Color.cyan);
		mypanels.add(arrow);
		add(arrow);
		repaint();
		handleDrag(arrow);
	}
	
	public void addBuilding2() {		
		ImageIcon ic = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\castle5.JPG");
		CommandCenter commandCenter = new CommandCenter("USA Base", "Home Land", ic);
		commandCenter.setBounds(1100, 150, 100, 100);
		commandCenter.setBackground(Color.green);
		mypanels.add(commandCenter);
		add(commandCenter);
		repaint();
		handleDrag(commandCenter);
	}
	
	public void addAttacker2() {		
		ImageIcon ic = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\attacker2.JPG");
                ImageIcon swords = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\flameshock.JPG");
		AttackingUnit orc = new AttackingUnit("Tank", "The overlord!", ic , 70);
		orc.setBounds(1000, 150, 100, 100);
//		orc.setBackground(Color.red);
		
		mypanels.add(orc);
		add(orc);
		repaint();
		handleDrag(orc);
                
                orc.addMouseListener(new MouseAdapter() {

			@Override
            public void mousePressed(MouseEvent e) {
            	if (orc.ic == ic) {
                    orc.ic = swords;
                   
                    
            	} else {
                	orc.ic = ic;
            	}
            	
            	orc.repaint();
            }
        });
                
	}
	
         
	public void addDefender2() {		
		ImageIcon ic = new ImageIcon("D:\\Zeina MIU\\Year 2\\OOP\\final project\\defender2.JPG");
		laser = new DefendingUnit("Laser", "Laser Defence !", ic , 90);
		laser.setBounds(1000, 250, 100, 100);
		laser.setBackground(Color.pink);
		mypanels.add(laser);
		add(laser);
		repaint();
		handleDrag(laser);
	}
	
	public void attack1to2() {
		
	}

	public void handleDrag(JPanel panel) {
		final JPanel p = panel;
		panel.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent me) {
				me.translatePoint(me.getComponent().getLocation().x, me.getComponent().getLocation().y);
				p.setLocation(me.getX(), me.getY());
			}
		});
	}
}