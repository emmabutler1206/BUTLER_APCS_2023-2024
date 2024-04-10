import java.util.Scanner;
import java.util.ArrayList;
public class AveragediceRollss
  {
    // In main method
  public static void main(String[] args)
    {
      ArrayList<Integer> diceRolls = new ArrayList<Integer>();
      Dice dice = new Dice(20);
      Scanner scan = new Scanner(System.in);
      
      // Prompt the user for dice dice
      
      System.out.println("How many times do you want to role the dice?");
      int input = scan.nextInt();
          
      // Rolls the dice
      for(int i=1; i<= input; i++) {
        dice.Roll();
        diceRolls.add(dice.getCurrentValue());
        System.out.println(dice.getCurrentValue());
      }

      int totalForAverage = 0;
      // Takes and spits out the average
      for(int i= 0; i < diceRolls.size(); i++) {
          totalForAverage += diceRolls.get(i);

      }
      double average = (double)totalForAverage/diceRolls.size();
      System.out.println("Thank you for playing!" + " " +  average);
      scan.close();
// Kat and I worked together on this code, that is why our code is extremely similar. Especialy on this class.
    }
  }




    

