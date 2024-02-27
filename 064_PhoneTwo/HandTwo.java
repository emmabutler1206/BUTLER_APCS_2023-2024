public class HandTwo {
  // Instance variables, used to call methods from "PhoneTwo" class.
  public static void main(String[] args) {
    PhoneTwo newIPhone = new PhoneTwo(true, "lightning", 71, "Iphone X", "green", "Apple");
    newIPhone.onOrOff();
    newIPhone.description();
    newIPhone.PlayMusic();
    newIPhone.charging();
    newIPhone.call911();
    newIPhone.callMom();
    System.out.println(newIPhone);
  }
}