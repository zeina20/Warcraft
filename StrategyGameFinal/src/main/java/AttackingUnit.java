
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
public class AttackingUnit extends Unit {

	int attackPower;

	public AttackingUnit(String name, String discription, ImageIcon ic, int attackPower) {
		super(name, discription, ic);
		this.attackPower = attackPower;
	}
}