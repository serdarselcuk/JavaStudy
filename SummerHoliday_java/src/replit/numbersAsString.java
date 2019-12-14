package replit;

import java.util.Arrays;

public class numbersAsString {
	
	public static void main(String[] args) {
		int[] a  = {1,2,3};
		int[] b = {4,5,6};
		int [] c = new int[a.length+b.length-1];
				
		int i = 0;
		for (int each : b) {
			c[i] = each ;
			i ++ ;
		}
		System.out.println( Arrays.toString(c));
	}
}
