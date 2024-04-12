public class PositiveNegativeAnalysis {
  //

  // Goes through array and determines if ecah number is positve, and then returns
  // a value
  public int PosNum() {
    int pos = 0;
    for (int i = 0; i < 1000; i++) {
      if (randomNumber > 0) {
        pos++;
      }
    }
    return pos;
  }

  // Goes through array and determines if ecah number is negative, and then
  // returns a value
  public int NegNum() {
    int neg = 0;
    for (int i = 0; i < 1000; i++) {
      if (randomNumber < 0) {
        neg++;
      }
    }
    return neg;
  }

  // Find a positive number and then adds it to the previos one to find the sum
  public int sumOfPos() {
    int sumOfPos = 0;
    for (int i = 0; i < 1000; i++) {
      if (randomNumber > 0) {
        sumOfPos += randomNumber;
      }
    }
    return sumOfPos;
  }

  // Find a negative number and then adds it to the previos one to find the sum
  public int sumOfNeg()
    {
      for(int i =0; i<1000; i++)
        {
          if(randomNumber<0)
          {
            sumOfNeg+=randomNumber;
          }
        }
      return sumOfNeg;
    }

  public static void main(String[] args) {
  }
}

