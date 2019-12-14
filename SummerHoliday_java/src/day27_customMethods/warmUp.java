package day27_customMethods;

import java.util.Arrays;

public class warmUp {
	public static void main(String[] args) {
		
int i = 0;
int[] numbers = new int[100];
	for(int each : numbers) {
		numbers[i] = ++i;
		System.out.println(i);
	}System.out.println(Arrays.toString(numbers));
}
}