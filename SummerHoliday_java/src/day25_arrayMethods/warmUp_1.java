package day25_arrayMethods;

import java.util.Arrays;

public class warmUp_1 {
public static void main(String[] args) {
	
	int[] arr = {9, 4, 2,-2, -5, 6, 5, -8, 3, 7, 1};
	for(int i = 0; i < arr.length; i++){
		
		arr[i]*= (-1); // multiply by -1 to revers sorting
		
	}
	Arrays.sort(arr);
	for(int i = 0; i < arr.length; i++){
		
		arr[i]*= (-1);  // again multiplying by -1 to turn numbers to normal situation
	}
	System.out.println(Arrays.toString(arr));
}
}
