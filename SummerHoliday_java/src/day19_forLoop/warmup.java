package day19_forLoop;
	

import java.util.Scanner;

public class warmup {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your user name");
		String user = input.nextLine().toLowerCase();
		System.out.println("Enter your password");
		String password = input.nextLine();			// taking the credentials to login
		
		String user_c = "serdar";
		String password_c = "6358";					// the correct credentials that we compare
		
		if (user.endsWith(".com")) {			// checks if it's in true format
			
			if (!user_c.equals(user.substring(0, user.indexOf('@'))))
				System.out.println("wrong username");//if the user name part is not correct
			else if (!password.equals(password_c))
				System.out.println("wrong password");//if the password is wrong
			else
				System.out.println("correct");		// if everything is in the way
				
		}else
			System.out.println("the mail format is not correct  ");// if it is nor in true gmail format
	}


}














