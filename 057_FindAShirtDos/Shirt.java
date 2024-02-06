public class Shirt {
   
   String color;
   String brand;
   String type;
  boolean isClean;

  public Shirt() {
    color = "red";
    brand = "Nike";
    type = "long sleeve";
    isClean = true;
  }

  

  public Shirt(String color, String brand, String type, Boolean isClean)
  {
    this.color= color;
    this.brand=brand;
    this.type=type;
    this.isClean = isClean;
  }

  public static void main(String[] args) {}

  public void selfDescription() {
    System.out
        .println("The shirt is " + color + " and is made by " + brand + " and is a " + type + " and is " + isClean);
  }

  public void cleanStatus() {
    if (isClean == true) 
    {
      System.out.println("The shirt is clean");
    }
    else {
      System.out.println("The shirt is dirty");
    }
  }

  public void fold()
  {
      if (isClean == false)
      {
        System.out.println("The shirt is dirty and can not be folded");
      }
      else
      {
        System.out.println("The shirt is clean and can be folded");
      }
    }
}
