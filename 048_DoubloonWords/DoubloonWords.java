import java.util.Scanner;
public class DoubloonWords 
  {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      String word ="";
      System.out.println("Enter a word and the computer will tell you if it is a doubloon word: ");
      word = scan.nextLine();
      int length = word.length();
      int count = 0;
      if(length > 1)
        {
          for (int i = 0; i < length -1; i++)
          {
            for(int j = i+1 ; j < length; j++)
            {
              if(word.charAt(i) == word.charAt(j))
              {
                count++;
              }
            }
          }
            if(count ==2 )
            {
              System.out.println("This is a doubloon word");
            }

            else
            {
              System.out.println("This is not a doubloon word");
            }

          }
        
    }
  }
  // created a program that tells the user if their word is a doubloon word.

  /*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/