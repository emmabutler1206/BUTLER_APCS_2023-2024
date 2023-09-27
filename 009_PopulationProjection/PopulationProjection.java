    public class PopulationProjection
{
    public static void main(String[] args)
    {
    int population= 312032486;
    int secondsInYear=   31536000;
    int birthEverySecond= 7;
    int deathEverySecond=13;
    int immigrantEverySecond= 45;

    int populationYearOne= population + (secondsInYear/birthEverySecond) - (secondsInYear/deathEverySecond) + (secondsInYear/immigrantEverySecond);
    int populationYearTwo= populationYearOne + (secondsInYear/birthEverySecond) - (secondsInYear/deathEverySecond) + (secondsInYear/immigrantEverySecond);
    int populationYearThree=populationYearTwo + (secondsInYear/birthEverySecond) - (secondsInYear/deathEverySecond) + (secondsInYear/immigrantEverySecond);
    int populationYearFour=populationYearThree + (secondsInYear/birthEverySecond) - (secondsInYear/deathEverySecond) + (secondsInYear/immigrantEverySecond);
    int populationYearFive=populationYearFour + (secondsInYear/birthEverySecond) - (secondsInYear/deathEverySecond) + (secondsInYear/immigrantEverySecond);
    
    System.out.println( "The population of year one is " + populationYearOne + " people");
    System.out.println("The population of year two is " + populationYearTwo + " people");
    System.out.println("The population of year three is " + populationYearThree + " people");
    System.out.println("The population of year four is " + populationYearFour + " people");
    System.out.println("The population of year five is " + populationYearFive + " people" );
    //Used equations that built off of each other.
    // Every four years, a leap year occurs. It adds an extra day onto the year. This knowlege can throw off the accuracy of the data.
    }
}