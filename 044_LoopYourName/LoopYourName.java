public class LoopYourName
{
  public static void main(String[] args) 
  {
    String name = "Emma";
    int x = 0;
    while (x < name.length()) 
    {
      System.out.println(name.substring(x, x + 1));
      System.out.print()
      x++;
    }
  }
}