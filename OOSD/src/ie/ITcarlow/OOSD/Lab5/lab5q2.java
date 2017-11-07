package ie.ITcarlow.OOSD.Lab5;

/** Description: Program to compute the powers of 2 from 1 to 10
** Demonstrates the use of the while control structure
**
** Pseudocode:
**
** Initialise the current power of 2 to 1
** While the current power of 2 is <= 10
**    Calculate the current power of 2
**    Print the current power of 2
**    Add 1 to the current power of 2
** End while
**
*/

public class lab5q2 
{
	public static void main(String args[])
	   {
	      int power = 10, result;		//loop runs once (2 to the power of ten = 1024)
	      final int MAX = 10;

	      while ( power <= MAX )
	      {
	         result = (int) Math.pow(2,power);
	         System.out.println( "2 to the power of " + power + "= " + result);
	         power++;
	      }
	   }

}
