package day06_ArithmaticOperators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		/* addition :       +
		 * subtraction :    -
		 * multiplication : *
		 * division :       /
		 * remainder :      %
		 */
	
		int a= 100 ;
		int b= a-400 ;
		System.out.println(b);//-300
		
		int x = 3, y = 5, z = x*y;
		System.out.println(z);// 15
		
		System.out.println(2 + 3 * 5 ); // first multiplication and division than addition and subtraction
		
		// double resultnum = 9/0 ; // denominator (divider) can not be zero!
		
		double num0 = 10 /3 ; // system always take it as int and than calculate... so it will give us : 3.0
		System.out.println(num0);//3.0
		
		float num1 = 10 / 3f ;/// it's enough to put f to the denominator... 10.0/3 , 10/3.0 ... can be the same
		System.out.println(num1);//3.3333
		
		//remainder
		int result1 = 20%3 ; // 2
		
		/* 20, 45, 65, 68
		 * even number : can be divided by 2 without any reminder
		 * odd number : when divided by 2 there will be reminder
		 */
		int number20 = 20 % 2 ;// even (0)
		int number45 = 45 % 2 ;// odd  (1)
		
		System.out.println( number20 + " "+ number45 );
		
		System.out.println(6%3*2);// VIP are () than *,/,%.... 
		
		
		
		
		// grouping primitives
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}
}
