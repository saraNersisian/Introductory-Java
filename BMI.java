// Sara Nersisian
// Lab #1
// 03/13/18

/* PSEUDOCODE: This program calculates the BMI
0)Import  javax.swing.JOptionPane
1)Create variables :,inputStr,height,weight,BMI
2)Show the dialog box to user where it says this is BMI Calculator
3)Ask the user to press enter in order to start the program
4)In dialog box ask :  How much do you weigh (lb)?
5)Wait for the user
6)Save the data in varible named inpurStr
7)Convert the string input of inputStr to double and save the result in variable named weight
8)Then in dialog box ask :  How much is you height(ft in)?
9)Wait for the user
10)Save the data in varible named inpurStr
11)Convert the string input of inputStr to double and save the result in variable named height
12)Retrieve the data in variables weight and height
13)Divide the weight over height raised to the power of 2 and then multiply the result by 4.88
14)Save the result in variable named BMI
15)Show a dialog box saying : your BMI is and then show the BMI amount 
16)Ask the user to press enter to see the BMI ranges
17)Show followings: Underweight: BMI is less than 18.5.
                    Normal weight: BMI is 18.5 to 24.9.
                    Overweight: BMI is 25 to 29.9.
                    Obese: BMI is 30 or more.
18)End the dialog box                    
*/


import javax.swing.JOptionPane;

public class BMI
{
   public static void main (String [] args)
   {
   String inputStr;
   double height;
   double weight;
   double BMI;
   
   JOptionPane.showMessageDialog(null,"      ***  BMI Calculator  *** " +"\n\n ( Press Enter to Continue )"); 
   inputStr = JOptionPane.showInputDialog("How much do you weigh (lb)?");
   weight= Double.parseDouble(inputStr);
   inputStr = JOptionPane.showInputDialog("How much is your height (ft in)?");
   height= Double.parseDouble(inputStr);
   BMI=(weight/Math.pow(height,2))*4.88;
   JOptionPane.showMessageDialog(null, "Your BMI is " + BMI + "."+"\n\n ( Press Enter to see the BMI ranges )");
   JOptionPane.showMessageDialog(null,"\nUnderweight: BMI is less than 18.5."+
   "\nNormal weight: BMI is 18.5 to 24.9."+
   "\nOverweight: BMI is 25 to 29.9."+
   "\nObese: BMI is 30 or more. " );
   
   
 System.exit(0);
   }
}
