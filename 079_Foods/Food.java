public class Food {
    private double cost;
    private String foodName;
    private String foodColor;
    private String foodCategory;
    

    public Food(){
        cost = 1.11;
        foodName = "Broccaali";
        foodColor= "green";
        foodCategory= "vegetable";
    }

    public Food(double cost, String foodName, String foodColor, String foodCategory)
    {
        this.cost = cost;
        this.foodName = foodName;
        this.foodColor = foodColor;
        this.foodCategory=foodCategory;
    }
    
    public double getCost()
    {
    return cost;
    }

    public String getFoodName()
    {
        return foodName;
    }

    public String getFoodColor()
    {
        retrun foodColor;
    }

    public String getFoodCategory()
    {
        return foodCategory;
    }

    public void eat()
    {
        System.out.println("Oh noo, the " + foodName +  "is all gone")
    }

    public static void main(String[] args){}

    public String toString(){
        return " the food is the color" +  foodColor;
    }
}
