public class ChargingCable {
  private String brand;
  private double length;
  private String connectionType;

  // Im assuming that this is the constructor, but I could be wrong
  public ChargingCable(String brand, double length, String connectionType) {
    this.brand = brand;
    this.length = length;
    this.connectionType = connectionType;
  }

  public void Charging(String connectionType)
    {
      if(connectionType.equals(this.connectionType))
         {
          System.out.println("You can charge your device");
        }
        else
        {
          System.out.println("You cannot charge your device");
        }
        }
    

  // We need these getters to acess private varaibles in the class, so that the user sees the connection type. 
  public String getBrand() {
    return brand;
  }

  public double getLength() {
    return length;
  }

  public String getConnectionType() {
    return connectionType;
    }
  public static void main(String[] args){}
}
