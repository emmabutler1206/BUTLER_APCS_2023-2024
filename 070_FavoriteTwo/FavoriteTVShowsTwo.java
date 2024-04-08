import java.util.ArrayList;

public class FavoriteTVShowsTwo
{
    public static void main(String[] args)
    {
        // creation of array list
        ArrayList<String> favTV = new ArrayList<String>();

        //adding to the array list.
        favTV.add(new String("Naruto"));
        favTV.add(new String("Mashle"));
        favTV.add(new String("Jujustsu Kaisen"));
    // For loop to print out array list of the string "favorir tv shows "
        for(int i = 0;i < favTV.size(); i++)
        {
            System.out.println(favTV.get(i));
        }
        System.out.println("Listed above are my favorite tv shows!!!");
    }
}
