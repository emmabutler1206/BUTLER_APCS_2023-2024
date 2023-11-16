public class LorumIpsumStringMethods
{
    public static void main(String[] args)
    {
        String ipsumFull = "            Dessert ice cream tiramisu toffee wafer candy cake tart caramels. Jelly-o tart liquorice gingerbread chocolate bar marshmallow. Muffin carrot cake cake tiramisu powder biscuit muffin. Marzipan donut croissant lollipop jelly-o danish shortbread croissant topping.          ";
        String ipsumShort= ipsumFull.trim();
        String letter= "q";
        String letterTwo = "z";
        System.out.println("The length of cupcake ipsum  is " + ipsumFull.length());  
        System.out.println("The new blob is " + ipsumShort.length());
        System.out.println(ipsumShort.toUpperCase());
        System.out.println(ipsumShort.toLowerCase());
        System.out.println("Is " + ipsumFull + " equal to " + ipsumShort + "?" + ipsumShort.equals(ipsumFull));
        System.out.println("Is " + ipsumShort + " equal to " + ipsumShort + "?" + ipsumShort.equals(ipsumShort));
        System.out.println("The letter " + letter + " is at the index " + ipsumShort.indexOf(letter) + " in the word " + ipsumShort);
        System.out.println( " Here is the replaced ipsum with o instead of x" + ipsumShort.replace("o","x"));
        System.out.println(" Is the word " + ipsumShort + " contan the letters " + letterTwo + "? " + ipsumShort.contains(letterTwo));
//Used string methods and copied and pasted cupcake ipsum. Also practiced using methods.

    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/