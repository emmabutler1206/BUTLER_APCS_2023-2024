import java.util.Scanner;
import java.util.ArrayList;
public class AverageDiceRolls
  {
  public static void main(String[] args)
    {
      ArrayList<Integer> diceRoll = new ArrayList<Integer>();
      Dice roll = new Dice(6);


      
// Prompt the user for dice roll
      Scanner scan = new Scanner(System.in);
      System.out.println("How many times do you want to role the dice?");
      Integer input = scan.nextInt();
      
    
        for(int i=0; input<=i; i++)
        {
        roll.Roll();
        diceRoll.add(roll.getCurrentValue());
        System.out.println(roll.getCurrentValue());
        }

        int total=0;

        for(int i= 0; )
        {
     
        }
        float average = (diceRoll.size());
        System.out.println("Thank you for playing!" + " " +  average);

     scan.close();

    }
  }




    

