public class FavoriteNumbers {
  private int[] number = {111,333,1222};

  // Used an int array to store the favorite numbers(ints.
  public void printNumbers() {
    System.out.println("I find myself drawn to these number");
    for (int favoriteNumber : number) {
      System.out.println(favoriteNumber);
    }
  }
}