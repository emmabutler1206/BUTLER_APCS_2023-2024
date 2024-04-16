import java.util.Scanner;

public class SelectionSortSomeInteger {
  public static void main(String[] args) {
    // Creating a scanner object of the scanner class
    Scanner scan = new Scanner(System.in);
    // Asking user to input number of integers to be sorted
    System.out.println("Please list the number of integers you want generated. Know that the random numbers will be between 1-1000");
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
    int sortedNumArray[] = SelectionSorter(array);

    // Using a for loop to print out the sorted array
    for (int num : sortedNumArray) {
      // Printing the array
      System.out.println(num + " ");
    }
  }

  // Method for sorting the array
  public static int[] SelectionSorter(int[] array) {
    // Setting up how the loop will search through the data
    for (int i = 0; i < array.length; i++) {
      // Setting a middle index to compare numbers to
      int middleIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        // Setting the conditions of the sorting
        if (array[j] < array[middleIndex]) {
          // The next round of sorting data
          middleIndex = j;
        }
      }
      // Swapping the data to ensure that the array is sorted
      //Assigning a middle term
      int newNum = array[middleIndex];
      // When number is found, assign new middle term
      array[middleIndex] = array[i];
      //
      array[i] = newNum;
    }
        return array;
    }
  }
