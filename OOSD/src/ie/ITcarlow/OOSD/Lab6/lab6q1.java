package ie.ITcarlow.OOSD.Lab6;

import java.util.Scanner;

public class lab6q1 
{
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args)
    {
    	

    	System.out.print("Enter a number (1-9)");
    	int number = input.nextInt();
    	
    	int i;

    	for(i=0; i < number; i++)
    	{
    		System.out.print("*");
    		
    	}
    	
    }

}
