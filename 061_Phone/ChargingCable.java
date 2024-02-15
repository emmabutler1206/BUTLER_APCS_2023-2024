public class ChargingCable
{
    private String brand;
    public double length;
    private String connectionType;

    public ChargingCable(String brand, double length, String connectionType)
    {
        this.brand= brand;
        this.length= length;
        this.connectionType = connectionType;
    }
    public static void main(String[] args){}

    public void charging(String connectionType, String connectionTypeIpad)
    {
        if (connectionTypeIpad.equals(connectionType))
        {
            System.out.println("Your device is now charging");
        }
        else
        {
            System.out.println("You cannot charge this device")
        }
    }
    // getters 
    public String getBrand()
    {
        return brand;
    }
    public double getLength()
    {
        return length;
    }
    public String getconnnectionType()
    {
        return connectionType;
    }
}