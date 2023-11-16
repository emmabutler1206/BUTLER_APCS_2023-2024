public class ComputeAnExpression
  {
    public static void main(String[] args)
    {
      ReturningCalculator calc = new ReturningCalculator();
      double variableOne= 9.5;
      double variableTwo= 4.5;
      double variableThree= 2.5;
      double variableFour= 45.5;
      double variableFive= 3.5;
      double variableSix= 3.0;
      double variableSeven= calc.doubleMultiplier(variableOne, variableTwo);
      double variableEight= calc.doubleMultiplier(variableThree, variableSix);
      double variableNine= calc.doubleSubtractor(variableSeven, variableEight);
      double variableTen= calc.doubleSubtractor(variableFour, variableFive);
      double variableEleven= calc.divider(variableNine, variableTen);
      System.out.println(variableEleven);
        
      
      //Used a pre-existing project and integrated methods from a class

    }
  
    
  }

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/