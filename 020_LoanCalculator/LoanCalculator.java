import java.util.Scanner;
public class LoanCalculator
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);

    double principalBalance = 0.0;
    double annualInterestRate = 0.0;
    double remainingMonths = 0.0; 
   
    System.out.println( "Enter your Principal Balance"); 
    principalBalance = scan.nextDouble();
    System.out.println(" Enter your annual interest rate");
    annualInterestRate = scan.nextDouble();
    System.out.println( " Enter the remaining months");
    remainingMonths = scan.nextDouble();
    double monthlyInterest = principalBalance*(annualInterestRate/remainingMonths);
    double monthlyPayment = (principalBalance/remainingMonths) + monthlyInterest;
    System.out.println(" Your monthy interest is " + monthlyInterest + " dollars" + ". Your monthy payments are " + monthlyPayment + " dollars. ");
    scan.close();
// assigned doubles within the scanner to comlpete the assignment 






    }
}