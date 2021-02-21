
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeina ayman
 */
public class Greek extends Civilization {
    
    public Greek(String name, int noOfKills, int score) {
        super( name, noOfKills, score);
    }
    
    public String getName()
        {
            return name;
        }

        
        public int getnoofKills()
        {
            return noofKills;
        }
        
        public int getScore()
        {
            return score;
        }
    
}