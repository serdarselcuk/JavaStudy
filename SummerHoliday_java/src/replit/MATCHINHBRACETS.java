package replit;

import java.util.Scanner;

public class MATCHINHBRACETS {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 0;							// it will count the brackets to follow if they are matching
		String str = scan.nextLine();			// this for inputing the string that we will check
		for (int i = 0;i < str.length(); i++) { // for loop will goes one by one on the string
			if (str.charAt(i)=='{') {			//count will increase or decrease according to brackets type 
				count++;
			}else if (str.charAt(i)=='}') {
				count--;
			}if (count<0) {						// if brackets doesn't matches each other count must go under zero
				break;
			}
		}if (count == 0)						// after for loop if all char matched count must be equals the zero
			System.out.println("valid");
		else
			System.out.println("invalid");		
				
		}
	
	}

