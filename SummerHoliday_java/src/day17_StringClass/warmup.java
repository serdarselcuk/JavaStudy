package day17_StringClass;
import java.util.Scanner;
public class warmup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = scan.nextLine()+ " ";
		
		
		System.out.println("Enter Last name");
		String lastName = scan.nextLine();
		
		//String fullName = name +" "+ lastName;
		String fullName = name.concat(lastName);//in concat() method you can only give string variables
		int l_fullName = fullName.length();
		System.out.println(fullName +" "+ l_fullName);
	}
}
