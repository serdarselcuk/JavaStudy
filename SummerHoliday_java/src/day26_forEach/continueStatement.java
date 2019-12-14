package day26_forEach;

import java.util.Arrays;

public class continueStatement {
	public static void main(String[] args) {
		/* 
		 break statement : used to exit loop and exit from the swich 
		 
		 continue statement: used for skipping current iteration in the loop
		 */
	for (int i = 0; i<10; i++) {
		if (i == 5) {
			continue;
		}System.out.print(i+" ");//0 1 2 3 4 6 7 8 9 
	}System.out.println();
	int[] numbers = {1,2,3,4,5};
	for (int i = 0 ; i< numbers.length;i++) {
		if(i==2||numbers[i]==4) {
			continue;
		}System.out.print(numbers[i]+" ");
	}System.out.println();
	
	}
}
