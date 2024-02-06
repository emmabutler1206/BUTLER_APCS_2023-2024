public class Closet
  {
   public static void main(String []args)
   {

    Shirt purple= new Shirt();
    purple.selfDescription();
    purple.fold();
    purple.cleanStatus();

    Shirt black = new Shirt ("Black", "Nike", "Sweatshirt", true);
    black.selfDescription();
    black.fold();
    black.cleanStatus();

    Shirt green = new Shirt ("green", "lonely ghost", "crewneck", false);
    green.selfDescription();
    green.fold();
    green.cleanStatus();

    Shirt blue = new Shirt("blue", "lululemon", "shirt", true);
    blue.selfDescription();
    blue.fold();
    blue.cleanStatus();

    Shirt red = new Shirt("red", "heart", "long sleeve", false);
    red.selfDescription();
    red.fold();
    red.cleanStatus();


//Used a constructor that uses "this" to create different and varied versions of a shirt.
  
  }
}