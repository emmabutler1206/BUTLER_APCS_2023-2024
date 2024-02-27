public class FavoriteTVShows {
  private String[] tvShows;

  // Used a string array to store the titles of the tv shows.
  public FavoriteTVShows() {
    tvShows = new String[] { "Naruto", "Jujutsu Kaisen", "Mashle" };
  }

  public void printTVShows() {
    System.out.println("My favorite TV shows to watch are:");
    for (String favShows : tvShows) {
      System.out.println(favShows);
    }
  }
}