public class ClassLister
{
    // Initializing the array
   
    String[] classes = new String[] {"Pysics", "Calculus", "JROTC", "Study Hall", "Spectrum", "Comp Sci"};

// Method that creates a loop for the array and calls to the "classPrinter" method to execute for loop.
    public static void main(String[] args)
    {
        ClassLister hi = new ClassLister();
        hi.classPrinter(hi.classes);
    }

// Method that takes the length of the array printes out each value by increasing "i".
    public void classPrinter(String[] arr)
    {
        for(int i = 0;i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Listed above  are the classes I am taking my senior year!");
    }

}




