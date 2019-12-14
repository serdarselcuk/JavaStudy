package day29_ReturnMethods;

public class systemExit {
	public static void main(String[] args) {
		System.out.println(number());
		System.out.println("done");  // the return statement exits the method only which method it is included 
	}public static int number() {
		
		if (true) {
			System.out.println("this is exit");
			System.exit(0);
		}
		
		return 5;
	}
}
