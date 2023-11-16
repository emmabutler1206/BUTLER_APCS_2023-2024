import java.util.Scanner;
public class CircumferenceAreaOfACircleCalculator
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    double radius = 0.0;
    System.out.println("Please give the radius of the circle");
    radius = scan.nextDouble();
    double area = Math.pow(radius, 2* Math.PI);
    double circumference= 2*Math.PI*radius;
    System.out.println("The area of the circle is " + area + " The circumference of your circle is " + circumference);
    scan.close();
    // USED SCANNER AND JAVA MATH OBJECTS TO FIND RADIUS AND CIRCUMFERENCE BASED ON THE USERS GIVEN NUMBER  
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/