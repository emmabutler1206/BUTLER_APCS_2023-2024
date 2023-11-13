public class SubstringPrinter
{
    public static void main(String[] args)
    {
        String sentance = "The quick brown fox jumps over the lazy dog.";
        System.out.println(sentance.substring(40,43));
        System.out.println(sentance.substring(16,19));
        System.out.println(sentance.substring(37,39));
        System.out.println(sentance.substring(17,23));
        System.out.println(sentance.substring(42,43));
        // Put sentace into a string to be able to give substrings based on the index given
    }
}