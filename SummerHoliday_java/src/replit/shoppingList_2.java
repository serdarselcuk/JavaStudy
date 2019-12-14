package replit;
import java.util.Scanner;

public class shoppingList_2 {

	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Item1, count and its price:");
	
	String item1 = input.nextLine();
	int count1 = input.nextInt();
	double price1 = input.nextDouble();
	input.nextLine();
	
	System.out.println("Enter Item2, count and its price:");
	
	String item2 = input.nextLine();
	int count2 = input.nextInt();
	double price2 = input.nextDouble();
	input.nextLine();
	
	System.out.println("Enter Item3, count and its price:");
	
	String item3 = input.nextLine();
	int count3 = input.nextInt();
	double price3 = input.nextDouble();
	input.close();
	price1 *= count1;
	price2 *= count2;
	price3 *= count3;
	
	
	String item11 = price1 == 0 ? "":price2 == 0 && price3 == 0 ? "Item1: "+item1+" Price: "+price1 : "Item1: "+item1+" Price: "+price1+", ";
	String item22 = price2 == 0 ? "":price3 == 0 ? "Item2: "+item2+" Price: "+price2 :"Item2: "+item2+" Price: "+price2+", ";
	String item33 = price3 == 0 ? "":"Item3: "+item3+" Price: "+price3;
	
	double totalprice = price1 + price2  + price3 ;
	

			
	System.out.println(item11+item22+item33+"\nTotal price: "+totalprice);
	

	}
}
