package day11_If_Else_review;

public class ifElse_statement {

	public static void main(String[] args) {
		
		boolean condition1 = false;
		boolean condition2 = false;
		boolean condition3 = true;
		
		if (condition1) {
			System.out.println("A");
		}
		else if (condition2){			//	if condition1 is false and condition2 is true will be executed
			System.out.println("B");
		}
		else if(condition3) {//if condition1 and condition2 is false and condition3 is true will be executed
			System.out.println("C");
		}
		else { //if all of the other are false
			System.out.println("D");
		}
		
	}
}
