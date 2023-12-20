import java.util.Scanner;
public class BasicNestedPractice
  {
    public static void main(String[] args)
    {
      int userRows =0;
      int userColumns =0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a  number of rows: ");
      userRows = scan.nextInt();
      System.out.println("Enter a number of columns: ");
      userColumns = scan.nextInt();
      scan.close();
      if(userRows >20)
      {
        System.out.println("That is too many rows");
      }
      else if (userColumns >20)
      {
        System.out.println("That is too many rows");
      }
      
      else if (userRows<= 20 && userColumns <= 20)
      {
        for(int i = 0; i < userRows; i++)
          {
            for(int j = 0; j < userColumns; j++)
              {
                System.out.print("*");
              }
              System.out.println();
          }
      }
    }
  }
   //Used a nested for statement to execute printing a character.