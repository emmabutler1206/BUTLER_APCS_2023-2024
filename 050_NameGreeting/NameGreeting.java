import java.util.Scanner;
public class NameGreeting 
  {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      String name ="";
      System.out.println("What is your name?");
       name = scan.nextLine();
       scan.close();
      nameGreeting(name);
    }
    public static void nameGreeting(String name)
    {
      System.out.println("Hello, your name is " + name + "!");
    }
  }
  
// Created a method and was able to utilize it to print out the user's name.