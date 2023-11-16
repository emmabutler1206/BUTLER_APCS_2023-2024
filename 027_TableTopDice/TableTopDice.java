import java.util.Scanner;
public class TableTopDice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int d4 = (int)(Math.random()*4)+1;
        int d6 = (int)(Math.random()*6)+1;
        int d8 = (int)(Math.random()*8)+1;
        int d10 = (int)(Math.random()*10)+1;
        int percentile = (int)(Math.random()*10-1) * 10;
        int d12 = (int)(Math.random()*12)+1;
        int d20 =  (int)(Math.random()*20)+1; 
        String d4User = "";
        String d6User = "";
        String d8User = "";
        String d10User = "";
        String percentileUser = "";
        String d12User = "";
        String d20User = "";

        System.out.println("Roll your d4 dice: ");
        d4User = scan.nextLine();
        System.out.println("Your roll is " + d4);

        System.out.println("Roll your d6 dice: ");
        d6User = scan.nextLine();
        System.out.println("Your roll is " + d6);

        System.out.println("Roll your d8 dice: ");
        d8User = scan.nextLine();
        System.out.println("Your roll is " + d8);

        System.out.println("Roll your d10 dice: ");
        d10User = scan.nextLine();
        System.out.println("Your roll is " + d10);

        System.out.println("Roll your percentile dice: ");
        percentileUser = scan.nextLine();
        System.out.println("Your roll is " + percentile);

        System.out.println("Roll your d12 dice: ");
        d12User = scan.nextLine();
        System.out.println("Your roll is " + d12);

        System.out.println("Roll your d20 dice: ");
        d20User = scan.nextLine();
        System.out.println("Your roll is " + d20);
        scan.close();
        // Used the random method to limit the number value a dice can roll to 
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/