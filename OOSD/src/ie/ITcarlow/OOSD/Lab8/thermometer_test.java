package ie.ITcarlow.OOSD.Lab8;

import myprojects.thermometer;

/*
 *	Name 	:	Diarmuid Mc Evoy
 *	Date	:	07/11/2017
 *	Program	:	my first class implementation (thermometer)
 */

public class thermometer_test 
{//begin class thermomter_class
	
	public static void main(String []args)
	{//begin main method
		
		thermometer thermA = new thermometer();	//create an instance of our thermometer class
		thermometer thermB = new thermometer(); //create a second instance of our class
				
		System.out.println("Temp of thermometer A is :	" + thermA.getCelsius() );	
		thermA.setCelsius(20.0);
		System.out.println("Temp of thermometer A is :	" + thermA.getCelsius() );	
		thermB.setCelsius(10.0);
		System.out.println("Temp of thermometer B is :	" + thermB.getCelsius() );
	}//end main

}// end class