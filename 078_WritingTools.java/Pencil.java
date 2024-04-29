public class Pencil extends WritingTools
  {
    // variables specific to Pencil 
    boolean erase;
    String color;
    String brand;

    // Constructor
  public Pencil(String residueColor, int lengthInInches, String sound, String name, boolean erase, String color, String brand)
    {
      super(residueColor, lengthInInches, sound, name);
      this.erase = erase;
      this.color = color;
      this.brand = brand;
    }

    // Getters to enavle variables to print out values
  public boolean getErase()
    {
    return erase;
    }
  public String getColor()
    {
    return color;
    }
  public String getBrand()
    {
    return brand;
    }
   public void write()
   {
        System.out.println("the " + super.getSound()+ " is writing");
  }

  //Assigning variables in the parent class to the child class
 public Pencil()
    {
      super("green", 3, "clack", "pencil");
      this.erase= true;
      this.color = "blue";
      this.brand = "bic";
    }

    // Method to print out statement in the class "Desk"
 public String toString()
 {
    return "The pencil is a " + color + " " + brand + " . Can it erase? " + erase;
 }
// main method
 public static void main(String[] args){}



}

