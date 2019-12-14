package day34_returnMethotWithArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class returnMethodWithArrayList {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(ArrayToArrayList(arr));
	}
	public static ArrayList<Integer> ArrayToArrayList(int[]arr){
		
		ArrayList<Integer>result= new ArrayList<>();
		for(Integer each : arr) {
			result.add(each);
		}
		return result;
	}
	public static int maxnum(int[]arr) {
		ArrayList<Integer>array = ArrayToArrayList(arr);
		return 1;
		
	}
	
}
