package ie.ITcarlow.OOSD.Lab4;

import java.util.Scanner;

//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				21/09/2017
//Purpose : 			A. Write a program in Java that reads in the name of a person in two Strings,
//						a first name and a last name

public class A_name {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		String first_name;
		String surname;
		
		
		System.out.print("Enter First name");
		first_name = input.nextLine();
		System.out.print("Enter Surname");
		surname = input.nextLine();
		System.out.print("Name: 	" + first_name + " " + surname);
		
		input.close();
	}

	

	

}
