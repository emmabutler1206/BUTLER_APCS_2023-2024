public class FoodItem
{

private int numOfFood;
private String color;
private String flavor;
private boolean hot;
private String foodName;

public FoodItem(int numOfFood, String color, String flavor, boolean hot, String foodName)
{
    this.numOfFood = numOfFood;
    this.color = color;
    this.flavor = flavor;
    this.hot= hot;
    this.foodName= foodName;
}

public static void main(String[] args){}

   
    public void FoodDescription()
    {
        System.out.println("This food is a " + foodName + "that has is" + flavor );
        System.out.println("Is this food hot?" + hot);
    }
    public void PantryInfo()
    {
        System.out.println("There are" + numOfFood + foodName + " in the pantry");
    }
    //Used to state amount of food that is being eaten, and then lists the amount of food left
    public void ImHungry()
    {
        for(int i = numOfFood; i >= numOfFood;i--)
        {
        
        System.out.println("Im eating" + numOfFood + " of the " + foodName);
        numOfFood = numOfFood-i;
        System.out.println("I have " + numOfFood + "left");
        }
    }
                                                                                                                                                  
    // We returned this variable because we adjust it during the program
    public int getnumOfFood()
    {
        return numOfFood;
    }




}
