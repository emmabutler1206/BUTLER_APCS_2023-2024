public class Pen {
  
 String colorOfInk;
 String colorOfPen;
 double inkRemaining;
 boolean capOrClicky;
 String words;

  
  public Pen() {
    colorOfInk = "red";
    colorOfPen = "green";
    inkRemaining = 0.5;
    capOrClicky = true;
  }

  public Pen(String colorOfInk, String colorOfPen, int inkRemaing,
      Boolean capOrClicky) {
    this.colorOfInk = colorOfInk;
    this.colorOfPen = colorOfPen;
    this.inkRemaining = inkRemaining;
    this.capOrClicky = capOrClicky;
  }

  public static void main(String[] args) {}

  public void inkRemaining() {
    System.out.println("The ink remaining is " + inkRemaining);
  }

  public void capOff()
  {
    if (capOrClicky==true)
    {
      System.out.println("The cap is off");
    }
    else
    {
      System.out.println("The cap is on");
    }
  }
  public void clickedOut()
  {
    if(capOrClicky==false)
    {
      System.out.println("The pen is not clicked out");
    }
    else
    {
      System.out.println("The pen is clicked out");
    }
  }

  public void wordstoWrite()
    {
  words = "heyyyyy";
    if(capOrClicky == true)
    {
      System.out.println(words);
    }
      
    }
}