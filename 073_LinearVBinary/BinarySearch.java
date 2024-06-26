public class BinarySearch {

    // This is being ran in main to start up the program/ array list
    public static void main(String[] args) {
      int[] array = { -8338, 9807, -4011, 5423, -4, 56, -990, 999 };
  
     OneThousandSortedRandomNumbers hi = new OneThousandSortedRandomNumbers();
     BinarySearch hey = new BinarySearch();
      // Used to find target number
  
      for (int num : array) {
  
        int resNum = hey.binarySearch(hi.getSortedNumbers(), num );
        if (resNum == -1) {
          System.out.println("The number " + num + " was not found in" + resNum + " in the array");
        } else {
          System.out.println("The target number" + num + "was found at index " + resNum);
        }
      }
  
    }
  
    public int binarySearch(int[] array, int target)
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
        return -1;
    }
  }
  //Could not get this program to run, however, please grade it as is!

/*

1/3 - Compile/Content
-So it goes.
1/1 - Formatting
1/1 - Comments

*/