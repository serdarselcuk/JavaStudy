
package Assigments2;

public class biggerNum {
	/*
	 * write a program that checks for the bigger of 3 numbers. you get 3 int
	 * variables: n1 , n2 and n3 if n1 is biggest output: "n1 is bigger" if n2 is
	 * biggest output: "n2 is bigger" if n3 is biggest output: "n3 is bigger"
	 * 
	 * for example:
	 * 
	 * n1 = 1 n2 = 2 n3 = 1
	 * 
	 * output: "n2 is bigger"
	 * 
	 * n1 = 3 n2 = 2 n3 = 1
	 * 
	 * output: "n1 is bigger"
	 * 
	 * n1 = 3 n2 = 2 n3 = 30 output: "n3 is bigger"
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n1 = 3, n2 = 2, n3 = 3;
		float median = (n1 + n2 + n3) / 3f;

		if (median <= n1) {
			System.out.println("n1 is bigger");
		}
		if (median <= n2) {
			System.out.println("n2 is bigger");
		}
		if (median <= n3) {
			System.out.println("n3 is bigger");
		}

		if (n1 == n2 || n2 == n3 || n1 == n3) {

			System.out.println("they are equal eachother");
		}
	}
}
