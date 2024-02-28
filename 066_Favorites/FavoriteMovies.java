public class FavoriteMovies {
  public static void main(String[] args)
  {
  // Used a string array to store the titles of the movies(That are strings).
 String[] movie = new String[] {"Harry Potter and the Sourceror's Stone", "Star Wars: The Last Jedi", "Tron"};

    System.out.println("My favorite movies to watch are:");
    for (String favMovie : movie) {
      System.out.println(favMovie);
    }
  }
}
