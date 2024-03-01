public class Transaction{
private String itemName;
private String itemDescription;
private double itemCost;
private double itemSalePrice;
private double itemProfit;

public Transaction(String itemName, String itemDescription, double itemCost, double itemSalePrice, double itemProfit)
{
    this.itemName = itemName;
    this.itemDescription= itemDescription;
    this.itemCost= itemCost;
    this.itemSalePrice = itemSalePrice;
    this.itemProfit= itemProfit;
}

public void itemMargin(int itemProfit, int itemSalePrice)
{
    double itemMargin = ((itemProfit/itemSalePrice) *100);
    System.out.println("Here is the percentage of margin:" + itemMargin);
}
public static void main(String[] args){}


}
 