public class GasPriceTracker {
    private String typeOfGas;
    private double priceOfGas;
 
    public GasPriceTracker(String typeOfGas, double priceOfGas) {
        this.typeOfGas = typeOfGas;
        this.priceOfGas = priceOfGas;
    }
 
    public String getTypeOfGas() {
        return typeOfGas;
    }
 
    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }
 
    public double getPriceOfGas() {
        return priceOfGas;
    }
 
    public void setPriceOfGas(double priceOfGas) {
        this.priceOfGas = priceOfGas;
    }
    public static void main(String[] args){}
 }