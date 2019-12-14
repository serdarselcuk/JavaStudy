package day11_If_Else_review;

public class Nested_if {

		/*in nested if ;
		 *  if (condition1)
		 *  	if (condition2).. if these 2 if statement are both true than it will be executed
		 */
	public static void main(String[] args) {
		
		int grade = 60 ;
		
		boolean A = grade >= 90 ;
		boolean B = grade >= 80 ;
		boolean C = grade >= 70 ;
		boolean D = grade >= 60 ;
		boolean F = grade <= 59 ;
		boolean validation = grade <=100 && grade >=0 ;
		
		if (validation) { // if the grade is between 100 - 0 mean valid grade
			if (A) {
				System.out.println("A"); //// if the grade is 90-100
			}else if (B) {
				System.out.println("B"); // if the grade is 80/90
			}else if (C) {
				System.out.println("C");// if the grade is 70-80
			}else if (D) {
				System.out.println("D");// if the grade is 60-80
			}else {
				System.out.println("E");// if the grade is under the 60 to 0 
			}
		}else { // if the grade is not valid print it
			System.out.println("invalid");
		}
	}
	
}
