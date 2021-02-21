
import java.awt.Point;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class DefendingUnit extends Unit {

	int defendingPower;

	public DefendingUnit(String name, String discription, ImageIcon ic, int defendingPower) {
		super(name, discription, ic);
		this.defendingPower = defendingPower;
	}

}
