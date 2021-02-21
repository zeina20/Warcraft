
import java.io.Serializable;
import java.util.ArrayList;

public class Civilization implements Serializable {
	
        String name;
        int noofKills;
        int score;

	public Civilization() {
		
                name="";
                noofKills=0;
                score=0;
	}

	public Civilization(String name, int noofKills, int score) {
		
                this.name=name;
                this.noofKills=noofKills;
                this.score=score;
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