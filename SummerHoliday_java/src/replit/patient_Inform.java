package replit;
import java.util.Scanner;
public class patient_Inform {
	public static void main(String[] args) {
		
	
	/*Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
	Declare 2 int variables: age, zipcode
	Declare 2 double variables: height, weight.
	Declare boolean variable: isMarried (for marriage status).
	Declare 2 long variables: workPhoneNumber and personalPhoneNumber.
*/
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to the patient portal!\nPlease enter your personal information");//welcome message
	
	System.out.println("Enter your first name");// first name input
	String name = input.nextLine();
	
	System.out.println("Enter your last name");
	String lastName = input.nextLine();
	System.out.println("Enter your email");
	String email = input.nextLine();	
	System.out.println("Enter your street");
	String street = input.nextLine();
	System.out.println("Enter your city");
	String city = input.nextLine();
	System.out.println("Enter your state");
	String state = input.nextLine();
	System.out.println("Enter your zip code");
	int zipcode = input.nextInt();
	System.out.println("Enter your work phone number");
	long work_phone = input.nextLong();
	System.out.println("Enter your personal phone number");
	long pers_phone = input.nextLong();
	System.out.println("Enter your age");
	int age = input.nextInt();
	System.out.println("Enter your hight");
	double high = input.nextDouble();
	System.out.println("Enter your weight");
	double weight = input.nextDouble();
	System.out.println("Are you married?");
	boolean married = input.nextBoolean();
	
	input.close();
	
	String contacts = "work phone number - "+work_phone +", personal phone number - "+pers_phone +" email: "
			+ email;
	String fullName = "Full name: "+lastName +", "+ name;
	String address = street+", "+city+", "+state+" "+zipcode;
			
	System.out.println("Patient personal information\n"+fullName+"\nAddress: "+address
			+"\nContacts: "+contacts+"\nAge: "+age+"\nHeight: "+high+"\nWeight: "+weight+" pounds\nMarried?: "+married);
			
	
	}
}
