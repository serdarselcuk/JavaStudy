package day28_review;



public class warmUp_2 {
/*3. write a method that accepts 3 parameters: 2 numbers and one operator, and prints out the calculation 
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10,2, "*") ==> 20;
*/
	public static void main(String[] args) {
		calculator(3, 5, '/');
	}private static void calculator(double a, double b , char operator ) {
		double result = 0;
		switch(operator) {
			case('+'):
				result = a=b;
				break;
			case('-'):
				result = a-b;
				break;
			case('*'):
				result = a*b;
				break;
			case('/'):
				result = a/b;
				break;
			case('%'):
				result = a%b;
				break;
			default:
				System.out.print("invalid operator");
		}
		
		System.out.println(result);

	}
}
