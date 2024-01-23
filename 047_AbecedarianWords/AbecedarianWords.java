import java.util.Scanner;
public class AbecedarianWords
  {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      String userWord ="";
      System.out.println("Please enter in a word an the computer will tell you if it is abecedarian or not");
      userWord = scan.nextLine();
      boolean abecedarian = true;

      for(int i=0; i< userWord.length()-1; i++)
        {
          if(userWord.charAt(i) < userWord.charAt(i+1))
          {
            continue;
          }
          else
          {
            abecedarian=false;
          }
        }
     if (abecedarian=true)
     {
      System.out.println("This is an abcedarian word");
     }
     else
     {
      System.out.println("This is not an abcedarian word");
     }
     
     
    }
  }
// Used a charAt(); method to determine if a word is abcedarian.

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/