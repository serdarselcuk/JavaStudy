package day20;

import java.util.Scanner;

public class warmUp_4_minNumber {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 5 numbers");
	int max = 0;
	double min=0;
	for(int i= 0 ; i< 5 ; i++ ) {
		int num = scan.nextInt();
		if (i == 0)
			min = num;
		if (num > max)
			max = num;
		if (num < min)
			min = num;
	}
	System.out.println((int)min+"<=== min / max ===> "+max);
}
}
