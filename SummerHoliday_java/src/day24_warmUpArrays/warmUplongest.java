package day24_warmUpArrays;

import java.util.Scanner;

public class warmUplongest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = new String[5];
		String word = "";
		
		for ( int namenum = 0 ; namenum < 5 ; namenum++) {
			System.out.println("enter 5 name please");
			str[namenum] = scan.nextLine();
		}
		for (int i = 0 ; i < str.length ; i++) {
			if (str[i].length() > word.length()) {
				word = str[i];
			}
		}System.out.println(word);
	}
}
