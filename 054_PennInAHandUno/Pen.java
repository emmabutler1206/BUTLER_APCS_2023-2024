
public class Pen
{
    static String colorOfInk = "red";
    static String colorOfPen = "black";
    static Boolean capOrClicky = true;
    static double inkRemaining = 0.5;

    public static void main(String[] args)
    {}

public static void colorOfInk()
{
    System.out.println("The color of the pens ink is " + colorOfInk);
}

public static void colorOfPen()
{
    System.out.println("The pens color is " + colorOfPen);
}

public static void inkRemaining()
{
    System.out.println("The pen has "+ inkRemaining +  "   of the ink left");
}

public static void capOrClicky()
{
    if (capOrClicky == true)
    {
    System.out.println("The pen cap is off, you can now write");
    System.out.println("heyyyyy");
    }
    else if (capOrClicky == false)
    {
        System.out.println("The pen cannot write, the cap is still on");
    }
}

}



