public class Card
{
    String suit;
    String value;



    public Card(String suit, String value)
    {
        this.suit= suit;
        this.value=value;
    }

    public String getSuit()
    {
        return suit;
    }
    public String getValue()
    {
        return value;
    }

    public String toString()
    {
        return value + " " +  suit;
    }

    public static void main(String[] args){}
    
}