import java.text.DecimalFormat;
import java.util.Scanner;

public class Pennies
{
 public static void main (String [] args)
 {
 Scanner keyboard=new Scanner(System.in);
 DecimalFormat formatter = new DecimalFormat("$##0.00");
 
 int daysWorked;
 int total=0;
 double pay=1.00;
 

 System.out.println("Please enter the number of days you worked: ");
 daysWorked=keyboard.nextInt();
 
 while(daysWorked<1)
 {System.out.println("You have entered an invalid number of days. ");
 System.out.println("Please enter the number of days you worked: ");
 daysWorked=keyboard.nextInt();}
 
 for(int i=1;i<=daysWorked;i++)
 {
  total+=pay;
 System.out.println("Pay for day #"+i+": "+formatter.format(pay));
 pay=pay*2;

 }

 System.out.println("TOTAL PAY FOR "+daysWorked+" : "+formatter.format(total)); 
 
 }
}