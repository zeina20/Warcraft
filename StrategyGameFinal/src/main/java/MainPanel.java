import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class MainPanel extends JPanel {
	GamePanel gamePanel;

	JButton addBuildingButton1;
	JButton addAttackerButton1;
	JButton addDefenderButton1;

	JButton addBuildingButton2;
	JButton addAttackerButton2;
	JButton addDefenderButton2;

	MainPanel() {
		setLayout(null);

		gamePanel = new GamePanel();
		gamePanel.setBounds(110, 0, 2000, 1000);

		addButtons();
		setupButtonsListener();

		add(gamePanel);
		setVisible(true);
	}

	private void addButtons() {
		addBuildingButton1 = new JButton("Add Building");
		addBuildingButton1.setBounds(0, 0, 100, 50);
		addBuildingButton1.setBorder(new LineBorder(Color.blue));

		addAttackerButton1 = new JButton("Add Attacker");
		addAttackerButton1.setBounds(0, 50, 100, 50);
		addAttackerButton1.setBorder(new LineBorder(Color.blue));

		addDefenderButton1 = new JButton("Add Defender");
		addDefenderButton1.setBounds(0, 100, 100, 50);
		addDefenderButton1.setBorder(new LineBorder(Color.blue));

		add(addBuildingButton1);
		add(addAttackerButton1);
		add(addDefenderButton1);

		addBuildingButton2 = new JButton("Add Building");
		addBuildingButton2.setBounds(0, 250, 100, 50);
		addBuildingButton2.setBorder(new LineBorder(Color.red));

		addAttackerButton2 = new JButton("Add Attacker");
		addAttackerButton2.setBounds(0, 300, 100, 50);
		addAttackerButton2.setBorder(new LineBorder(Color.red));

		addDefenderButton2 = new JButton("Add Defender");
		addDefenderButton2.setBounds(0, 350, 100, 50);
		addDefenderButton2.setBorder(new LineBorder(Color.red));

		add(addBuildingButton2);
		add(addAttackerButton2);
		add(addDefenderButton2);
	}

	public void setupButtonsListener() {
		addBuildingButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addBuilding1();
			}
		});

		addAttackerButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addAttacker1();
			}
		});

		addDefenderButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addDefender1();
			}
		});

		addBuildingButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addBuilding2();
			}
		});

		addAttackerButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addAttacker2();

			}
		});

		addDefenderButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addDefender2();
			}
		});
	}
}
