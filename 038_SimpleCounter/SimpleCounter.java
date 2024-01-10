import java.util.Scanner;

public class SimpleCounter 

  {
      public static void main(String[] args)
    {
    
        Scanner scan = new Scanner(System.in);
   
        int count = 0;
        System.out.println("Enter a number: ");
        count = scan.nextInt();
        scan.close();
        int i =0;

        while (i< count)
      {
        System.out.println(i);
        i++;
      }

    }

}
//used a while loop to count up from 0 

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/