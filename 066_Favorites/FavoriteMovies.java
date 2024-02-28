public class FavoriteMovies {
  // Used a string array to store the titles of the movies(That are strings).
  private String[] movie = new String[

  public FavoriteMovies() {
        movie[0] = "Harry Potter and the Sourceror's Stone";
        movie[1] = "Star Wars: The Last Jedi";
        movie[2] = "Tron";
    }

  public void printMovies() {
    System.out.println("My favorite movies to watch are:");
    for (String favMovie : movie) {
      System.out.println(favMovie);
    }
  }
}

/*

0/3 - Compile/Content
-These seem like they're in process. Make me regrade them when they're done.
1/1 - Formatting
1/1 - Comments

*/