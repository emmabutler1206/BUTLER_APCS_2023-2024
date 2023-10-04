public class Garage
{
    public static void main(String[] args)
    {
        Car futureCar = new Car( 2023, 1_000, "Porsche", " 911 GT3 RS" );
        System.out.println(futureCar.manufacturerName);
        System.out.println(futureCar.modelName);
    }

}