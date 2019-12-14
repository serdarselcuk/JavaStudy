package day33_Constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class warmUp_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer>arr = new ArrayList<Integer>();
		for ( int i = 0; i< 5 ; i++) {
			arr.add(i, scan.nextInt());
		}
		
		System.out.println( "max num : " + maxNum(arr) + " min num : " + minNum(arr));
	}
	public static int maxNum(ArrayList<Integer>arr) {
		
		int max = 0;
		for ( int i = 0 ; i < arr.size(); i++ ) {
			
			if( arr.get(i) > max) {
				
				max = arr.get(i);
			}
		}
		return max;
	}
	public static int minNum(ArrayList<Integer>arr) {
		
		int min = Integer.MAX_VALUE;
		for ( int i = 0 ; i < arr.size(); i++ ) {
			
			if( arr.get(i) < min) {
				
				min = arr.get(i);
			}
		}
		return min;
	}	
}
