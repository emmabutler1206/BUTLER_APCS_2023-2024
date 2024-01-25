public class StaticShoeRack {
    public static void main (String [] args){
    
    StaticShoe shoeThree = new StaticShoe();
    StaticShoe shoeTwo = new StaticShoe();
    StaticShoe shoeOne = new StaticShoe();




    shoeOne.shoeBrand = "Nike";
    shoeOne.size = "11";
    shoeOne.color = "red";
    shoeOne.staticPrintShoe();


    shoeTwo.shoeBrand = "Versace heels";
    shoeTwo.size = "7";
    shoeTwo.color ="black";
    shoeTwo.staticPrintShoe();

    shoeThree.shoeBrand = "gucci flats";
    shoeThree.size = "10";
    shoeThree.color ="beige";
    shoeThree.staticPrintShoe();


    }
} 

