public class StaticMenu {
    public static void main (String [] args){
    
    StaticMenuItem itemOne = new StaticMenuItem();
    StaticMenuItem itemTwo = new StaticMenuItem();
    StaticMenuItem itemThree = new StaticMenuItem();


    itemOne.itemName = "Cartier ring";
    itemOne.itemDescription = "diamond and gold";
    itemOne.printItem();
    
   
    itemTwo.itemName = "Versache heels";
    itemTwo.itemDescription = "Black 2 inch heels with red two inch platforms";
    itemTwo.printItem();


   
    itemThree.itemName = "Rolex Watch";
    itemThree.itemDescription = "The wtach is black and made of platinum";
    itemThree.printItem();
// Static has a side effect of affecting objects. All the object are attatched to the same variable.
    }
}