import java.util.Scanner;
public class UnethicalRPS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        String first = "rock";
        String second = "paper";
        String third = "scissors";
        System.out.println("Please eneter your move in lowercase letters");
        scan.nextLine();
        scan.close();
        
        if(userInput.equals(first))
        {
            System.out.println("The computers choice is paper");
           System.out.println("you loose");
            
        }
        else if(userInput.equals(second))
        {
            System.out.println("The computers choice is scissors"); 
            System.out.println("You loose");
        }
         else
        {
            System.out.println("The computers choice is rock");
            System.out.println("you loose");
        }
            
            
           

    }
}

/*

1/1 - Compiles
1/1 - Content
0/1 - Formatting
-Lots of extra lines. REPL.IT formatting?
1/1 - Comments

*/