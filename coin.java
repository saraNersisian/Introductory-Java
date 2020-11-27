

import java.util.Random;

public class coin
{
 public static void main (String [] args)
 {
 
 Random rand = new Random();
 
 for(int flip=1; flip<=10;flip++)
 {
 int value = rand.nextInt(2);
 
 if(value==0)
 System.out.println("You landed on heads "+value);
 
 else
  System.out.println("You landed on tails " +value);

}
 }
}