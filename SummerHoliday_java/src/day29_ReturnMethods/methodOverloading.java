package day29_ReturnMethods;

public class methodOverloading {
/* it's a feature which allows us to use methods efficiently
 * you can use several method by the same name. but methods must have different parameters
 	why do we use overloading:
 		1. method names can be re-useful
 		2. it is more readable
 		3. it easy to remember the names
 	
 	
*/		
	public static void main(String[] args) {
		System.out.println( sum(3 , 2));//5
		System.out.println(sum(2, 3, 4));//9
		System.out.println(sum(2.6, 3.4));//5.699999999999999
	}
	public static int sum(int a, int b) {
		return a + b ;
		
	}public static int sum(int a, int b, int c) {
		return a + b + c ;
		
	}public static double sum(double a, double b) {// also there is 2 variable, they are differnt kind of  
		return a+b;
	}
}
