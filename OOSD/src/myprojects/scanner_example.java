package myprojects;

//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				21/09/2017
//Purpose : 			Scanner example 

import java.util.Scanner; // we need this to access scanner class             

public class scanner_example
{

	public static void main( String args[] )
		{

			Scanner input = new Scanner( System.in );            

			int number1; 
			int number2;
			int sum; 
			String name; 
			char initial;

			System.out.print( "Enter first number: " ); 
			number1 = input.nextInt(); 
			System.out.print( "Enter second number: " ); 
			number2 = input.nextInt(); 
			sum = number1 + number2; 
			System.out.println( "Sum is " + sum ); 
			
			System.out.print( "Enter a name :  " );
			name = input.nextLine();
			initial = input.next().charAt(0);
			System.out.println ("the name is " + name );
			System.out.println ("the initial  is " + initial);   
			
			input.close();

		} 

}
