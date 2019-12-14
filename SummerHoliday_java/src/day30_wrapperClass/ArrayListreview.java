package day30_wrapperClass;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListreview {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			ArrayList<String>studendNames = new ArrayList<String>();
			boolean Continue = true;
			do {
				System.out.println("enter a name to add the list:");
				String name = scan.nextLine();
				studendNames.add(name);
				String answer = answer();
				while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {
					System.out.println("invalid input try again!");
					answer =answer();
				}if (answer.equalsIgnoreCase("yes")) {
					Continue = true;
				}else {
					Continue = false;					
					}

			}while( Continue );
			System.out.println(studendNames);
			
		}public static String answer() {
			Scanner scan = new Scanner(System.in);
			System.out.println("do you want to add another :");
			String answer = scan.nextLine();
			return answer;
		}
}
