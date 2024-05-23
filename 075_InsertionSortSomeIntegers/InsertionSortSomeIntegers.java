import java.util.Scanner;

public class InsertionSortSomeIntegers {
  public static void main(String[] args) {
    // Creating a scanner object of the scanner class
    Scanner scan = new Scanner(System.in);
    // Asking user to input number of integers to be sorted
    System.out.println(
        "Please list the number of integers you want generated. Know that the random numbers will be between 1-1000");
    // Taking the user's input and assigning it to a variable
    int input = scan.nextInt();
    // Creating an array of the user's input
    int[] array = new int[input];
    // Asigning ecah index of an array to a random number
    for (int i = 0; i < input; i++) {
      // Creation of random number generator
      array[i] = (int) (Math.random() * 1000) + 1;
      // Where return array;
    }
    // Printing out the array
    System.out.println(array);
    // Assigning a variable to the length and sortation of the array
    int sortedNumArray[] = InsertionSorter(array);

    // Using a for loop to print out the sorted array
    for (int num : sortedNumArray) {
      // Printing the array
      System.out.println(num + " ");
    }

  }

  // Method for sorting the array
  public static int[] InsertionSorter(int[] array) {
    // Setting up how the loop will search through the data
    for (int i = 1; i < array.length; i++) {
      // Setting a middle index to compare numbers to
      // Assigning a a variable to the length and index of the array
      int newNum = array[i];
      int maybeIndex = i;

      // Setting the conditions of the sorting
      while (maybeIndex > 0 && newNum < array[maybeIndex - 1]) {
        // Going through left to right of the sorrted array
        array[maybeIndex] = array[maybeIndex - 1];
        // Moving the index to the left
        maybeIndex--;
      }
      // This swaps the data to make sure it is in the right place
      array[maybeIndex] = newNum;
    }
    // returning the array
    return array;
  }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/