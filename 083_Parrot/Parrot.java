import java.util.Scanner;

public class Parrot {
    // creating scanner to take use input
    static Scanner scanner = new Scanner(System.in);

    //Running program in main 
    public static void main(String[] args){
        specificPhrase();
    }

    //Running the program and looking at user input
    public static void specificPhrase()
    {
        System.out.println(" Hello, I am a parrot!");
        String userInput = scanner.nextLine();

        if(userInput.equals("Stop it parrot!"))
        {
            System.out.println("Fine, enough.");
            return;
        }
        else{
            System.out.println("Incorrect, you said:" + userInput);
            specificPhrase();
        }
    }
}
