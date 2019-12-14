package day25_arrayMethods;

import java.util.Arrays;

public class dimensionalArray {

	public static void main(String[] args) {
// n dimensional Array that contains multiple n-1 dimentional array
		
		int[] arr1D = {1, 2, 3};
		int[][] arr2D = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		System.out.println(Arrays.toString(arr2D));  //	[[I@e2d56bf, [I@244038d0, [I@5680a178]
		
		//[]==> first bracket for 1 dimensional array
		//[]==> second bracket for 2. dimensional array
		
		System.out.println(arr2D[2][2]);//						9
		System.out.println(Arrays.toString(arr2D[2]));//	[7, 8, 9]
		
// Arrays.deepToString(variableName) ==> it's used for entire 2d array
		//int[][] arr2D = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		
		//3 dimensional array:
		
		int[][][] arr3D = {	{{1, 2, 3},{4, 5, 6},{7, 8, 9}},{{10, 11, 12},{13, 14, 15},{16, 17, 18}}}; 
		//								{	0	}						{	1	}
		//						{0}			{1}		{2}			{0}			{1}		{2}
		//					  {0}{1}{2} {0}{1}{2} {0}{1}{2}  {0}{1}{2} {0}{1}{2} {0}{1}{2}
		
		// print =>  8
		
		System.out.println(arr3D[0][2][1]);	// 8
		
		//print {13,14,15}
		
		System.out.println(Arrays.toString(arr3D[1][1])); //[13, 14, 15]
		
		//print {13,14,15}
		System.out.println(Arrays.deepToString(arr3D[1]));//[[10, 11, 12], [13, 14, 15], [16, 17, 18]]
		
		// print entire array 
		
		System.out.println(Arrays.deepToString(arr3D));
		//[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 11, 12], [13, 14, 15], [16, 17, 18]]]
		}
		
	}

