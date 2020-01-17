package day55_Exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		/*finally block : can use finally block along with try&catch blocks.codes in 
		 * finally ALWAYS gets executed regardless of exception. but it is only executed if exception has handled
		 */
		
//		try {
//			int a = 9/0;			
//			System.out.println("try block");
//		}
//		catch(NullPointerException e) {
//			System.out.println("catch block");
//		}
//		finally {
//			System.out.println("finally block");
//		}
//		
		
		try {
			Thread.sleep(5000);
			System.out.println("try block");
		}
		catch(Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
		
		
		
		
		/*Exception in thread "main" finally block
finally block
java.lang.ArithmeticException: / by zero
	at day55Exeptions.FinallyBlock.main(FinallyBlock.java:22)
	*/
		
		
	}
}
