package day04_Variabes2;

public class PrimitiveDataTypes2 {
	/* 
	 * Primitives: byte, short, int, long, float, double, boolean, char
	 * 
	 * boolean: takes all boolean expessions (true or false) and returns true or false
	 * 
	 * cahr : 
	 * before learning char ASCII table that has all the special characters.
	 * ASCII table : (aciitable.com)
	 * 
	 * all the characters must be declare in single quote
	 * you can provide only one char or number etc... in this quote
	 * also you can use the code that have been corresponded in ASCII
	 * 	
	 * INITIALIZING CHAR TO OTHER PRIMITIVES
	 * you can initialize char as numbers in byte, short, int, long, float, double
	 * if you give the char name that initiliazed before for a char it will ba a copmpile error
	   becouse the when the char given directly it translates to a number. but when it declared as char 
	   it becomes more than 1 bytes.  short takes 2 byte but it also can't  take this. because chat takes part from memory about
	   60000 bytes
	   
	   
	 * 
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean result = true ;
		boolean result2 = false ;
		boolean result3 = 9 > 3 ; //(returns true)
		boolean result4 = 3 > 9 ; //(returns false)
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		char char1 = 'a';
		System.out.println(char1);
		char char2 = '#';
		char char3 = '9' ;
		char char4 = 67;
		System.out.println(char4);
		
		int myInt = 'b'; //prints out 98
		char myChar = 'b' ;
		System.out.println(myInt);
		char Char = 's'; /*
		byte num = Char;  COMPILE ERROR */
		byte num = 's' ; // it can work...
		
		int exint = Char ; /*
		short exint1 = Char : */
		char exint3 = 1071 ;
		float exint4 = Char ;
		double exint5 = Char ;
		
		System.out.println(exint3);
		
		
	}
	
	
	
	
	
}
