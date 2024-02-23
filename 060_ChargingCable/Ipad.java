public class IPad{

    private boolean isOn;
    private String connectionTypeIphone;
    private double currentCharge;
    private String ipadType;
    private String color;
    private String phoneBrand;




public IPad(boolean isOn, String connectionTypeIphone, double currentCharge, String ipadType, String color, String phoneBrand)
{
    this.isOn = isOn;
    this.connectionTypeIphone= connectionTypeIphone;
    this.currentCharge = currentCharge;
    this.ipadType = ipadType;
    this.color = color;
    this.phoneBrand= phoneBrand;
}

public IPad()
{
    isOn = true;
    connectionTypeIphone = "Lightning";
    currentCharge= 89.0;
    ipadType= "13 Pro-Max";
    color = "green";
    phoneBrand="Apple";
}
public static void main(String[] args){}

public void OnOrOff()
{
    if(isOn)
    {
        System.out.println("Your ipad is on");
    }
    else
    {
        System.out.println("Your ipad is off");
    }
}


public void facetimeMom()
{
    System.out.println("Your mother said you should call more often");
}



public void description()
{
    System.out.println("The ipad is a " + color + phoneBrand + ipadType);
}

public void PlayMusic()
{
    if(isOn)
    {
        System.out.println("Your ipad is on, you can play music");
    }
    else
    {
        System.out.println("Your ipad is off, you cannot play music");
    }
}
 public void charging()
    {
            currentCharge=100.0;
            System.out.println("Your device is now charging and is at " + currentCharge);
        
    }
}
// Class that contains methods and varaiables that describe attributes of phones.