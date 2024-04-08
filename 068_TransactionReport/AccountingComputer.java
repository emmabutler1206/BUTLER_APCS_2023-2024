public class AccountingComputer{

// had an tranactionreport object and cash register object in the main method.
public static void main(String[] args)
{
   // This allowed methods in Tranaction report to execute
   TransactionReport hello = new TransactionReport();
   CashRegister green = new CashRegister();

   hello.TallyTransactionTotalCost(green.getTotalTransactionsArray());
   hello.TallyTotalSalePrice(green.getTotalTransactionsArray());
   hello.TallyTotalProfit(green.getTotalTransactionsArray());
   hello.TallyTotalItemMargin(green.getTotalTransactionsArray());
 

}

}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/