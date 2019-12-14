package day26_forEach;

import java.util.Arrays;

public class forEach_multiDimensional {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] each :  arr) {
			//System.out.println(Arrays.toString(each));//[1, 2, 3][4, 5, 6][7, 8, 9]
			for(int num : each) {
				System.out.print(num+" ");//1 2 3 4 5 6 7 8 9 
			}
		}
		String[][] str2D = { { "Bibish" , "Syfo"},{"Serdar", "Julia"}};
		for( String[] each2 : str2D) {
			for(String each1 : each2) {
				System.out.print(each1+" ");//Bibish Syfo Serdar Julia 
			}
		}
		System.out.println();
		// #D array :
		int[][][] arr3D = {{{1,2},{3,4}},{{5,6},{7,8}}};
		for(int[][] each2 : arr3D) {
			for(int[] each1: each2) {
				for(int each : each1) {
					System.out.print(each);//12345678
				}
			}
		}	
	}
}
