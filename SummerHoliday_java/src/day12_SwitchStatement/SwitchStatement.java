package day12_SwitchStatement;

public class SwitchStatement {

	/* It's same as the else if statement (multi-branch if statement)
	 * 
	 * 		switch (Expression){
	 * 			case CaseVale :
	 *				statement1:
	 *					break;
	 *				statement2:
	 *					break; 
	 * 		default:
	 * 			break;
	 * 
	 * break means exiting from the switch statement.
	 * if don't use break it continues to executing to the end of switch statement
	 */
	
	public static void main(String[] args) {
		
		int score = 2;
		
		if (score ==1 ) { // must give boolean expression
			System.out.println("1");
		}
		else {
			System.out.println("invalid");
		
		}
		else if
		System.out.println("\n\n");	
		
		
		switch(score) {//must give an expression : data
			case 1 :// it must the same type with "score"
				System.out.println("1");
				break;						// once switch turns on it starts executing... so we must use break
			case 2 :
				System.out.println("2");
				break;
				
		default:
			System.out.println("invalid");
			break;
				
		}
	}
	
}	
