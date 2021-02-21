
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
    import sun.audio.AudioData;
    import sun.audio.AudioPlayer;
    import sun.audio.AudioStream;
    import sun.audio.ContinuousAudioDataStream;

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author zeina ayman
     */
    public class Main {

            /**
             * @param args the command line arguments
             */
        public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
                    MainFrame frame = new MainFrame();
             
                    
                    
                    
                    
                    
        
        String n1="Roman  ";
        int kills1= (int) (Math.random()*50);
        int score1=(int) (Math.random()*500);
        
        String n2="Greek  ";
        int kills2=(int) (Math.random()*50);
        int score2=(int) (Math.random()*500);
        
        ArrayList <Roman> list1=new ArrayList<>();
        ArrayList <Greek> list2=new ArrayList<>();
//        
        
        
        
        list1.add(new Roman(n1,kills1,score1));
        list2.add(new Greek(n2,kills2,score2));
//        
            //Writing in a binary file
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StrategyGame.bin"));
             oos.writeObject(list1);
             oos.writeObject(list2);
                  oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                 
        //Reading from a binary file
       try{
            ObjectInputStream o=new ObjectInputStream(new FileInputStream("StrategyGame.bin"));
//               
                ArrayList<Roman> l1= (ArrayList<Roman>) o.readObject();
                ArrayList<Greek> l2= (ArrayList<Greek>) o.readObject();
                 
               
               System.out.println("Data for civilizations are: ");
               for(Roman a:l1)
               {
                   System.out.println("Name is: "+a.getName()+" "+"Score is:"+ a.getScore()+" "+"Num of kills: "+a.getnoofKills());
               }
               for(Greek a:l2)
               {
                   System.out.println("Name is: "+a.getName()+" "+"Score is:"+ a.getScore()+" "+"Num of kills: "+a.getnoofKills());
               }
               
             
               o.close();
       }
        
         catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        
    
                    
                    
                    
                    

                  
            //Game Sound
            AudioPlayer MGP = AudioPlayer.player;
            AudioStream BGM;
            AudioData MD;

            ContinuousAudioDataStream loop =null;

            try
            {
                InputStream test = new FileInputStream("C:\\Users\\zeina ayman\\Documents\\NetBeansProjects\\StrategyGameFinal\\music\\theme.wav");
                BGM = new AudioStream(test);
                AudioPlayer.player.start(BGM);
                MD = BGM.getData();
                loop = new ContinuousAudioDataStream(MD);

            }
            catch(FileNotFoundException e){
                System.out.print(e.toString());
            }
            catch(IOException error)
            {
                System.out.print(error.toString());
            }
            MGP.start(loop);



    }
    }
            


