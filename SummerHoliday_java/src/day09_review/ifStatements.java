package day09_review;

public class ifStatements {
	/*
	 * if statements: 
	 * 		single if statements : 
	 * 			if(boolean expression) {
	 * 					some codes to run 
	 * 				}
	 * 			if block only gets executed if the condition is true
	 */
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello");//executed
		}
		if ( 10 > 9 ) {
			System.out.println("hi");//  executed
		}
			
		int a = 1847654;
		if ( a++ == a) {
			a = 2000;
			}
		//if else {
		//	a =3000;
		//}
		System.out.println(a);
		
		if ( a % 2 == 0) {
			System.out.println("it's an even num"); // because of previus if statement (a++) it became an odd number
		}
		if ( a % 2 != 0) { //true
			System.out.println("it's an odd num \n\n");
			
			}
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		
		if (Kuzzat == CEO ) {
			System.out.println("great person in the world");
		}
		if (Kuzzat != CEO) {
			System.out.println("hahahaaa");
		}
				
		int age = 17 ;
		if (age >= 18) {
			System.out.println("you can vote");
		}
		else {
			System.out.println("go home yankee!");
		}
		}
			
	}
	

