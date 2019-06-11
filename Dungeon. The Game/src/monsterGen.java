import java.net.URL;
import javax.swing.JOptionPane;

public class monsterGen
{
    
    String [] mobs = {"Goblin","Skeleton","Slime"};
    String [] mobsIcon = {"/Image/goblin.png","/Image/skeleton.png","/Image/slime.png"};
    String mobName;
    String mobURL;
    
    int maxHP;
    int curHP;
    int maxDamage;
    int curDamage;
    int numb;
    
    boolean block = false;
    
    int move;
    

    public  void gen()
    {
        GUI gui = new GUI();
        numb=randNumber.gen(0, 3);
            
        mobName = mobs[numb];
        mobURL = mobsIcon[numb];
            
        switch (numb)
        {
            case 0:
                maxHP = randNumber.gen(50, 100);
                curHP = maxHP;
                maxDamage = randNumber.gen(5, 15);
                break;
            case 1: 
                maxHP = randNumber.gen(10, 50);
                curHP = maxHP;
                maxDamage = randNumber.gen(15, 30);
                break;
            case 2: 
                maxHP = randNumber.gen(80, 150);
                curHP = maxHP;
                maxDamage = randNumber.gen(5, 10);
                break;
        }
            
        System.out.println(mobName + " created" + "\nHP: " + maxHP + "\nDamege: " + maxDamage + "\n\n");
    }
}
