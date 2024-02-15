public class Hand{
    public static void main(String[] args)
    {
        Phone iPhone = new Phone(true,"lightning",67.0,"12 Pro",  "green", "Apple");
        iPhone.OnOrOff();
        iPhone.description();
        iPhone.callMom();
        iPhone.call911();
        iPhone.PlayMusic();
        iPhone.charging();


    }
}