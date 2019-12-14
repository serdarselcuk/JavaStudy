package day29_ReturnMethods;

public class returnMethods {

	public static void main(String[] args) {
		/*
		 	public			static	 		int		 			name()
		 access-modifier	specifier	return-type
		 
		 without void return-type methods it MUST return a value in any data type
		 
		you can use any value type as return type
		- String
		-int
		-boolean
		-double
		-short
		-byte
		-long
		
		in the return-methods we must use return statement to exiting the method
		 
		 1. Does not have void as return type
		 2. method body must return a value
		 3. must use return comment with a value that is match with the return-type of the method
		 4.Once return statement executed it exits immediately
		 */
		System.out.println(string());
		System.out.println(booleanmethod());
		System.out.println(integerMethod());
		System.out.println(doubleMethod());
		
	}
	public static String string() {
		
		return "serdar is the best";
	}
	public static boolean booleanmethod() {
		
		return 7>1;
	}
	public static int integerMethod() {
		
		return 3;
	}
	public static double doubleMethod() {
		
		return 3.2;
	}
}
