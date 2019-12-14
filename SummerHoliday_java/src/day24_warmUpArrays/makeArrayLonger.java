package day24_warmUpArrays;

import java.util.Scanner;

public class makeArrayLonger {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	while(true){
	int[] arr = new int[0];
	System.out.println("enter a num to array");
	int value = scan.nextInt();
	
	if (count  > arr.length-1) {
		int[] arrx = arr;
		arr = new int[count+1];
		for (int a = 0 ; a < arrx.length; a++) {
			arr[a]= arrx[a];
			
		}arr[count] = value;
		count++;
		
	}
	}System.out.println(arr[arr.length-1]);
	
	
}
}

