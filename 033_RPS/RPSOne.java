import java.util.Scanner;
public class RPSOne 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        String first = "Rock";
        String second = "Paper";
        String third = "Scissors";
        System.out.println("Please give your move");
        scan.nextLine();
        scan.close();

        int RPS = 0;
        RPS = (int)(Math.random()*3);
        if(RPS == 1)
        {
            System.out.println("The computers choice is rock");
            if(userInput.equals(first))
            {
                System.out.println("Better luck next time");
            }
            else if(userInput.equals(second))
            {
                System.out.println("You win");
            }
            else
            {
                System.out.println("Better luck next time");
            }
            
        }
         else if(RPS == 2)
        {
            System.out.println("The computers choice is paper"); 
            if(userInput.equals(second))
            {
                System.out.println("You win");
            }
            else if(userInput.equals(first))
            {
                System.out.println("Better luck next time");
            }
            else
            {
                System.out.println("You win ");
            }
        }   
         else
        {
             System.out.println("The computers choice is scissors");
            if(userInput.equals(first))
            {
                System.out.println("Better luck next time");
            }
            else if(userInput.equals(second))
            {
                System.out.println("You win");
            }
            else
            {
                System.out.println("Better luck next time");
            }
        }

    }
}    
//USED MATH RANDOM OPERATOR TO RANDOMLY GENERATE A NUMBER THAT CORRESPONDS TO A RPS VALUE. USING THAT VALUE, WE COMPARED AGAISNT THE USERS CHOICE/PLAY
//WE FIGURED IT OUT OURSELVES!

/*

WHY ARE ALL YOUR COMMENTS IN CAPS!? STOP YELLING!

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/