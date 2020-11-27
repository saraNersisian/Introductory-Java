import java.util.Scanner;
import java.util.Random;

public class Lab11_Game21
{
 public static void main(String [] args)
 {
  int userTotal;
  int computerTotal;
  
  String rollYes;
  
  Scanner keyboard= new Scanner (System.in);
  
  
  System.out.print("\n******************************************************************************** ");
 System.out.print("\n                               GAME TWENTY ONE                                   ");
 System.out.print("\n******************************************************************************** ");

 
  System.out.println(" \nHow to play this game:"+
                       "\n\n\t 1)You are playing against computer \n\t 2)Each player will roll two dice and I will show you your values "+
                       "\n\t 3)Then the computer will roll its dice again and will stay hidden \n\t 4)You should now decide if you want to roll again"+
                       "\n\t 5)Be careful though! because your total should not exceed 21 \n\t 6)If you think you are good then stop the game and I will show each player's total"+
                       "\n\t 7)Finally the winner will be announced"+
                       "\n\n\t\t\t\t\t\t\t~~~~~~~~~~~~ GOOD LUCK ~~~~~~~~~~~~ ");
                      
  System.out.println("\n\nReady to Start the game? (y)");
  
  rollYes=keyboard.nextLine();
  
  //dely when rolling 
  rollingLoading ();

  dice diceUser=new dice();
  dice diceComputer = new dice();

   
 int valueUser1=diceUser.getValue1();
 int valueUser2=diceUser.getValue2();
 
 System.out.println("\n--------------------------- ROUND ONE -------------------------------\n");
 
 System.out.println("You have rolled "+ valueUser1+" and "+ valueUser2);

 int valueCom1= diceComputer.getValue1();
 int valueCom2= diceComputer.getValue2();

  System.out.println("User's points : "+ diceUser.total(valueUser1,valueUser2));
 // System.out.println("Computer's points :"+ diceComputer.total(valueCom1,valueCom2));
 
  diceComputer.roll();
   
  valueCom1+= diceComputer.getValue1();
  valueCom2+= diceComputer.getValue2();

 
 System.out.println("\nDo you want to roll again?");
 System.out.println("(The computer's total is hidden, be careful not to exceed 21)");
    System.out.println("\n\nWant to roll? (y/n)");
 rollYes=keyboard.nextLine();  

 while (rollYes.equals("y") || rollYes.equals("Y"))
 {
 
  rollingLoading ();


   diceUser.roll();
  
   valueUser1+=diceUser.getValue1();
   valueUser2+=diceUser.getValue2();
   
   int newUserValue1=diceUser.getValue1();
   int newUserValue2=diceUser.getValue2();
   
   //computer should not roll when its total is more than 15, because the chances are more to lose then
   
   if(diceComputer.total(valueCom1,valueCom2)>=15){
   valueCom1+=0;
   valueCom2+=0;}
   
   else{
    diceComputer.roll();
   
  valueCom1+= diceComputer.getValue1();
  valueCom2+= diceComputer.getValue2();}



 System.out.println("\n--------------------------- NEXT ROUND -------------------------------\n");
    System.out.println("You have rolled "+ newUserValue1+" and "+ newUserValue2);
   System.out.println("User's points : "+ diceUser.total(valueUser1,valueUser2));
 //System.out.println("Computer's points : "+ diceComputer.total(valueCom1,valueCom2));
 
  if (diceComputer.total(valueCom1,valueCom2)>21) { 
   System.out.println("\n<<<<--------------------------- GAME OVER ------------------------------->>>>\n");
   System.out.println("\nThe computers's total exceeded 21,you won!");
      System.exit(0);}
 
  if (diceUser.total(valueUser1,valueUser2)>21 ){
   System.out.println("\n<<<<--------------------------- GAME OVER ------------------------------->>>>\n");
   System.out.println("\n Your total exceeded 21,you lost!");
      System.exit(0);}
 

 System.out.println("\nDo you want to roll again?");
 System.out.println("(The computer's total is hidden, be careful not to exceed 21)");
   System.out.println("\n\nWant to roll? (y/n)");

 rollYes=keyboard.nextLine();  

 }
  if (rollYes.equals("n") || rollYes.equals("N"))
  {
    System.out.println("\n<<<<--------------------------- GAME OVER ------------------------------->>>>\n");

    System.out.println("\nUser's points : "+ diceUser.total(valueUser1,valueUser2));
    System.out.println("Computer's points : "+ diceComputer.total(valueCom1,valueCom2));
  } 
    
  if( diceComputer.total(valueCom1,valueCom2)>diceUser.total(valueUser1,valueUser2)){
    System.out.println("You lost by "+ (diceComputer.total(valueCom1,valueCom2)-diceUser.total(valueUser1,valueUser2))+" points");}
  
  else if( diceComputer.total(valueCom1,valueCom2)==diceUser.total(valueUser1,valueUser2)){
     System.out.println("\nThe game has no winner, equal points! "+ (diceComputer.total(valueCom1,valueCom2)));}
  

   else{
       System.out.println("\nYou won by "+(diceUser.total(valueUser1,valueUser2)-diceComputer.total(valueCom1,valueCom2))+" points");}


   
 }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 public static void rollingLoading ()
 {
 
 System.out.print("\nROLLING ");

 for (int i=1; i<=3; i++)
{
  try {
     Thread.sleep(500);
       System.out.print(". ");}
      catch (InterruptedException ie) {
                ie.printStackTrace(); }
 }

try {
      Thread.sleep(700);
       System.out.print("  ");}
       catch (InterruptedException ie) {
                ie.printStackTrace(); }

System.out.println(" ");

/*
System.out.print("\nROLLING (Showing numbers)  ");
char bc='\b';
 for (int i=1; i<=6; i++)
{
Random randomNumber= new Random();
  int dieNumberLoading= randomNumber.nextInt(6)+1;

  try {
     Thread.sleep(800);
       System.out.print( dieNumberLoading);}
      //  System.out.print("\b");}
      catch (InterruptedException ie) {
                ie.printStackTrace(); }
                
           try {
     Thread.sleep(800);
       System.out.print(bc);}
      catch (InterruptedException ie) {
                ie.printStackTrace(); }

 }
*/

try {
      Thread.sleep(500);
       System.out.print("  ");}
       catch (InterruptedException ie) {
                ie.printStackTrace(); }

 }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
}
