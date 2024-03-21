public class CashRegister
{
//made an array with three different transactions
    Transaction[] totalTransactions = { new Transaction("kiwi", "green and brown", 12.00, 12.50, 0.50,4.00),
                                        new Transaction("apple", "green", 5.00, 6.00, 1.00, 16.67),
                                        new Transaction("mango", "orange and sweet", 5.50, 6.25, 0.75,12.00)};

    public Transaction[] getTotalTransactionsArray()
    {
        return totalTransactions;
    }

    public static void main(String[] args){}
    
}
    

    