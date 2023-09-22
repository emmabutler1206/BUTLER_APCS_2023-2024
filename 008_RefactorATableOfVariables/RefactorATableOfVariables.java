    public class RefactorATableOfVariables
{
    public static void main(String[] args)
    {
        int rowOneColumnOne = 1;
        int rowTwoColumnOne = 2;
        int rowThreeColumnOne = 3;
        int rowFourColumnOne = 4; 

        int rowOneColumnTwo = rowOneColumnOne*rowOneColumnOne;
        int rowOneColumnThree = rowOneColumnOne*rowOneColumnOne*rowOneColumnOne;
        int rowTwoColumnTwo= rowTwoColumnOne*rowTwoColumnOne;
        int rowTwoColumnThree= rowTwoColumnOne*rowTwoColumnOne*rowTwoColumnOne;
        int rowThreeColumnTwo= rowThreeColumnOne*rowThreeColumnOne;
        int rowThreeColumnThree= rowThreeColumnOne*rowThreeColumnOne*rowThreeColumnOne;
        int rowFourColumnTwo= rowFourColumnOne*rowFourColumnOne;
        int rowFourColumnThree= rowFourColumnOne*rowFourColumnOne*rowFourColumnOne;

        System.out.println(" " + "a" + " " +   "a^2" + " " +  "a^3");
        System.out.println( " " + rowOneColumnOne + " " + rowOneColumnTwo + "   " +   rowOneColumnThree);
        System.out.println( " " + rowTwoColumnOne + " " + rowTwoColumnTwo + "   " +   rowTwoColumnThree);
        System.out.println( " " + rowThreeColumnOne + " " +rowThreeColumnTwo + "   " +   rowThreeColumnThree);
        System.out.println( " " + rowFourColumnOne + " " +rowFourColumnTwo + "  " +rowFourColumnThree);
        //Used complex variable names to make a table!
        }
}