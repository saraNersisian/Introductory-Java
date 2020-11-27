import java.util.Scanner; 

public class shirtPrice
{
   public static void main (String [] args)
   { Scanner keyboard = new Scanner (System.in);
     
     String size;
     char shirtSize;
     double shirtPrice;
     
     System.out.println ("What size t-shirt would you like?");
     System.out.println ("Press 'S' for small, 'M' for medium, and 'L' for large.");
     size = keyboard.nextLine ();
     shirtSize = size.charAt (0);
     
     shirtPrice = getShirtPrice (shirtSize);
     System.out.println (shirtPrice);
     
   }
   
   public static double getShirtPrice ( char size )
   { 
     if (size == 'S' )
     { return 10.99;
     }
     
     else if ( size == 'M')
     { return 12.99;
     }
     
     else if ( size == 'L')
     { return 14.99;
     }
     
   }
}
