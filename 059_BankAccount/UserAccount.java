public class UserAccount
{
    public static void main(String[] args)
    {
        BankData bank1 = new BankData();
// Creating a new bank with data 

        BankAccount savings = new BankAccount("Emma B", "savings", 100.0, bank1.checkingInterestRate, false);
        savings.updateBalance("change", 50.0 );
        savings.updateBalance("change", -75.0 );
        savings.applyInterest(1);
        savings.updateBalance("change", -90 );
        // Changed the balance and applied the interest.
    }

}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/