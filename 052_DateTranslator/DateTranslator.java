import java.util.Scanner;
public class DateTranslator
  {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int date =0;
      int month =0;
      int year=0;
      String type="";
      System.out.println("Enter in a date in numeric form");
      date = scan.nextInt();
      System.out.println("Enter in a month in numeric form");
      month = scan.nextInt();
      System.out.println("Enter in a year in numeric form");
      year = scan.nextInt();
     

      System.out.println("Do you want the date in European form or American form?");
      type = scan.next();
      if (type.equals("European"))
          {
        europeanForm(month,date,year);
          }
      else if (type.equals("American"))
               {
        americanForm(month,date,year);

               }
      else {
        System.out.println("Invalid form type");
      }
    }

      public static void europeanForm(int month, int date, int year)
        {
        System.out.println(date + "/" + month + "/" + year);
        }

      public static void americanForm(int month,int date, int year)
        {
        System.out.println(month + "/" + date + "/" + year );
        }

  }
//Created a class that outputs a date based on the user's input.
    
    