public class Transaction{
private String itemName;
private String itemDescription;
private double itemCost;
private double itemSalePrice;
private double itemProfit;
private double itemMargin;
// initilizing variables
public Transaction(String itemName, String itemDescription, double itemCost, double itemSalePrice, double itemProfit, double itemMargin)
{
    this.itemName = itemName;
    this.itemDescription= itemDescription;
    this.itemCost= itemCost;
    this.itemSalePrice = itemSalePrice;
    this.itemProfit= itemProfit;
    this.itemMargin = itemMargin;
}
public Transaction()
{
    String itemName= "orange";
    String itemDescription = "orange and sweet";
    double itemCost = 6.00;
    double itemSalePrice = 6.50;;
    double itemProfit = 0.50;
    double itemMargin = 7.7;
}
// Method to create itemMargin
public double getItemCost()
{
    return itemCost;
}
public double getItemSalePrice()
{
    return itemSalePrice;
}
public double getItemProfit()
{
    return itemProfit;
}
public double getItemMargin()
{
    return itemMargin;
}
public static void main(String[] args){}


}
 