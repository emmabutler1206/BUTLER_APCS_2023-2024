public class TransactionReport{

public void TallyTransactionTotalCost(Transaction[] arr)
{
    for(Transaction totalTransactions:arr)
    {
        System.out.println("The total cost is" + " " + (totalTransactions.getItemCost()+ totalTransactions.getItemCost() + totalTransactions.getItemCost()));
    }
}
public void TallyTotalSalePrice(Transaction[] arr)
{
    for(Transaction totalTransactions:arr)
    {
        System.out.println("The total sale price is" + " " + (totalTransactions.getItemSalePrice()+ totalTransactions.getItemSalePrice() + totalTransactions.getItemSalePrice()));
    }
}


public void TallyTotalProfit(Transaction[] arr)
{
     for(Transaction totalTransactions:arr)
    {
        System.out.println("The total profit is" + " " + (totalTransactions.getItemProfit()+ totalTransactions.getItemProfit() + totalTransactions.getItemProfit()));
    }
}

public void TallyTotalItemMargin(Transaction[] arr)
{
     for(Transaction totalTransactions:arr)
    {
        System.out.println("The total profit is" + " " +  (totalTransactions.getItemMargin()+ totalTransactions.getItemMargin() + totalTransactions.getItemMargin()));
    }
}



public static void main(String[] args){}
}











