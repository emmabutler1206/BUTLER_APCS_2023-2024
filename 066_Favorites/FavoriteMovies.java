public class FavoriteMovies
{
  public static void main(String[] args)
  // Put (string) movies into an index value array.
  {
    String[] favMovies = new String[3];

    favMovies[0]= "Harry Potter";
    favMovies[1]="Star Wars";
    favMovies[2]= "Mirror Mirror";

    System.out.println("My favorite movies are:" + favMovies[0] + "," + favMovies[1] + "," + favMovies[2]);
  }
}