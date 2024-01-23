public class LoopYourName
{
  public static void main(String[] args) 
  {
    String name = "Emma";
    int x = 0;
    while (x < name.length()) 
    {
      System.out.println(name.substring(x, x + 1));
      System.out.print();
      x++;
    }
  }
}

/*

Doesn't compile.

0/1 - Compiles
0/1 - Content
1/1 - Formatting
1/1 - Comments

*/