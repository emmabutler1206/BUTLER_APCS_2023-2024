
public class Shirt
{
    static String color = "red";
    static String brand= "gucci";
    static String type= "tanktop";
   static  boolean isClean= true;  
    static boolean fold = false;

    public static void main(String[] args)
    {}
  
  public static void selfDescription()
  {
    System.out.println("This is a " + color +" " +  type + " from " + brand + "." );
  }

  public static void fold()
  {
    if (fold == true)
    {
        System.out.println("The shirt is folded!");
    }
    else
    {
        System.out.println("The shirt is not folded:()");
    }
  }

  public static void cleanStatus()
  {
    if (isClean == true)
    {
      System.out.println("The shirt is clean!");
    }
    else
      {
        System.out.println("The shirt is not clean");
      }
    
  }
}

//created a class that can be called to list the characteristics of a shirt.