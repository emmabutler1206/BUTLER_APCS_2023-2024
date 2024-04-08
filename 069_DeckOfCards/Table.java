public class Table
{
  Deck deck = new Deck();
  Card[] cardArray = deck.getCardArray();
  public static void main(String[] args){
    Table table = new Table();
    table.printDeck(table.cardArray);
  }

  // method to print the 52 cards listed in the array 

  public void printDeck(Card[] arr)
  {
    for(Card card: arr)
      System.out.println(card);
  }
}