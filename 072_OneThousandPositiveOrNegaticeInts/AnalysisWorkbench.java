public class AnalysisWorkbench {
    public static void main(String[] args) {
      // Initialzing the array
      Main mm = new Main();
      ArrayList<Integer> randomNumber = mm.getRandomNumbers();
      PositiveNegativeAnalysis math = new PositiveNegativeAnalysis();
      // Printong out and executing all methods in PositiveNegativeAnalysis.java
      System.out.println("The sum of the negative numbers is: " + math.sumOfNeg(randomNumber));
      System.out.println("The sum of the negative numbers is: " + math.sumOfPos(randomNumber));
      System.out.println("Here are all of the positive numbers: " + math.PosNum(randomNumber));
      System.out.println("Here are all of the negative numbers: " + math.NegNum(randomNumber));
      System.out.println("Here is the sum of every number in the array list:" + math.sumOfAll(randomNumber));
  
    }
  }