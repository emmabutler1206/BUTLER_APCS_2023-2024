import java.util.Scanner;
public class CarBuilderOne
{
    public static void main(String[] args)
    { 
        Scanner scan = new Scanner(System.in);
        int year = 0;
        int mileage = 0;
        String make = "";
        String model = "";

        // Car usersCar = new Car();
        // Car mustang = new Car( 1969, 60_000, "Ford", "Mustang");
        System.out.println(" What make of car are you looking for?");
        make = scan.nextLine();
        System.out.println( " What model of car are you looking for?");
        model = scan.nextLine();
        System.out.println(" What year of car do you want?");
        year = scan.nextInt();
        System.out.println( " How many miles do you want on the car?");
        mileage = scan.nextInt();
        System.out.println(" There is one car that matches your specification" + model + " " + make);
        scan.close();

        Car foo = new Car(year, mileage, make, model);
        // Used Scanner to allow user to imput characteristics of a car, and used a method to create a car.
       
      
        

    }
}