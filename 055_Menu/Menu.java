public class Menu {

public static void main (String[] args){
    
    MenuItem itemOne = new MenuItem();
    MenuItem itemTwo = new MenuItem();
    MenuItem itemThree = new MenuItem();


    itemOne.itemName = "Cartier ring";
    itemOne.itemDescription = "diamond and gold";
    
    itemOne.printItem();
    
   
    itemTwo.itemName = "Versache heels";
    itemTwo.itemDescription = "Black 2 inch heels with red two inch platforms";
    
    itemTwo.printItem();


   
    itemThree.itemName = "Rolex Watch";
    itemThree.itemDescription = "The watch is black and made of platinum";
    
    itemThree.printItem();

    }
}
// For ecah item, created a class variables that describes the object and description.

/*

2/3 - Compile/Content
-Very close, but you should have printed all the items at the end so we can see the issue with the static overwriting.
1/1 - Formatting
1/1 - Comments

*/