public class AreaOfRectangles
  {
    public static void main(String[] args)
    {
  double widthOne = 5.5;
  double heightOne = 7.8;
  double recOneAreaInInches= widthOne*heightOne;
  double widthTwo= 99.4;
  double heightTwo=500.32;
  double recTwoAreaInCentimeters= (widthTwo*heightTwo)/12;
  int widthThree= 75*12;
  int heightThree= 800;
  int recThreeAreaInCentimeters= widthThree*heightThree;
 double widthFour= 500029.75;
double heightFour= 90029384/12;
 double recFourAreaInInches= widthFour*heightFour;
  double widthFive = 600000/91.44;
  double heightFive= 9124552.749;
      //As the number 8343491034 is past the scope of both the integer and the double, I just immediatly converted to yards
  double recFiveAreaInYards= widthFive*heightFive;
  System.out.println("Rectangle One has an area of " + recOneAreaInInches + " inches");
  System.out.println("Rectangle Two has an area of " + recTwoAreaInCentimeters + " centimeters");
    System.out.println("Rectangle Three has an area of " + recThreeAreaInCetimeters + " centimeters");
  System.out.println("Rectangle Four has an area of " + recFourAreaInInches + " inches");
    System.out.println("Rectangle Five has an area of " + recFiveAreaInYards + " yards");
    }
  }