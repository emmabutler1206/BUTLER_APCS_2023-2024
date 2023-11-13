import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = 0;

            System.out.println("Please give your integer");
        number = scan.nextInt();
 
        if (number%2 ==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        //USED MODULO TO DETERMINE IF A NUMBER IS EVEN OR ODD. I THEN USED IF STATEMENTS TO PRINT OUT RESULTS
        scan.close();
    }
}
