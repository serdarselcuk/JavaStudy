package replit;

import java.util.ArrayList;
import java.util.Arrays;

	public class ErrorCheck {
		
	public static void main(String[] args) {
	
	String line = "error is important";
	System.out.println(line.substring(0, line.indexOf(" ")));
	System.out.println( line.substring(0, line.indexOf(" ")).equals("error"));

	ArrayList<Integer>nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
	timesTwo(nums);
	System.out.println(nums);
	
	int[] arr = {1,2,3,4,5,6};
	System.out.println(Arrays.toString(deleteR(arr, 4)));
	
}

	public static void timesTwo(ArrayList<Integer> nums){
		for (int i= 0; i< nums.size();i ++) {
			nums.set(i, (nums.get(i)*2));
		}
	}
	public static int[] deleteR(int[] arr,int element) {
	    
	    int[] result = new int[arr.length-1];
	    int count =0;
	    
	    for( int i = 0; i < arr.length; i++){
	    
	    	if(arr[i] != element){
		        result[count] = arr[i];
		        count++;
	    	}
	    }
	   return result;
}
	}
