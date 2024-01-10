public class PowerAttack
{
    public static void main(String []args)
    {
        int charstrength= 3;
        
       
        int armor= 11;
        int hit = 13;

        System.out.println("You have +3 strentgh");
       

        while (hit > 0) {
            
            int randomRoll =(int)(Math.random()*10)+1;

            int randomAttack = randomRoll + charstrength;
            System.out.println("You now have " + randomAttack + " points");

            if(randomAttack > armor) {
                int randomDamage =(int)(Math.random()*2)+4;
                hit -= randomDamage;
                System.out.println("The monster has " + hit + " points left");
            }
            
            if (hit<= 0)
            {
                System.out.println("The monster has died ");
            }
            
            


           
        }

    }
}
// Used while loops to create a simulated video game

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/