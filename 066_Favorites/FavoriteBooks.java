public class FavoriteBooks {
  private String[] books;
  // Used a string array to store the titles of the books.
  {
    books = new String[] { "Harry Potter", "A Winter's Promise", "A Court of Thrones and Roses" };
  }

  public void printBooks() {
    System.out.println("my favorite books are:");
    for (String book : books) {
      System.out.println(book);
    }
  }
}

// This class is used to print out the sentances that contain information in the
// other classes.
public class Main {
  public static void main(String[] args) {
    FavoriteMovies favoriteMovies = new FavoriteMovies();
    favoriteMovies.printMovies();

    FavoriteNumbers favoriteNumbers = new FavoriteNumbers();
    favoriteNumbers.printNumbers();

    FavoriteTVShows favoriteTVShows = new FavoriteTVShows();
    favoriteTVShows.printTVShows();

    FavoriteBooks favoriteBooks = new FavoriteBooks();
    favoriteBooks.printBooks();
  }
}
