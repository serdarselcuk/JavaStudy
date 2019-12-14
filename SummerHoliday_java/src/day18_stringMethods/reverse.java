package day18_stringMethods;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string");;
		String str = scan.nextLine();
		for (int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));}
		}
}
