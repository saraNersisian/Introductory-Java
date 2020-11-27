import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab6
{
 public static void main (String [] args)
 {
 String inputStr;
 int classNum;
 int classUnits=0;
 int sumOfUnits=0;
 double eachUnitsScore=0;
 double finalScore=0;
 double value=0;
 double GPA;
 char grade;
 
 	DecimalFormat formatter = new DecimalFormat("#0.00");
   inputStr = JOptionPane.showInputDialog("How many classes did you have last semester?"+
                                           "\nPlease DO NOT include any Pass/No pass OR dropped courses" );
   classNum = Integer.parseInt(inputStr);

 for (int i=1; i<=classNum; i++)
   {
  inputStr = JOptionPane.showInputDialog("How many units does your class #" + i + " have?");
  classUnits = Integer.parseInt(inputStr); 
  sumOfUnits+=classUnits;
   inputStr= JOptionPane.showInputDialog("What grade did you get in class #" + i + " ?");
  grade=inputStr.charAt(0);
  
  if(grade=='A' || grade=='a')
  value=4.0;
  
  else if (grade=='B' || grade=='b')
  value=3.0;
  
  else if (grade=='C' || grade=='c')
  value=2.0;
  
  else if (grade=='D' || grade=='d')
  value=1.0;
  
  else if (grade=='F' || grade=='f')
  value=0.0;
  
  
  eachUnitsScore=value*classUnits;
  finalScore+=eachUnitsScore;
   }//for closed
   
   GPA=finalScore/sumOfUnits;
   JOptionPane.showMessageDialog(null,"Your GPA for last semester was: "+  formatter.format(GPA) 
                                   
                                   +" \npress Enter to continue");
   if (GPA>=4.0)
   JOptionPane.showMessageDialog(null,"Way to go!!! Excellent!");
   else if (GPA>=3.0 && GPA< 4.0)
   JOptionPane.showMessageDialog(null,"You are a GOOD student!");
   else if (GPA >=2.0 && GPA< 3.0)
   JOptionPane.showMessageDialog(null,"Try harder and study more!");
   else if ( GPA <= 2.0 )
   JOptionPane.showMessageDialog(null,"Be carefull you are going to placed on academic probation!"); 
  

     } // main method closed
} // class closed