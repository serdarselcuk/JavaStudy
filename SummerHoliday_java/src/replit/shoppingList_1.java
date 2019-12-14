package replit;

import java.util.Scanner;

public class shoppingList_1 {

		public static void main (String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Item1 and its price:");
			
			String item1 = input.nextLine();
			double price1 = input.nextDouble();
			input.nextLine();
			
			System.out.println("Enter Item2 and its price:");
			
			String item2 = input.nextLine();
			double price2 = input.nextDouble();
			input.nextLine();
			
			System.out.println("Enter Item3 and its price:");
			
			String item3 = input.nextLine();
			double price3 = input.nextDouble();
			input.close();
			
			double total = price1 + price2  + price3 ;
			System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3
					+"\nTotal price: "+total);
				
		}
		
}