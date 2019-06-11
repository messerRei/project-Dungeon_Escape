import javax.swing.JOptionPane;

public class Hero 
{
    String Name;
    
    String [] weaponName = {"","Wooden Sword","Dagger","Metal Sword", "Legendary Sword"};
    int [] weapon = {0,5,10,15,30};
    
    int maxHP;
    int curHP;
    int Damage;
    int curWeapon;
    int curDMG;
    
    int dmg_wp;
    
    int killedmobs = 0;
    
    boolean block = false;
    
    public void createHero()
    {
        Name = JOptionPane.showInputDialog("What is your name, Hero?");
        maxHP=100;
        curHP=100;
        curWeapon = 0;
        Damage = 10; 
        dmg_wp =Damage+weapon[curWeapon];
    }
    
    public void Dead()
    {
        JOptionPane.showMessageDialog(null,"DEAD\nTry harder!" + "\n\nYou killed:  " + killedmobs + " monsters!");
        System.exit(0);
    }
}
