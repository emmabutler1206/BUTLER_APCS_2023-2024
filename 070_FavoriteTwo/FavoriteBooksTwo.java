import java.util.ArrayList;

public class FavoriteBooksTwo
{
    public static void main(String[] args)
    {
        ArrayList<String> favBooks = new ArrayList<String>();

        //adding to the array list.
        favBooks.add(new String("A Court of Thorns and Roses"));
        favBooks.add(new String("Throne of Glass"));
        favBooks.add(new String("Harry Potter"));

        for(int i = 0;i < favBooks.size(); i++)
        {
            System.out.println(favBooks.get(i));
        }
        System.out.println("Listed above  are the classes I am taking my senior year!");
    }
}


/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/