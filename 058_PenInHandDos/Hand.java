  public class Hand
  {
   public static void main(String []args)
   {

    Pen purple= new Pen();
    purple.inkRemaining();
    purple.capOff();
    purple.clickedOut();
    purple.wordstoWrite();

    Pen black = new Pen ("Black", "Green", 0, true);
    black.inkRemaining();
    black.capOff();
    black.clickedOut();
    black.wordstoWrite();

    
    Pen green = new Pen ("green", "red", 1, false);
    green.inkRemaining();
    green.capOff();
    green.clickedOut();
    green.wordstoWrite();



    Pen blue = new Pen("blue", "black", 1, true);
    blue.inkRemaining();
    blue.capOff();
    blue.clickedOut();
    blue.wordstoWrite();


    Pen red = new Pen("red", "blue", 0, false);
    red.inkRemaining();
    red.capOff();
    red.clickedOut();
    red.wordstoWrite();

//Used a constructor that uses "this" to create different and varied versions of a pen.
  
  }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/