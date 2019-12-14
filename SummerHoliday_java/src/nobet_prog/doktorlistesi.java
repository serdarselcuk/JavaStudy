package nobet_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class doktorlistesi {
	static Scanner scan= new Scanner(System.in);
		
	
	public static void main(String[] args) {
		
		boolean cont = true;
		String answer;
		
		ArrayList<personel>arr = new ArrayList<>();
		do {
			System.out.println("Add theName : ");
			scan.nextLine();
			System.out.println("position : ");
			scan.nextLine();
			System.out.println("ignored days : ");
			scan.nextInt();
			System.out.println(" wants block? (true/false)");
			scan.nextBoolean();
			System.out.println("Can come day by day?(true/false)");
			scan.nextBoolean();
			personel pers ;
			
			scan.nextLine();
			arr.add(pers);
			System.out.println(" Do you want to add another ? ");
			answer = scan.nextLine();
			if(answer.equalsIgnoreCase("no")) {
				cont = false;
			}
		}while(cont);
		System.out.println(arr.get(0));
}
}
