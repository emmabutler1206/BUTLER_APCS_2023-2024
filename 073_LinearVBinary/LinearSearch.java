
    public class LinearSearch {
        public static void main(String[] args) {
          // Assigning the one thousand sorted number array to the variable "array"
          OneThousandSortedRandomNumbers hi = new OneThousandSortedRandomNumbers();
          int array[] = hi.getSortedNumbers();
          // Created an array of the target number that is being searched for
          int[] numTarget = { -8388, 9807, -4011, 5423, -4, 56, -990, 999 };
      
          // creating a for loop to go throhj array. This will eventually help us find the
          // target numberf :)
          for (int num : numTarget) {
            // creating a variable that is reflective of a linear search, or the result of
            // the search
            int resNum = linearSearch(array, num);
            // Testing to find "target" using an if statement
            if (num == 0) {
              System.out.println("The number " + num + " was not found in the array");
            } else {
              System.out.println("The number " + num + " was found at index in the array");
            }
          }
        }
      
        // Cretaing a methjod used to help find target number
        public static int linearSearch(int[] array, int target) {
          for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
              return i;
            }
          }
          return -1;
        }
      }
