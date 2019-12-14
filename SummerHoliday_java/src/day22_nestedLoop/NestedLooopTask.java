package day22_nestedLoop;

import java.util.Scanner;

public class NestedLooopTask {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean answer = true;
		
		int a = 0;
		int b = 0;
		while(answer) {
			System.out.println("Enter two numbers than operation sign :");
			
			a = scan.nextInt();	
			b = scan.nextInt();
			String opr =scan.next();
			int result = 0;
			if (opr=="+")
				result = a+b;
			else if (opr=="+")
				result = a*b;
			else if (opr=="-")
				result = a*b;
			else if (opr=="*")
				result = a*b;
			else if (opr=="/")
				result = a*b;
			else if (opr=="%")
				result = a*b;
			else
				System.out.println("invalid");
			System.out.println(result);
		
			System.out.println("do you want to continue");
			String question = scan.next();
			answer = question.equalsIgnoreCase("yes");
				
				}
		}
	}

