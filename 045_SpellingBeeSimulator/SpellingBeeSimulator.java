import java.util.Scanner;
public class SpellingBeeSimulator 
  {
    public static void main(String[] args)
    {
    String userWord = "";
    int x =0;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Spelling Bee Simulator, please enter in a word");
      userWord = scan.nextLine();
      System.out.println(userWord);

      while(x<userWord.length())
            { 
              if (x+1<userWord.length())
              {
            System.out.print(userWord.substring(x, x + 1)+ "-" );
            x++;
              }
              else if(x<userWord.length())

            {
              System.out.println(userWord.substring(x, x + 1));
              x++;
            }

            
            }


      // Used a while statement on strings and was able to spell out a user's word.
    }
  }