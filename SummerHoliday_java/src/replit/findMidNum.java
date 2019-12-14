package replit;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class findMidNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		System.out.println("Enter third number:");
		int num3 = scan.nextInt();
		
		int midNum = (num1 < num2 && num1 > num3) || (num1 > num2 && num1 < num3)? num1
				:(num3 < num2 && num3 > num1) || (num3 > num2 && num3 < num1)? num3
						:num2;
		System.out.println(midNum);
	}
}
