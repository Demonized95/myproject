package myprojects;

/*
 *	Name 	:	Diarmuid Mc Evoy
 *	Date	:	23/10/2017
 *	Program	:	my first class implementation (thermometer)
 */

public class thermometer_test 
{//begin class thermomter_class
	
	public static void main(String []args)
	{//begin main method
		
		thermometer thermA = new thermometer();	//create an instance of our thermometer class
				
		System.out.println("Temp of thermometer A is :	" + thermA.getCelsius() );	
		thermA.setCelsius(20.0);
		System.out.println("Temp of thermometer A is :	" + thermA.getCelsius() );	
	}//end main

}// end class
