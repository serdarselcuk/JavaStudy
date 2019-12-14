package Assigments2;

/**
 * @author serdar
 *
 */
public class timeOfDay {
  /*In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

 

1. Declare variables: hour, minute, second that can hold int values.

2.  Declare amOrPm variable that can hold a String ("AM" or "PM")

3. Using the variables and concatenation, print values in the format mentioned above.

 

*/
	public static void main(String[] args) {
		int hour = 11,	minute = 23 ,second = 12;
		String amOrPm ;
		if (hour >= 12 ) {
			amOrPm = "PM";
			System.out.println(hour +":"+minute+":"+second+" "+amOrPm);
		}
		if (hour < 12 ) {
			amOrPm = "AM";
			System.out.println(hour +":"+minute+":"+second+" "+amOrPm);
		}
		
		}
}
