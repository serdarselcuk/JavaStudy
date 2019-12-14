package day16_warmup;
import java.util.Scanner;
public class nexLine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// nextline method accepts the enter from keyboard
		System.out.println("enter a num");
		int num = input.nextInt();
		// 911 ENTER (the keywords that we pushed) and 911 has been assigned to in but the ENTER is already in
		//memory waiting for assigning
		System.out.println("now enter a word for using nextLine()");
		input.nextLine();// so we add an empty assigning line to clean the 'ENTER' pushing.
		String word = input.nextLine(); // or you can use only "input.next();"
		System.out.println(word);
		
		
		System.out.println("enter name");
		String name = input.next();		// if you give here 2 word second one will be taken by the next next() method
		System.out.println("enter lastname");
		String lastname = input.next();
		System.out.println(name + lastname);
		
	}
}
