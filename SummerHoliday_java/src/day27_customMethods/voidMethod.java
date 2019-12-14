package day27_customMethods;

import java.util.Arrays;

public class voidMethod {
	public static void main(String[] args) {
		myFirstMethod();
		numTo100();
		
	}

	public static void myFirstMethod() {
		System.out.println("Hello !");
		System.out.println("HelloCybertek!");
		System.out.println("Hello Khurshed");

	}
	public static void numTo100() {
		int i = 0;
		int[] numbers = new int[100];
			for(int each : numbers) {
				numbers[i] = ++i;
				System.out.println(i);
			}System.out.println(Arrays.toString(numbers));
		
	}
}
