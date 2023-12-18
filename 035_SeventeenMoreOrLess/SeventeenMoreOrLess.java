import java.util.Scanner;
public class SeventeenMoreOrLess
{
    public static void main(String[] args)
    {
        int one = 0;
        int two = 0;
        int three = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in your first integer");
        one = scan.nextInt();
        System.out.println("Enter in your second integer");
        two = scan.nextInt();
        System.out.println("Enter in your third integer");
        three = scan.nextInt();
        scan.close();
        // used for first integer
        if(one >= two+17 || one <= two-17)
        {
            System.out.println("The first integer is 17 more or less than the second integer");
        }
        else
        {
            System.out.println("The first integer is not 17 more or less than the second integer ");
        }

        if(one >= three+ 17 || one<=three-17) 
        {
            System.out.println("The first integer is 17 more or less than the third integer");
        }
        else
        {
            System.out.println("The first integer is not 17 more or less than the third integer");
        }

        if (two>=one+17 || two<=one-17)
        {
            System.out.println("The second integer is 17 more or less than the first integer");
        }
        else 
        {
            System.out.println("The second integer is not 17 more or less than the first integer");
        }
    
        if(two>=three+17 || two<=three-17)
        {
            System.out.println("The second integer is 17 more or less than the third integer");
        }
        else 
        {
            System.out.println("The second integer is not 17 more or less than the third integer");
        }
        
        if (three>=one+17 || three<=one-17)
        {
            System.out.println("The third integer is 17 more or less than the first integer");
        }
        else 
        {
            System.out.println("The third integer is not 17 more or less than the first integer");
        }
        
        
        if(three>=two+17 || three<=two-17)
        {
            System.out.println("The third integer is 17 more or less than the second integer");
        }
        else
        {
            System.out.println("The third integer is not 17 more or less than the second integer");
        }
    }
}
// Used Or statements to take imputs from user, and generate the correct repsonse back

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/