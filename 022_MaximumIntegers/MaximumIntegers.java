public class MaximumIntegers
{
    public static void main(String[] args)
    { 
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println( max + " ," + min);
        int overFlowMax = 1_000_000;
        int underFlowMax = 745;
        int newMax = ((max + 1) + (max + 1) + overFlowMax);
        int newMin = min - ( min -(underFlowMax));
        System.out.println( newMax + " ," + newMin);
        //Overflowed and underflowed variables 

    }
}









