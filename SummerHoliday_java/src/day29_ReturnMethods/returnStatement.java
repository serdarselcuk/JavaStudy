package day29_ReturnMethods;

public class returnStatement {
	public static void main(String[] args) {
		/* you  can't give any statement after return statement;
		 * 
		 */
		System.out.println("serdar");
		//return;
		// System.out.println("selcuk"); this line is giving compile error
		if (true) {
	//		return ;
		}
		System.out.println("serdar");// also return statement would be in the if statement it exits from the method
		
	}
}
