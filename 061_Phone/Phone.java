public class Phone{

    private boolean isOn;
    private String connectionTypeIphone;
    private double currentCharge;
    private String phoneType;
    private String color;
    private String phoneBrand;




public Phone(boolean isOn, String connectionTypeIphone, double currentCharge, String phoneType, String color, String phoneBrand)
{
    this.isOn = isOn;
    this.connectionTypeIphone= connectionTypeIphone;
    this.currentCharge = currentCharge;
    this.phoneType = phoneType;
    this.color = color;
    this.phoneBrand= phoneBrand;
}

public Phone()
{
    isOn = true;
    connectionTypeIphone = "Lightning";
    currentCharge= 89.0;
    phoneType= "13 Pro-Max";
    color = "green";
    phoneBrand="Apple";
}
public static void main(String[] args){}

public void OnOrOff()
{
    if(isOn)
    {
        System.out.println("Your phone is on");
    }
    else
    {
        System.out.println("Your phone is off");
    }
}


public void callMom()
{
    System.out.println("Your mother said you should call more often");
}

public void call911()
{
    System.out.println("What is the matter? Help is on the way");
}

public void description()
{
    System.out.println("The phone is a " + color + phoneBrand + phoneType);
}

public void PlayMusic()
{
    if(isOn)
    {
        System.out.println("Your phone is on, you can play music");
    }
    else
    {
        System.out.println("Your phone is off, you cannot play music");
    }
}
 public void charging()
    {
            currentCharge=100.0;
            System.out.println("Your device is now charging and is at " + currentCharge);
        
    }
}
// Class that contains methods and varaiables that describe attributes of phones.