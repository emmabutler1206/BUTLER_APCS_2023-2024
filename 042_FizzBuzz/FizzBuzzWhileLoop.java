import java.util.Scanner;
public class FizzBuzzWhileLoop
  {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int user =0;
        int i =0;
        System.out.println("Please enter in an integer to play fizzbuzz");
        user = scan.nextInt();
        scan.close();

        while( i <= user-1)
        {
          i++;
          if(i % 3 == 0 && i % 5==0)
          {
            System.out.println("Fizzbuzz");
          }
          else if(i % 5 == 0)
          {
            System.out.println("Buzz");
          }
          else if(i % 3 == 0)
          {
            System.out.println("Fizz");
          }
          else
          {
            System.out.println(i);
          }
        }
    }
  }
  // used a while loop to do fizzbuzz