public class Desk {
    // creating in main
    public static void main(String[] args) {
      // initializing main class
      WritingTools write = new WritingTools();
  
      // creating new cases of both pen and pencil to enable them to print in thr main
      // method
      Pen cool = new Pen();
      Pencil hi = new Pencil();
  
      System.out.println(write);
      System.out.println(cool);
      System.out.println(hi);
    }
  }