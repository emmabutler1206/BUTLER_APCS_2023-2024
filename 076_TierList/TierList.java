public class TierList {
    
    public static void main(String[] args)
    {
        // Creation of the 2D Array
        String[][] bestDisneyMovies = {
            {"S-Tier","Beauty and the Beast", "Frozen"},
            {"A-Tier", "The Little Mermiad","Moana"},
            {"B-Tier", "The princess and the Frog", "Tangled"},
            {"C- Tier","The Lion King", "Snow white and the Seven Dwarfs"}
        };
       
         //Prining out tiers and corresponding movies
         //Going through rows and then columns
        for(int row=0; row < bestDisneyMovies.length; row++)
        {
            for(int column =0; column < bestDisneyMovies[row].length; column++)
            {
                System.out.println(bestDisneyMovies[row][column]);
            }
            System.out.println();
        }
    

           
           
        }
    }

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/