public class PhoneTwo {
  private boolean isOff;
  private String connectionType;
  private int charge;
  private String phoneColor;
  private String iPhoneName;
  private String iPhoneCompany;

  public PhoneTwo(boolean isOff, String connectionType, int charge, String phoneColor, String iPhoneName,
      String iPhoneCompany) {
    this.isOff = isOff;
    this.connectionType = connectionType;
    this.charge = charge;
    this.phoneColor = phoneColor;
    this.iPhoneName = iPhoneName;
    this.iPhoneCompany = iPhoneCompany;
  }

  public PhoneTwo() {
    isOff = true;
    connectionType = "lightining";
    charge = 33;
    phoneColor = "green";
    iPhoneName = "galaxy Se";
    iPhoneCompany = "Samsung";
  }

  public void onOrOff() {
    if (isOff) {
      System.out.println("The phone is off");
    } else {
      System.out.println("The phone is on");
    }
  }

  public String toString() {
    return "The phone is " + isOff + " with a connection type that is adapted to a " + connectionType
        + " port. The current charge of the phone is  " + charge + ". The phone is a" + phoneColor + " " + iPhoneName
        + " from " + iPhoneCompany + ".";
  }

  public void description() {
    System.out.println("The phone is " + isOff + " with a connection type that is adapted to a " + connectionType
        + " port. The current charge of the phone is  " + charge + ". The phone is a" + phoneColor + " " + iPhoneName
        + " from " + iPhoneCompany + ".");
  }

  public void PlayMusic() {
    if (isOff == false) {
      System.out.println("The phone is on and is playing music");
    } else {
      System.out.println("The phone is off and cannot play music");
    }
  }

  public void charging() {
    System.out.println("The phone is charging");
  }

  public void call911() {
    System.out.println("The phone is about to call 911");
    System.out.println("What kind of danger are you in?");
  }

  public void callMom() {
    System.out.println("Hi sweetie, how are you?");
  }

  public static void main(String[] args){}

}
