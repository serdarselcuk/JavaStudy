package Assignment3;


import java.util.Scanner;// imported the scanner class


public class task_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//declaring the Scanner
		
		System.out.println("Enter Unit Price : ");// to take input for price
		int unitprice = input.nextInt();
		
		System.out.println("Enter Unit Price : ");// to take the quantity
		int quantity = input.nextInt();
		
		double GrandTot = unitprice * quantity;
		double discount = quantity >= 120 ? 15 : quantity >= 100 ? 10 : 0;
		double discountapp = discount * GrandTot / 100;
		double tot = GrandTot - discountapp;
		
		System.out.println("Grand Total: $ "+GrandTot+"\nDiscount: "
		+discount+"%\nDiscount applied: $ "+discountapp+"\nTotal: $ "+tot);
		
		
		
	}
	/*Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
	User should be able to enter unit price and quantity.
	Then the program will perform calculations and display amounts.
	The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased 
	greater than 120 units.
	If the quantity purchased is less than 100 units, the discount rate is 0%.
	See the example output as shown below:
	Input:
	Enter unit price: 25
	Enter quantity: 110
	Output:
	Grand Total: $ 2750.0
	Discount: 10%
	Discount applied: $ 275.0
	Total: $ 2475.0
*/
	
	
}
