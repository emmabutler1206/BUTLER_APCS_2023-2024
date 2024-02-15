public class BankAccount
{
 String userName;
 String accountType;
 double currentBalance;
 double interestRate;
 boolean isOverdrafted;


public BankAccount(String userName, String accountType, double currentBalance, double interestRate, boolean isOverdrafted)
{
    this.userName= userName;
    this.accountType = accountType;
    this.currentBalance = currentBalance;
    this.interestRate= interestRate;
    this.isOverdrafted= isOverdrafted;
}

 public BankAccount()
 {
   userName = "Emma Butler";
   accountType = "savings";
   currentBalance = 0;
   interestRate = 0;
   isOverdrafted = false;
 }

 public static void main(String[] args) {}

 public void checkBalance()
 {
    System.out.println("Your account balance is " + currentBalance);
 }


 public void updateBalance(String changeOrSet, double updatedBalance)
 {
    if(changeOrSet.equals("set"))
    {
        currentBalance = updatedBalance;
        System.out.println("your balance is " + currentBalance);
        updateOverdraft();
    }
    else if (changeOrSet.equals("change"))
    {
        currentBalance = updatedBalance;
        System.out.println("your balance has changed. Your current balance is " + currentBalance);
        updateOverdraft();
    }
 }
 public void applyInterest(int months)
 {
    if (!isOverdrafted)
    {
        System.out.println("Interest is being applied ");
        for(int i =0; i< months; i++)
        {
            currentBalance= currentBalance * (1+(interestRate));
        }
        System.out.println(currentBalance + ".");
    }
 }
public void updateOverdraft()
{
    if (currentBalance <0.00)
    {
        isOverdrafted = true;
        System.out.println("This account is overdrafted.");
    }
    else 
    {
        isOverdrafted = true;
        System.out.println("This account is not overdrafted");
    }
}
}
   // Created a class BankAccount with methiods desribing functions of a bank.

