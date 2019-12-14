package replit;

import java.util.Arrays;

public class sortArrayNotUsingSortMethod {
	public static void main(String[] args) {    
		
		int[] arr = {5,4,2,7,9,64,52,1};
		int[] sorted = new int[8];			
		
		for ( int j =0; j < sorted.length;j++) {			// iterate the sorted array to assign biggest value
			
			int max = Integer.MIN_VALUE;					// will be used to hold the max value before assign it to sorted[]
			for ( int i = 0; i < arr.length ; i++) {		// iteration of the arr[]
				
				if (arr[i] > max  && j == 0 ) 				//for the first iteration assign the biggest value 
					max = arr[i];
				else if (arr[i] > max && arr[i] < sorted[j-1])// the other iterations if the value is big but not as much as before
					max = arr[i];
				else
					continue;
			}
			sorted [j]= max;								//assign the max int to the array list of sorted
		    
		  }
	System.out.println(Arrays.toString(sorted));
	}
}
	

