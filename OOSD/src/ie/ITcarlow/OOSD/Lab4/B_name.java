package ie.ITcarlow.OOSD.Lab4;

import java.util.Scanner;

//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				21/09/2017
//Purpose : 			B.	Determine and store the length of each string 


public class B_name {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		String first_name;
		String surname;
		int first_num;
		int sur_num;
		
		
		System.out.print("Enter First name");
		first_name = input.nextLine();
		System.out.print("Enter Surname");
		surname = input.nextLine();
		

		
		first_num = first_name.length();
		sur_num = surname.length();
		System.out.println("First name	" + first_name + " has " + first_num + " characters");
		System.out.println("Surname	" + surname + " has	" + sur_num + " characters");
		
		input.close();
	}

	

	

}