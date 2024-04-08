import java.util.ArrayList;

public class FavoriteMoviesTwo
{
    public static void main(String[] args)
    {
        // creation of array list
        ArrayList<String> favMovies = new ArrayList<String>();

        //adding to the array list.
        favMovies.add(new String("Mirror Mirror"));
        favMovies.add(new String("Beauty and the Beast"));
        favMovies.add(new String("Brave"));
    // For loop to print out array list of the string "favorite movies"
        for(int i = 0;i < favMovies.size(); i++)
        {
            System.out.println(favMovies.get(i));
        }
        System.out.println("Listed above are my favorite movies!!!");
    }
}
