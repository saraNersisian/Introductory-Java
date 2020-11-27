import java.util.Scanner;

public class Lab5
{
 public static void main (String [] args)
 {
  int userAnswer=0;
  int triedTimes=0;
  char hint;
  String enter;
 
 
 Scanner keyboard=new Scanner (System.in);
 System.out.println("If you are a math genius, solve for x ");
 System.out.println("You have 3 chances to guess the answer!");
  
  do
  {
  System.out.println(" \nif   2+4=12 \n     8+2=80 \n     3+6=27 \n\nThen 7+8= x "); 
 System.out.println("\n----> What is the value of x : ");
 
 userAnswer=keyboard.nextInt(); 
 
 if ( triedTimes<3 && userAnswer!=105)   
  {
 System.out.println("Wrong answer!!! Try again");
 
 System.out.println("\n Want to see a HINT????");
 System.out.println("(Enter Y for YES or N for NO)");

   hint=keyboard.next(".").charAt(0);

   
      if(hint=='y' || hint =='Y')
      {
        System.out.println("___________________ HINT ___________________\n\n "
                          +"based on the first example: 2+4=6 -----> 12/6=2\n");
         System.out.println("_____________________________________________");
        System.out.println("\n\t\t\t\t Press 'y' to continue");
        enter=keyboard.next(".");    
      }
  else if (hint=='n' || hint=='N')
      { 
  System.out.println();
      }
    
  triedTimes++;
  System.out.printf("******************* (You have tried %d time(s) out of 3) ************************\n",triedTimes);
  if (triedTimes==2)
  System.out.println("\n************************** LAST CHANCE!! *****************************");
  if(triedTimes==3)
      {
       System.out.println("\n:(( :(( :(( :(( :(( (SORRY You Have Used All Your chances! )): )): )): )): )): )): )):"
                           +" \n\n\t\t\t\t\t\t\t\t\tThe correct answer was 105");
       System.out.println("\nSolution --->>  7+8=15 ---> 15 (the sum result) * 7 (the First number) = 105");                   
       System.exit(0);
      }
  } //if closed
 } // while closed
 while ( triedTimes<3 && userAnswer!=105 );
  triedTimes++;
  
      if (userAnswer==105)
    {
      System.out.println("\n^^^^^^^^^^^^^ CONGRATULATIONS!!!!! YOU ARE A GENIUS!! ^^^^^^^^^^^^^^^^^");
      System.out.printf("\n   :)) :)) :))   You found the answer at %d Shot  ((: ((: ((: \n", triedTimes);
    }

 }
}