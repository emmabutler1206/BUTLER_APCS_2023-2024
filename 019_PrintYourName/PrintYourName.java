import java.util.Scanner;

public class PrintYourName
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        System.out.println(" Print your first and last name!");
        firstName= scan.nextLine();
        lastName= scan.nextLine();
        System.out.println( " Your first and last name is " + firstName + lastName);
        scan.close();
        // Used scanner class to create a new scanner method
    }
}