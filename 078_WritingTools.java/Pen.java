public class Pen extends WritingTools
  {
    // varaibles assigned to pen 
    boolean isPopUp;
    boolean smelly;
    String inkThickness;

    // constructor
  public Pen(String residueColor, int lengthInInches, String sound, String name, boolean isPopUp, boolean smelly, String inkThickness)
    {
      super(residueColor, lengthInInches, sound, name);
      this.isPopUp = isPopUp;
      this.smelly = smelly;
      this.inkThickness = inkThickness;
    }

// getters to return statements and varaibles
    public boolean getIsPopUp()
      {
      return isPopUp;
      }
    public boolean getSmelly()
      {
      return smelly;
      }
    public String getInkThickness()
      {
      return inkThickness;
      }
 
      // method to print out in class "Desk"
   public void write()
   {
        System.out.println("Is the pen writing in smelly ink" + smelly);
  }

 public Pen()
    {
      super("blue", 7, "clack", "pen");
      this.isPopUp= true;
      this.smelly = true;
      this.inkThickness = "thick";
    }



  

    public String toString() 
    {
        return "The length of the pen" + " " +  super.getLengthInInches();
    }

  
}