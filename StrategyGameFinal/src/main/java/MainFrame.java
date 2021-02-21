
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeina ayman
 */

import javax.swing.*;

public class MainFrame extends JFrame {
	
	MainPanel mainPanel = new MainPanel();

	MainFrame() {
		setTitle("Warcraft Map");
		setSize(1350, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().add(mainPanel);

		setVisible(true);
	}
}