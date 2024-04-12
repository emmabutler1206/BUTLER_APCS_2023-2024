import java.util.ArrayList;
public class OneThousandPositiveOrNegativeInts {

staticArrayList<Integer> randomNumber;

  public static void main(String[] args) {

   OneThousandPositiveOrNegativeInts foo = new OneThousandPositiveOrNegativeInts();


    // Creates 1000 random numbers ranging from -1000000 to 1000000
    for (int i = 0; i < 1000; i++) {
      int num = ((int) (1 + Math.random() * 2000000) - 1000000);
      foo.randomNumber.add(num);
    }
  }

  // Returns the array list of random numbers
  public  static ArrayList<Integer> getRandomNumbers() {
    return randomNumber;
  }
}
// Couldnt figure out how to get it to run :(