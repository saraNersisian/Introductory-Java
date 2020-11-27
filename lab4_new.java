import java.util.Scanner;

public class lab4_new
{
 public static void main (String [] args)
 {
 int numberOfStars=1;
 int counter=1;
 int row;
 Scanner keyboard=new Scanner (System.in);
 
 System.out.println("Enter a number , i will print a pattern based on that number");
 
row=keyboard.nextInt();
 
 while (counter<=row)
 {
  while (numberOfStars<=counter)
  {
 System.out.print("*");
 numberOfStars++;
  }
  System.out.print("\n");
  counter++;
  numberOfStars=1;
 }
 while (
 }
}