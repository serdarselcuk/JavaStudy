package Assignment3;

import java.util.Scanner;

public class task_4 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Price in Cents : ");
			int price = input.nextInt();
			
			int quarter = 0 ;
			int dime = 0 ;
			int nickel = 0 ;
			int change = 100 - price; 
			
			if (change >= 25) {
				
				quarter = change /25;
				change %= 25;
				System.out.println(change+" "+ (change %= 25));
			}
			if ( change >= 10) {
				
				dime = change /10;
				change %= 10 ;
				System.out.println(change);
			}
			if ( change >= 5) {
				
				nickel = change /5;
				change %= 5 ;
				System.out.println(change);
			}
			
			System.out.println("Your change is "+ quarter +" quarters, "+ dime +" dimes, and "+ nickel +" nickels.");
		}
	/*Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.
Input: 
Enter price in cents: 95↵
Output:
Your change is 0 quarters, 0 dimes, and 1 nickels.
Remember:
1 quarter = 25 cents.
1 dimes = 10 cents.
1 nickels  = 5 cents.
you will need to use assignment and shor hand operators for this task. Good luck (edited) 
	
	*/
}
