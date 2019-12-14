package day18_stringMethods;

import java.util.Scanner;

public class warmup2 {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("enter your first and the last Name");
			String name = scan.nextLine();
			String lastName = scan.nextLine();
			String corrected = name.toUpperCase().substring(0,1)+name.toLowerCase().substring(1)+" "+lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
			System.out.println(corrected);
			
			String corr_char = name.toUpperCase().charAt(0)+name.substring(1)+" "
			+lastName.toUpperCase().charAt(0)+lastName.substring(1);
			System.out.println(corr_char);
			
	}
}