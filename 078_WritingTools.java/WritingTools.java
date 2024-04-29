public class WritingTools{
    private String residueColor;
    private int lengthInInches;
    private String sound;
    private String name;

//
    public WritingTools()
    {
      residueColor = "white";
      lengthInInches = 10;
      sound = "click";
      name = "pencil";
      
    }

    public WritingTools(String residueColor, int lengthInInches, String sound, String name)
    {
      this.residueColor = residueColor;
      this.lengthInInches = lengthInInches;
      this.sound = sound;
      this.name = name;
    }

    public String getResidueColor()
    {
      return residueColor;
    }

   
    public int getLengthInInches()
    {
      return lengthInInches;
    }

    public String getSound()
    {
      return sound;
    }

    public String getName()
    {
      return name;
    }


    public void write()
    {
      System.out.println("The " + name + " is writing");
    }

    public String toString(){
      return "The writing tool is " + lengthInInches+ " inches long and leaves a " + residueColor + " behind";
    }

    public static void main(String[] args){}
    
    
}