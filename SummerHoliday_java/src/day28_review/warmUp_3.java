package day28_review;

import java.util.Arrays;

public class warmUp_3 {
	public static void main(String[] args) {
		int[] array = {3, 6, 1, -1, 9, 45, -23};
		sort_reverse(array);
		
	}public static int[] multiplyarray (int[] array, int a) {
		int i = 0;
		for (int each : array) {
			array[i] = each*(a);
			i++ ;}
		return array;
	}public static void sort_reverse(int[] array) {
		multiplyarray(array, -1);
		Arrays.sort(array);
		multiplyarray(array, -1);
		System.out.println(Arrays.toString(array));

	}
}
