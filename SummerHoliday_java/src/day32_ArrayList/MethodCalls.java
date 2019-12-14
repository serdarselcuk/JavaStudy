package day32_ArrayList;

public class MethodCalls {

		public static void main(String[] args) {
			System.out.println(max(10,20,30,40));
		}
		public static int max(int a, int b) {
			return (a > b)? a : b;

		}
		public static int max(int a, int b, int c){
			return max(max(a, b) , c);
		}
		public static int max(int a, int b, int c, int d){
			return max(max(a, b),max(c,d));
		}
		public static void maximum(int a, int b, int c) {
			System.out.println(max(a, b, c));
			
		}
}
// write a return method that can remove the duplicates from a string
//			("aabbbccdd")==> abcd
//write a return method that passes two string parameters a and b, return the number of appearances of b in a
//			("aabb","a")==> 2
//combine methods to find the frequency of characters
//			("aaaavvbbbfgg")===> a4v2b3f1g2