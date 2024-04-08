public class Hero
{

    private String name;
    private double health;
    private double armourHealth;
    private int strength;
    private String magicType;
    private int randomAttack;

// Hero Class has methods and variables that describe the attributes of a hero.
    public Hero( String name, double health, double armourHealth, int strength, String magicType)
    {
        this.name = name;
        this.health= health;
        this.armourHealth = armourHealth;
        this.strength= strength;
        this.magicType=magicType;
        this.randomAttack= randomAttack;
        this.randomAttack= randomAttack;
    }
    
    public static void main(String[] args){}
// This is the Attack method. Only the hero attacks (Solid 3/5???)
    public void Attack(int hit)
    {
          while (hit > 0) {
          
           int randomRoll =(int)(Math.random()*10)+1;


           int randomAttack = randomRoll + strength;
           System.out.println("You now have " + randomAttack + " points");

           if(randomAttack > armourHealth) {
               int randomDamage =(int)(Math.random()*2)+4;
               hit -= randomDamage;
               System.out.println("The monster has " + hit + " points left");
           }
        }
    }
// Tells us if the hero has won or lost based upon the cheers
    public void Cheer(int monsterHealth)
    {
        if(monsterHealth==0)
        {
            System.out.println("yeessssss, I have won");
        }
        else if(monsterHealth>=0 && health== 0)
        {
            System.out.println("No, I have lossstttt");
        }
    }
}