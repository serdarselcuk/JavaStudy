package day21_whileLoop;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean cont = true;
		int i = 0 ;
		do {i++;
		System.out.println("enter "+i+". number");
		int a = scan.nextInt();
		System.out.println("do you wanna continue(true/false)");
		cont = scan.nextBoolean();
		}while(cont);
	}
}
