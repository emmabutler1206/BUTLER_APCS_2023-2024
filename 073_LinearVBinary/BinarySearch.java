public class BinarySearch {

    // This is being ran in main to start up the program/ array list
    public static void main(String[] args) {
      int[] array = { -8338, 9807, -4011, 5423, -4, 56, -990, 999 };
  
      // Used to find target number
      for (int num : oneThousandSortedRandomNumber) {
        int resNum = binarySearch(array, num);
        if (resNum == -1) {
          System.out.println("The number " + num + " was not found in the array");
        } else {
          System.out.println("The target number " + target + " was found at index " + resNum);
        }
      }
  
    }
  
    public static int binarySearch(int[] array, int target)
    {
      //definong endpoints in the serach.
      int left=0;
      int right = array.length-1;
  
  
  // using a while loop to define hoe the program will loop through the array
      while(left<=right)
        {
          //defininh middle array
          int middleTerm= left+(right-left)/2;
  
  
          //if the target number is found, return the index of the target number
          if(target==array[middleTerm])
          {
            return middleTerm;
          }
          else if(array[middleTerm] < target)
          {
            left= middleTerm+1;
            return left;
          }
        }
    }
  }