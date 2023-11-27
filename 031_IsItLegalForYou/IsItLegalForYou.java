import java.util.Scanner;
public class IsItLegalForYou
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int age = 0;

        System.out.println("Please give your age");
        age = scan.nextInt();

        if(age >= 16)
        {
            System.out.println("You are legal to drive and get a job");
        }
        else
        {
            System.out.println("You are not legal to drive or get a job");
        }

        if (age >=18)
        {
            System.out.println("You are legal to go to a casino");
        }
        else
        {
            System.out.println("You are not legal to drive ");
        }

        if(age>= 21)
        {
            System.out.println("You are legal to buy alchohol and buy cigarettes");
        }
        else
        {
            System.out.println("You are not legal to buy alchol and  buy cigarettes");
        }


        if(age>= 35)
        {
            System.out.println("You are legal to run for president");
        }
        else
        {
            System.out.println("You are not legal to run for president");
        }

        if(age>= 65)
        {
            System.out.println("You are legal to enroll in medicare");
        }
        else
        {
            System.out.println("You are not legal to enroll in medicare");
        }

        scan.close();
    }

}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
0/1 - Comments

*/