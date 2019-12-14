package day18_stringMethods;
import java.util.Scanner;
public class warmup {
	
	public static void main(String[] args) {
	// # substring(0,1)
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first and the last Name");
		String name = scan.nextLine();
		String lastName = scan.nextLine();
		String initials = name.substring(0,1)+"."+lastName.substring(0, 1);
		System.out.println(initials);
	//charAt()
		String initi = name.charAt(0)+"."+lastName.charAt(0);
		System.out.println(initi);
	}
	
}
