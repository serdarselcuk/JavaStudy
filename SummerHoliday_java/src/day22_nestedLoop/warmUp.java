package day22_nestedLoop;
import java.util.Scanner;
public class warmUp {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter any string");;
			String str = scan.nextLine();
			String str_rev = "";
			int i = str.length()-1;
			while ( i >= 0 ) {
				str_rev += str.charAt(i);
				i--;
			}boolean result = str.equalsIgnoreCase(str_rev);
			System.out.println(result);
			
	}

}
