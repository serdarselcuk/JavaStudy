package day20;

import java.util.Scanner;

public class warmUp_2_TenNumSum {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 10 nummbers");;
			int sum = 0;
			for(int i = 0 ; i<10 ; i++) {
				int num = scan.nextInt();
				sum += num;
			}
			System.out.println(sum);
	}
}
