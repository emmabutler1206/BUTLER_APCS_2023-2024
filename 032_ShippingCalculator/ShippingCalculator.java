import java.util.Scanner;
public class ShippingCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int weight = 0;
        double cost = 0.0;
        boolean canShip = true;


        System.out.println("Enter in the weight of your package in pounds");
        weight = scan.nextInt();
        scan.close();
        

        if(weight<=0)
        {
            System.out.println("Invalid input");
            canShip = false;
        }
        else if(weight>20)
        {
            System.out.println(" This package cannot be shipped");
            canShip = false;
        }
        else
        {
           if(weight > 0)
           {
            cost = 3.5;
           }
           if(weight > 1)
           {
            cost = 5.5;
           }
           if(weight > 3)
           {
            cost = 8.5;
           }
           if(weight > 10)
           {
            cost = 10.5;
           }
           System.out.println("The cost of shipping is $" + cost);
        }
    }
} 