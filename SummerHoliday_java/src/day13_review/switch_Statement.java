package day13_review;

public class switch_Statement {

	/* switch(Expression){
	 * 		case value:
	 * 			statement;
	 * 			break;
	 * 		default:
	 * 			statement;
	 * 			break;
	 */
	
	public static void main(String[] args) {
		short z = 10;
		switch (z) {							//  Only convertible int values, strings or enum variables are permitted
		// and also byte and short can be assignes to int.
		default:								// this line's place is not makes difference.
			System.out.println("default line");//		it will be executed if the others not executed
			break;
		//case 3: 
			//System.out.println("multiple entrance"); doesn't allowed to second time entrance of the true key
		case 2+2:
			System.out.println("false line");
			break;
			
		case 3:
			System.out.println("true line");
			System.out.println("true line");	// can accepts multiple lines
			System.out.println("true line");
			System.out.println("true line");
			break;
		
		}
		}
	}

