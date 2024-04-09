
public class Dice {

    public int currentValue; 
    public int numOfSides;

    // created through the constructor 
    public Dice( int numOfSides)
    {
    this.numOfSides = numOfSides;
    Roll();
    }
    public int getCurrentValue()
    {
        return currentValue;
    }
    public void Roll()
    {
      currentValue = (int)(Math.random()*numOfSides)+1;
    }
    // Will return the value of the roll to be used later in the array list 
   
    public static void main(String[] args){}
}