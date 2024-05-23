
    public class Grapes extends Food
    {
       boolean sweet;
      String size;
       String brand;
  
  

    public Grapes(double cost, String foodName, String foodColor, String foodCategory, boolean sweet, String size, String brand)
      {
        super(cost, foodName, foodColor, foodCategory);
        this.sweet = sweet;
        this.size = size;
        this.brand = brand;
      }
  
    public boolean getSweet()
      {
      return sweet;
      }
    public String getSize()
      {
      return size;
      }
    public String getBrand()
      {
      return brand;
      }
     public void description()
     {
          System.out.println("Is the grape sweet? " + sweet);
    }
  
   public Grapes()
      {
        super(2.33, "grapes", "green", "fruit");
        this.sweet= true;
        this.size = "small";
        this.brand = "Costco";
      }
  public String toString() {
          return "The food Category are " + super.getFoodCategory();
         }
        

    }

