
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
public class BuildingUnit extends Unit {
	int buildingPower;

	public BuildingUnit(String name, String discription, ImageIcon ic, int buildingPower) {
		super(name, discription, ic);
		this.buildingPower = buildingPower;
	}
}
