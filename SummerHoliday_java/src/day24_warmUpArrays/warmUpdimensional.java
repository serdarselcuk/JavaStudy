package day24_warmUpArrays;

import java.util.Arrays;

public class warmUpdimensional {
public static void main(String[] args) {
	int[][] arr = {{1,2,3},{4,5,6,7,8},{9}};
	for (int i = 0 ; i< arr.length;i++) {
		for(int j = 0 ; j < arr[i].length; j++ ) {
			System.out.println(arr[i][j]);
			
			
			
			int arr4[][][][]={{{{10,20},{30,40}},{{50,60},{70,80}}},{{{90,100},{110,120}},{{130,140},{150,160}}}};
			System.out.println("This is 1 dimentional array "+Arrays.deepToString(arr4));
			System.out.println("This is 2 dimentional array "+Arrays.deepToString(arr4[1][1]));
			System.out.println("This is 3 dimentional array "+Arrays.toString(arr4[1][1][1]));
			System.out.println("This is 4 dimentional array "+arr4[1][1][1][1]);

		}}}}
