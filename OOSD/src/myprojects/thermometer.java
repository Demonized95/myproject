package myprojects;

/*
 *	Name 	:	Diarmuid Mc Evoy
 *	Date	:	23/10/2017
 *	Program	:	Implement a thermometer class
 *				store current temp in celsius 
 */

public class thermometer
{ //begin thermometer
		
		private double celsius;	//celsius is accessible to all methods in this class
		
		public thermometer() //constructor method
		{
			setCelsius(0);
		}
		
		public void setCelsius(double cel)	//method to set temp
		{
			celsius = cel;
		}
		
		public double getCelsius()	//getter method
		{
			return celsius;
		}

}//end class thermometer
