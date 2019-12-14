package day20;

import java.util.Scanner;

public class replaceLast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence that you want to make some replacement");
		String str = scan.nextLine();
		System.out.println("Enter the word that you want to change");
		String find = scan.nextLine();
		System.out.println("Enter the word that you want to replace");
		String replace = scan.nextLine();
		
		String reverse = "";
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			reverse += str.charAt(i);
		}	str = reverse;
			reverse = "";
		for (int i = find.length()-1; i >= 0 ; i--) {
			reverse += find.charAt(i);
		}	find = reverse;
			reverse ="";
		for (int i = replace.length()-1; i >= 0 ; i--) {
			reverse += replace.charAt(i);
		}	replace = reverse;
			reverse = "";
		str = str.replaceFirst(find,replace);
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			reverse += str.charAt(i);
		} str = reverse;
		
		System.out.println(str);
		}
}



