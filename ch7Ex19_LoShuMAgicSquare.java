import java.util.Scanner;

public class ch7Ex19_LoShuMAgicSquare
{
 public static void main (String [] args)
 {
 int [][] array= new int [3][3];
 
 Scanner keyboard=new Scanner (System.in);
 
 System.out.print("\n******************************************************************************** ");
 System.out.print("\n                               LO SHU MAGIC SQUARE                               ");
 System.out.print("\n******************************************************************************** ");

 System.out.println("\n");
 System.out.println("Enter a 3*3 matrix with following conditions: ");
 System.out.println("\n1)Numbers should be integers between 1 and 9");
 System.out.println("2)NO duplicates");
 System.out.println("3)The sum of each row, each column, and each diagonal should all add up to the same number (15)");
 System.out.println();
 System.out.println("FYI: \n\tFirst 3 numbers go -----> |X X X|"
                     +"   \n\tSecond 3 numbers go ----> |X X X|"
                     +"   \n\tThird 3 numbers go -----> |X X X|");
                     
 System.out.println("\nWaiting for your input...");

 for(int i=0; i<array.length; i++)   
  for(int j=0; j<array[i].length; j++)
     {
        array[i][j]=keyboard.nextInt();
            while ( array[i][j] < 1 || array[i][j] > 9 || !checkGridDuplication(i, j, array))
            {
               System.out.println(" Please enter a valid number!!");
               System.out.println("(Either the number was not in range OR was a duplicate");
               array[i][j]=keyboard.nextInt();
            }// while closed
     }// second for

 System.out.print("You have entered : ");
 for( int i=0; i<3; i++)
 {
   System.out.println();
    for( int j=0; j<3; j++)
     System.out.print(array[i][j]+" ");
  }
  
 System.out.println("\nReady to check your work? Press Y/y");
 char yes=keyboard.next(".").charAt(0);
 
 checkRow(array);
 checkColumn(array);
 checkFirstDiagonal(array);
 checkSecondDiagonal(array);

 }//main closed
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public static boolean checkGridDuplication(int i, int j, int [][] grid)
{

 // cheking the duplication in each row
 for (int col=0; col<grid[i].length; col++)
  {
    if( col!=j && grid[i][col]== grid[i][j])
     {
      System.out.println("Duplicate found in row #"+col);
      return false;
     }
  }
  
  // checking duplication in each column
  for (int row=0; row<grid.length; row++)
   {
    if( row!=i && grid[row][j]== grid[i][j])
       {
        System.out.println("Duplicate found in column #"+row);
        return false;
       }
   }
   
 // checking duplication in the whole grid
 for (int row=0; row<grid.length; row++)
  for (int col=0; col<grid[i].length; col++)
    if(row!=i && col!=j && grid[row][col]==grid[i][j])
      {
        System.out.println("Duplicate found in row #"+row+ " col #"+col);
          return false;
      }

   return true;
 }
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void checkRow( int [][] arrayRow)
{
 System.out.println("\n--------------------------- Checking Rows -------------------------------\n");

 for(int row=0; row<arrayRow.length; row++)
 {
  int totalRow=0;
   for( int col=0; col<arrayRow[row].length; col++)
    totalRow+=arrayRow[row][col];
  
   System.out.println("Sum of row #"+row+" is: "+totalRow);
   
  if (totalRow!=15)
    goodBye();
   
   else 
   System.out.println("Valid!! :) :) :) :) :) :) :) :) :) :) :) :)");
   System.out.println();

 }//for cloased
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void checkColumn( int [][] arrayCol)
{
 System.out.println("--------------------------- Checking Columns ----------------------------\n");

 for(int col=0; col<arrayCol.length; col++)
 {
  int totalCol=0;
   for( int row=0; row<arrayCol[col].length; row++)
    totalCol+=arrayCol[row][col];

   System.out.println("Sum of Col #"+col+" is: "+totalCol);

  if (totalCol!=15)
   goodBye();
   
   else 
   System.out.println("Valid!! :) :) :) :) :) :) :) :) :) :) :) :)");
    System.out.println();
 }//for closed
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void checkFirstDiagonal( int [][] arrayDiagonal)
{
 System.out.println("------------------------ Checking First Diagonal ------------------------\n");

  int totalDiagonal1=0;
  for(int row=0; row<arrayDiagonal.length; row++)
   {
    totalDiagonal1+=arrayDiagonal[row][row];
   }         
  
   System.out.println("Sum of first diagonal is: "+totalDiagonal1);
   
  if (totalDiagonal1!=15)
     goodBye();
   
   else 
    {
    System.out.println("Valid!! :) :) :) :) :) :) :) :) :) :) :) :)");
    System.out.println();
    } 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void checkSecondDiagonal( int [][] arrayDiagonal)
{
 System.out.println("\n------------------------ Checking Second Diagonal -----------------------\n");

  int totalDiagonal2=0;
 for(int row=0; row<arrayDiagonal.length; row++)
 {
  for (int col=2; col>=0; col--)
   {
     int rowAndCol=row+col;
     if(rowAndCol==2)  // pattern was like [0][2]  [1][1]  [2][0] ,SO they all add up to 2
       totalDiagonal2+=arrayDiagonal[row][col];  
    }           
 }//for main closed  
 
 System.out.println("Sum of second diagonal is: "+totalDiagonal2);

  if (totalDiagonal2!=15)
       goodBye();
     
   else 
    {
    System.out.println("Valid!! :) :) :) :) :) :) :) :) :) :) :) :)");
    System.out.println("\n\n**********************************  D O N E  ********************************** ");
    System.out.println();
    System.out.println("YAY!! You found the ONLY solution\n");

     
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t +\"\"\"\"\"+ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t[| o o |]");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t |  ^  | ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t | '-' | ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t +-----+ "); 
   }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void goodBye ()
{
 System.out.println("\nInvalid!!\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX :( :( :( :(   GOODBYE   ): ): ): ): XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t #\"\"\"\"\"# ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t | o o | ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t |  \\  | ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t | --- | ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t #-----#  "); 
        
        System.out.println("The ONLY answer to this magic square was: ");
        System.out.println("\n 4 9 2"
                          +"\n 3 5 7"
                          +"\n 8 1 6");
  System.exit(0);

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

}//finish