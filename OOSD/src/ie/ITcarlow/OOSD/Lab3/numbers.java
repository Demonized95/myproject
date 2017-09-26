package ie.ITcarlow.OOSD.Lab3;

import java.util.Scanner;

//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				21/09/2017
//Purpose : 			Print out the contents of the variables on the screen. It should then 
//						add each of the variables to each other and print the results. 

public class numbers 
{
	public static void main(String args[])
	{
		
//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				21/09/2017
//Purpose : 			Print out the contents of the variables on the screen. It should then 
//						add each of the variables to each other and print the results. 

		
		Scanner console = new Scanner (System.in);
		 
		int myInt ;
		float myFloat;
		long myLong;
		double myDouble;
		String myString;
		int result1;
		int result2;
		int result3;
		String result4;
		float result5;
		double result6;
		String result7;
		double result8;
		String result9;
		String result10;
		

		System.out.println("Enter any Integer : ");
		myInt  =  console.nextInt();    //integers
		System.out.println("Enter any Float : ");
		myFloat  =  console.nextFloat();    //float
		System.out.println("Enter any Long : ");
		myLong  =  console.nextLong();    //long
		System.out.println("Enter any Double : ");
		myDouble = console.nextDouble();   //doubles
		System.out.println("Enter any String : ");
		myString = console.next();    //strings
		

		System.out.println("Integer : " + myInt);
		System.out.println("Float : " + myFloat);
		System.out.println("Long : " + myLong);
		System.out.println("Double : " + myDouble);
		System.out.println("String : " + myString);
		
		result1 = (int) ((int) myInt + myFloat);
		System.out.println("Integer + Float : " + result1 );
		
		result2 = (int) ((int) myInt + myLong);
		System.out.println("Integer + Long : " + result2 );
		
		result3 = (int) ((int) myInt + myDouble);
		System.out.println("Integer + Double : " + result3 );
		
		result4 = myInt + myString;
		System.out.println("Integer + String : " + result4 );
		
		result5 = myFloat + myLong;
		System.out.println("Float + Long : " + result5 );
		
		result6 = myFloat + myDouble;
		System.out.println("Float + Double : " + result6);
		
		result7 = myFloat + myString;
		System.out.println("Float + String : " + result7 );
		
		result8 = myLong + myDouble;
		System.out.println("Long + Double : " + result8 );
		
		result9 = myLong + myString;
		System.out.println("Long + String : " + result9 );
		
		result10 = myDouble + myString;
		System.out.println("Double + String : " + result10 );
		
		console.close();

	 }//main
	}//class

