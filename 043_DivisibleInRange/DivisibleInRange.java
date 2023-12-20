import java.util.Scanner;
public class DivisibleInRange
  {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int rangeInt1 =0;
      int rangeInt2 =0;
      int divisibleBy = 0;
      int count =0;

      System.out.println("Please enter in the first number in your desired range: ");
      rangeInt1 = scan.nextInt();
      System.out.println("Please enter in the second number in your desired range: ");
      rangeInt2 = scan.nextInt();
      System.out.println("What do you want your numbers to be divisible by");
      divisibleBy = scan.nextInt();
      scan.close();

      for (int i = rangeInt1; i <=rangeInt2; i++ )
      {
        if ( i % divisibleBy ==0)
        {
         
          System.out.println(i);
          count++;
        }
     
    
    }
    System.out.println( "there are" + count + " numbers that are divisibly by " + divisibleBy);
  }
}
// Used a for loop and if statements to list and name numbers in a range that are divisble by a certain number.