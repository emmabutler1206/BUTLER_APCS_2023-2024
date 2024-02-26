public class PantryShelf
{
    public static void main(String[] args)
    {
        FoodItem apple = new FoodItem(5, "red", "sweet", false, "apple");
        apple.FoodDescription();
        apple.PantryInfo();
        apple.ImHungry();
        apple.setnumOfApples(10);
        apple.getnumOfFood();
        apple.ImHungry();
        
        FoodItem bananna = new FoodItem(2, "yellow", "sweet", true, "bananna");
        bananna.FoodDescription();
        bananna.PantryInfo();
  
        FoodItem pear = new FoodItem(3,"green", "sweet", true, "pear");
        pear.FoodDescription();
        pear.PantryInfo();


    }
}   
