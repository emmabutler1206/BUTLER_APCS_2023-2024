public class Hero
{

    private String name;
    private double health;
    private double armourHealth;
    private int strength;
    private String magicType;
    private int randomAttack;
    private int hit;


    public Hero( String name, double health, double armourHealth, int strength, String magicType, int randomAttack, int hit)
    {
    this.name = name;
    this.health= health;
    this.armourHealth = armourHealth;
    this.strength= strength;
    this.magicType=magicType;
    this.randomAttack= randomAttack;
    this.randomAttack= randomAttack;
    this.hit= hit;
    }
    
    public static void main(String[] args){}

    public void Attack()
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

    public void Cheer(int monsterHealth)
    {
        if(monsterHealth=0)
        {
            System.out.println("yeessssss, I have won");
        }
        else if(MonsterHealth>0 && health=0)
        {
            System.out.println("No, I have lossstttt");
        }
        
    }
}

    
