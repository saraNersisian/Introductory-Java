import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch7Ex2_Payroll
{
 public static void main (String [] args)
 {
 
 int [] employeeId={10,20,30};
 int emID;
 int [] hours=new int [employeeId.length];
 double [] payRate=new double [employeeId.length];
 double grossPay;
 boolean valid;
 
 Scanner keyboard=new Scanner( System.in);
 
 for(int i=0; i<employeeId.length; i++)
 {
    System.out.println("Enter the hours worked for employee #"+(i+1));
    hours[i]=keyboard.nextInt();
    System.out.println("Enter the hourly pay rate for employee #"+(i+1));
    payRate[i]=keyboard.nextDouble();
 }

 System.out.println("Please enter your employee ID to see the gross pay");
 
 do{
   emID=keyboard.nextInt();
   valid= checkValidID(emID,employeeId);
    if(valid==true)
     {
       getGrossPay(employeeId,emID,payRate,hours);
       System.exit(0);
     }

   System.out.println("Invalid employee ID!!!");
   System.out.println("Please enter a valid employee ID");
   }while (valid!=true);
   
  getGrossPay(employeeId,emID,payRate,hours);
 }
 
////////////////////////////////////////////////////////////////////////// 
  
  public static void getGrossPay(int [] employeeId_M,int emId_M,double [] payRate_M,int [] hours_M)
  {
   double grossPay=0;
   DecimalFormat decFor = new DecimalFormat("0.00");
       
   for (int i=0; i <employeeId_M.length; i++)
    {
       if(emId_M==employeeId_M[i])
        {
          grossPay=payRate_M[i]*hours_M[i];
          System.out.println("gross pay for employeeID #"+emId_M+" is: $"+decFor.format(grossPay));
        }
     }//for closed
   }
  
  
//////////////////////////////////////////////////////////////////////////   

  public static boolean checkValidID(int emID, int [] employeeId_M)
  {
  boolean valid=false;
  int i=0;
  int element=-1;
  
  while(!valid && i <employeeId_M.length) // while(it is not true and i<length)...
  {
    if(employeeId_M[i]==emID)
     {
        valid=true;
        element=i;
     }
     
   i++;
  }//while closed
  
  return valid;
  }
//////////////////////////////////////////////////////////////////////////  
  
  }