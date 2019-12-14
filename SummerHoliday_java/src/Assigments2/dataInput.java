package Assigments2;

import com.sun.java_cup.internal.runtime.Scanner;

public class dataInput {
	public static void main(String[] args) {
		import java.util.Scanner;

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		
		reader.close();
	}
	

}
