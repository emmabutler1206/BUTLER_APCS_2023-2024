public class SweetGarage
{
    public static void main(String[] args)
    {
       Car firstCar= new Car( 2023, 1_000, "Mercedes", "Benz", true);
       Car secondCar= new Car(2021, 500, "Ferrari", "F8 Tributo", true);
       Car thirdCar= new Car (2020, 400, "Range Rover", "Land Rover");
       Car fourthCar=new Car (2019, 300, "Corvette", "Stingray");
       Car fifthCar= new Car (2018, 5, "Honda", "Accord");
       System.out.println(firstCar.manufacturerName + " " + firstCar.milesDriven + " " + firstCar.year +" " + firstCar.modelName);
        System.out.println(secondCar.manufacturerName + " " + secondCar.milesDriven + " " + secondCar.year + " " + secondCar.modelName);
        System.out.println(thirdCar.manufacturerName + " " + thirdCar.milesDriven + " " + thirdCar.year + " " + thirdCar.modelName);
        System.out.println(fourthCar.manufacturerName + " " + fourthCar.milesDriven + " " + fourthCar.year + " " + fourthCar.modelName);
        System.out.println(fifthCar.manufacturerName + " " + fifthCar.milesDriven + " " + fifthCar.year + " " + fifthCar.modelName);
        firstCar.revEngine();
         firstCar.engageTurbo();
        secondCar.revEngine();
        secondCar.engageTurbo();
        //Created a garage of cars using an already existing object.
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/