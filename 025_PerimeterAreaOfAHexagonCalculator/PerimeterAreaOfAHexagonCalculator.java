import java.util.Scanner;
public class PerimeterAreaOfAHexagonCalculator
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    double length = 0.0;
    System.out.println("Please give the length of a side of the hexagon");
    length = scan.nextDouble();
    double area = 33 * Math.sqrt(3)/2 * Math.pow( length, 2);
    double perimeter= 6 * length;
    System.out.println("The area of the hexagon is " + area + " The perimeter of your hexagon is " + perimeter);
    scan.close();
    // USED SCANNER AND JAVA MATH OBJECTS TO FIND PERIMETER AND AREA BASED ON THE USERS GIVEN NUMBER  
    }
}