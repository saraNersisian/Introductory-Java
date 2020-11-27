import java.util.Scanner;
import java.util.Random;

public class lab7
{
 public static void main (String [] args)
 {
 int guess1;
 int rand;
 
 Scanner keyboard = new Scanner(System.in);
 Random randNums = new Random();
 
 do
 {
 System.out.println("Pick a number between 0-20");
 guess1=keyboard.nextInt();
 if (guess1>20)
 System.out.println("OUT OF RANGE! Please Pick a number in range of 0-20 ");
 } while( guess1>20);
 
 System.out.println("I will roll a dice and if you get lucky and it turned to "
                      + guess1 + " You are a WINNER!"
                      +"\nfor your prize I will roll the dice again!"
                      +"\nIf the number was an EVEN number, I will multiply it by 2"
                      +"\nIf it was an ODD number, then i would give you the odd number amount itself!"
                      +"\nIf you lost first time, DON'T WORRY! I will give you one more chance!");
 System.out.println();
 System.out.println("ROLLING THE DICE...");
 System.out.println();
 
 rand = randNums.nextInt(20) + 1;
 System.out.println("*********** The winner number is "+ rand+" ***********");
 
 if(rand==guess1)
 winner(guess1);
  
 else if (rand!=guess1)
 secondChance();
     
 }//main closed
 
 
 public static void winner (int guess)
 {
 
   int prize;
   int rand;
   Random randNums = new Random();

   System.out.println("Yaaaayyyyy!!!\nYOU ARE LUCKY!!!");
  rand = randNums.nextInt(50) + 1;
  if(rand%2==0)
   {
     prize=rand*2;
     System.out.println("Your prize is $"+prize);
    }
  else  
    {
     prize=rand;
     System.out.println("Your prize is $"+prize);
    }
 }//winner closed
 
 public static void secondChance()
 {
   int guess2;
   int rand;
   Scanner keyboard = new Scanner(System.in);
   Random randNums = new Random();

   System.out.println("\nYou have one more chance");
   do
 {
 System.out.println("Pick a number between 0-20");
 guess2=keyboard.nextInt();
 if (guess2>20)
 System.out.println("OUT OF RANGE! Please Pick a number in range of 0-20 ");
 } while( guess2>20);

  
   System.out.println();
   System.out.println("ROLLING THE DICE AGAIN...");
   System.out.println();
   
   rand = randNums.nextInt(20) + 1;
   System.out.println("*********** The winner number is "+ rand+" ***********");

   if(rand==guess2)
   winner(guess2);
   else 
   System.out.println(":( :( :( :( :( SORRY ): ): ): ): ): ):  \nYou have lost! ");
 }//secondChance closed
 
}//class closed