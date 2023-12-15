import java.util.Scanner;

public class FizzBuzzForLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int user = 0;
    System.out.println("please enter an integer");
    user = scan.nextInt();
    scan.close();
   

   

    for ( int i =1;i <= user; i++) 
    {
      if (i % 3 == 0 && i %5==0)   
      {
        System.out.println("Fizzbuzz");
      } 
      else if (i % 5 == 0) 
      {
        System.out.println("Buzz");
      } 
      else if (i % 3 == 0)
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

// Used a for loop to play fizzbuzz
