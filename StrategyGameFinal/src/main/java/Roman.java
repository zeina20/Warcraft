
import java.util.ArrayList;

public class Roman extends Civilization {
    
    public Roman(String name, int noOfKills, int score) {
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


