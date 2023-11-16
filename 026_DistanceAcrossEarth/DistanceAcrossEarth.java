import java.util.Scanner;
public class DistanceAcrossEarth
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    double latitudeX = 0.0;
    double longitudeX = 0.0; 
    double latitudeY= 0.0;
    double longitudeY= 0.0; 
   
    System.out.println("Please give first longitude");
    latitudeX = scan.nextDouble();
    System.out.println("Please give first latitude");
    longitudeX = scan.nextDouble();
    System.out.println("Please give first longitude");
    latitudeY = scan.nextDouble();
    System.out.println("Please give first latitude");
    longitudeY = scan.nextDouble();
    double longitudeXInKilometers = longitudeX *2 * 6371;
    double longitudeYInKilometers = longitudeY *2 * 6371;
    double latitudeXInKilometers = latitudeX *2 * 6371;
    double latitudeYInKilometers = latitudeY *2 * 6371;
    double totalDistance= Math.sqrt(Math.pow(longitudeXInKilometers - longitudeYInKilometers,2) + Math.pow(latitudeXInKilometers-latitudeYInKilometers,2));
    System.out.println("Your total distance is " + totalDistance);
    scan.close();
   // Used Scanner and Math objects to determine distance between two points
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/