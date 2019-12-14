package replit;
import java.util.Scanner;

public class HappyValleySchoolSystem {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age = input.nextInt();
		
		String classify = age > 18 ? "ineligible":age >= 17?"sholar"
				:age >= 14 ? "high school"
						:age >= 13? "imposible"
							:age >= 11?"middle"
									:age >= 8 ?"elementary"
											:age >= 6?"young reader"
													:age >= 3 ?"early  childhood"
															:age >= 2? "toddler"
																	:"inelgible";
		System.out.println(classify);
/*
less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
*/
}
}