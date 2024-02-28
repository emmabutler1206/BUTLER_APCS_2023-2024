public class GasSign {
   public static void main(String[] args) {
    // each type of gas gets a tracker, telling the tpe of gas and the price
       GasPriceTracker unleaded = new GasPriceTracker("Unleaded", 2.49);
       GasPriceTracker plus = new GasPriceTracker("Plus", 2.79);
       GasPriceTracker premium = new GasPriceTracker("Premium", 2.99);
    
       printGasPrices(unleaded);
       printGasPrices(plus);
       printGasPrices(premium);

       // Set program up to increase gas prices by 10 cents.
       unleaded.setPriceOfGas(unleaded.getPriceOfGas() + 0.10);
       plus.setPriceOfGas(plus.getPriceOfGas() + 0.10);
       premium.setPriceOfGas(premium.getPriceOfGas() + 0.10);

       System.out.println("Gas prices after increase:");
       printGasPrices(unleaded);
       printGasPrices(plus);
       printGasPrices(premium);
   }

   public static void printGasPrices(GasPriceTracker gas) {
       System.out.println(gas.getTypeOfGas() + ": $" + gas.getPriceOfGas());
   }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/