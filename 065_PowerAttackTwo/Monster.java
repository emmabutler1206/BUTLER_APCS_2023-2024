public class Monster{
    // Hero Class has methods and variables that describe the atttributes of a hero.
    private String monsterName;
    private double monsterHealth;
    private double monsterArmourHealth;
    private double monsterStrength;
    private String monsterMagicType;
    private int monsterHit;

public Monster( String monsterName, double monsterHealth, double monsterArmourHealth, int monsterStrength, String monsterMagicType)
    {
    this.monsterName = monsterName;
    this.monsterHealth= monsterHealth;
    this.monsterArmourHealth = monsterArmourHealth;
    this.monsterStrength= monsterStrength;
    this.monsterMagicType=monsterMagicType;
  

    }



    public static void main(String[] args){}
//Tells us if the monster has won or lost based upon the cheers
    public void monsterCheer()
    {
        if(monsterHealth==0)
        {
            System.out.println("RRGGHGHH IM DONE FOR");
            System.out.println("The hero bravely fought and won");
        }
        else if(monsterHealth>0)
        {
            System.out.println("VICTORY RAWWWWRRRRR");
            System.out.println("The hero has lost");
        }
    }
}
    

    