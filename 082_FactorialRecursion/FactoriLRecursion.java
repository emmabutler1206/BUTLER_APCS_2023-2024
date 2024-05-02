public class FactoriLRecursion {//In main method to run code
    public static void main(String[] args){
        //defining all of the factorials
        int factorialOne = factorial(6);
        int factorialTwo = factorial(10);
        int factorialThree = factorial(88);

        //Printing out the results of the factorial
        System.out.println(factorialOne);
        System.out.println(factorialTwo);
        System.out.println(factorialThree);
    }

    //Method for the factorial of the given number
    public static int factorial(int val)
    {
        if(val==0){
            return 1;
        }
        else{
            return val * factorial(val-1);
        }
    }
}
