import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class lab8
{
 public static void main (String [] args)
  {
  double discriminant;
  double A;
  double B;
  double C;
  
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Give me a"+ " \"Quadratic Equation\""+" in the form of Ax^2+Bx+C=0"
                                        + "\nI will find the roots");
  System.out.println("\n-------> What is A?");
  A=keyboard.nextDouble();
  System.out.println("-------> What is B?");
  B=keyboard.nextDouble();
  System.out.println("-------> What is C?");
  C=keyboard.nextDouble();
  
  discriminant=Math.pow(B,2)-4*A*C;
 
  if(discriminant>0)
  twoRealSol(discriminant,A,B);
  else if(discriminant==0)
  oneRealSol(discriminant,A,B);
  else 
  noRealSol();
 
  }//main closed
 
  
  public static void twoRealSol(double D, double  A, double B)
   {
   double x1,x2;
 
   DecimalFormat formatter = new DecimalFormat("#0.00");
  
   System.out.println("The equation has TWO REAL ROOTS");
  
   x1= -B+(Math.sqrt(D));
   x1=x1/(2*A);
  
   x2= -B-(Math.sqrt(D));
   x2=x2/(2*A); 
   
   System.out.println("The roots are "+  formatter.format(x1)+" AND "+ formatter.format(x2));

   }//twoRealSol closed
   
   public static void oneRealSol(double D, double  A, double B)
    {
    double x;
    DecimalFormat formatter = new DecimalFormat("#0.00");
  
    System.out.println("The equation has ONE REAL ROOT");
   
    x=-B/2*A;
    System.out.println("The root is "+ formatter.format(x));
    
    }//oneRealSol closed
  
   public static void noRealSol()
    {
    System.out.println("The equation has NO REAL ROOT");
    }//noRealSol closed

   
}//class closed
