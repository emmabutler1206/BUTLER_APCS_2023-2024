import java.util.Scanner;
public class CommonDidgit
{
    public static void main(String []args)
    {
       Scanner scan = new Scanner(System.in);
        int userIntegerOne = 0;
        int userIntegerTwo= 0;

        
        System.out.println("Enter your first integer betwen 25 and 75");
        userIntegerOne =  scan.nextInt();
        System.out.println("Enter your second integer betwen 25 and 75");
        userIntegerTwo = scan.nextInt();
        
       
       Integer numberOneObject = Integer.valueOf(userIntegerOne);
       Integer numberTwoObject = Integer.valueOf(userIntegerTwo);
       String numberOneString= numberOneObject.toString();
        String numberTwoString = numberTwoObject.toString();


        if (userIntegerOne <= 25 || userIntegerTwo <= 25)
        {
            System.out.println("Error");
        }
        else if (userIntegerOne >=75 || userIntegerTwo >=75)
        {
            System.out.println("Error");
        }
        else
        {
         
            if (numberOneString.substring(1).equals(numberTwoString.substring(1)))
           {
            System.out.println("The shared integer is " + numberTwoString.substring(1));
           }
           if (numberOneString.substring(0).equals(numberTwoString.substring(0)))
           {
            System.out.println("The shared integer is " + numberTwoString.substring(0));
           }
        }

    }
}
//USED IF STATEMENTS AND MATH OPERATORS TO TAKE A USERS INPUT AND SHOVE OUT THE CORRECT OUTPUT

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/