import java.util.Scanner;

public class BlackjackOne 
{
  public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
      int firstCard = (int)(Math.random()*10)+1;
      int secondCard = (int)(Math.random()*10)+1;
      int dealerFirstCard = (int)(Math.random()*10)+1;
      int dealerSecondCard = (int)(Math.random()*10)+1;
      int dealerThirdCard = (int)(Math.random()*10)+1;
      int dealerTotal = dealerFirstCard + dealerSecondCard + dealerThirdCard;;
      int total = firstCard + secondCard;
      String choice = "";
    
  System.out.println("Welcome to blackjack, you will be dealt two cards, you will be able to hit or stand. If you get a card higher than 21 you bust");
    if( firstCard == 1)
    {
      System.out.println("You were dealt an ace, which is one point");
    }
     else if (firstCard==2)  
    {
    System.out.println("You were dealt a two, which is two points");
    }
    else if (firstCard==3)
    {
      System.out.println("You were dealt a three, which is three     points");
    }
    else if (firstCard==4)
    {
      System.out.println("You were dealt a four, which is four points");
    }
    else if (firstCard==5)
    {
      System.out.println("You were dealt a five, which is five points");
    }
    else if (firstCard==6)
    {
      System.out.println("You were dealt a six, which is six points");
    }
    else if (firstCard==7)
    {
      System.out.println("You were dealt a seven, which is seven points");
    }
    else if (firstCard==8)
    {
      System.out.println("You were dealt an eight , which is eight points");
    }
    else if (firstCard==9)
    {
      System.out.println("You were dealt a nine, which is nine points");
    }
    else 
    {
      System.out.println("You were either dealt a king, queen, or jack, all of which are ten points");
    }

    if( secondCard == 1)
    {
      System.out.println("You were dealt an ace, which is one point");
    }
     else if (secondCard==2)  
    {
    System.out.println("You were dealt a two, which is two points");
    }
    else if (secondCard==3)
    {
      System.out.println("You were dealt a three, which is three     points");
    }
    else if (secondCard==4)
    {
      System.out.println("You were dealt a four, which is four points");
    }
    else if (secondCard==5)
    {
      System.out.println("You were dealt a five, which is five points");
    }
    else if (secondCard==6)
    {
      System.out.println("You were dealt a six, which is six points");
    }
    else if (secondCard==7)
    {
      System.out.println("You were dealt a seven, which is seven points");
    }
    else if (secondCard==8)
    {
      System.out.println("You were dealt an eight , which is eight points");
    }
    else if (secondCard==9)
    {
      System.out.println("You were dealt a nine, which is nine points");
    }
    else 
    {
      System.out.println("You were either dealt a king, queen, or jack, all of which are ten points");
    }

      System.out.println("your total value of card is " + total);
      System.out.println("Would you like to hit or stand?");
      choice = scan.nextLine();
      
      if(choice.equals("hit"))
         {
        System.out.println("You chose to hit, you were dealt a card");
        int thirdCard = (int)(Math.random()*10)+1;
       
        int newTotal = total + thirdCard;
        System.out.println("Your new total is " + newTotal);

                if( thirdCard ==1)
                {
                  System.out.println("You were dealt an ace, which is one point");
                }
                 else if (thirdCard == 2)  
                {
                System.out.println("You were dealt a two, which is two points");
                }
                else if (thirdCard==3)
                {
                  System.out.println("You were dealt a three, which is three     points");
                }
                else if (thirdCard==4)
                {
                  System.out.println("You were dealt a four, which is four points");
                }
                else if (thirdCard==5)
                {
                  System.out.println("You were dealt a five, which is five points");
                }
                else if (thirdCard==6)
                {
                  System.out.println("You were dealt a six, which is six points");
                }
                else if (thirdCard==7)
                {
                  System.out.println("You were dealt a seven, which is seven points");
                }
                else if (thirdCard==8)
                {
                  System.out.println("You were dealt an eight , which is eight points");
                }
                else if (thirdCard==9)
                {
                  System.out.println("You were dealt a nine, which is nine points");
                }
                else 
                {
                  System.out.println("You were either dealt a king, queen, or jack, all of which are ten points");



                }
                if( firstCard == 1 || secondCard ==1)
                  {
                    System.out.println("You still have an  ace, which is one point");
                  }
                   else if (firstCard==2 || secondCard==2)  
                  {
                  System.out.println("You still have a two, which is two points");
                  }
                  else if (firstCard==3 || secondCard==3)
                  {
                    System.out.println("You still have a three, which is three     points");
                  }
                  else if (firstCard==4 || secondCard==4)
                  {
                    System.out.println("You still have a  four, which is four points");
                  }
                  else if (firstCard==5 || secondCard==5)
                  {
                    System.out.println("You still have a  five, which is five points");
                  }
                  else if (firstCard==6 || secondCard==6)
                  {
                    System.out.println("You still have a six, which is six points");
                  }
                  else if (firstCard==7 || secondCard==7)
                  {
                    System.out.println("You still have a seven, which is seven points");
                  }
                  else if (firstCard==8 || secondCard==8)
                  {
                    System.out.println("You stil have an eight , which is eight points");
                  }
                  else if (firstCard==9 || secondCard==9)
                  {
                    System.out.println("You still have a nine, which is nine points");
                  }
                  else 
                  {
                    System.out.println("You still have a king, queen, or jack, all of which are ten points");
                  }
                  System.out.println("Your new total is " + newTotal);
                  
                  if (newTotal >= 21)
                  {
                    System.out.println("You busted, you loose");
                  }
                  else if(newTotal==21 && dealerTotal != 21)
                  {
                    System.out.println(" You Blackjack!");
                  }
                  else if (newTotal<= dealerTotal && dealerTotal<=21)
                  {
                    System.out.println("You loose");
                  }
                  else if (newTotal>= dealerTotal && newTotal<=21)
                  {
                    System.out.println("You win ");
                  }
                
                }  
        
         //Disclaimer I grouped jacks,queens, and kings together because they all had the same point value
         //Randomly gave a user two cards and offered them the chance to be able win or loose in black jack

      
      }
     
      
    }


