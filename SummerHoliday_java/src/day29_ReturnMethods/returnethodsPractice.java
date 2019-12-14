package day29_ReturnMethods;
import java.util.Arrays;
public class returnethodsPractice {
	public static void main(String[] args) {
		
		int[] array = {99,8,7,6,5,4,4,3,2};
		sum(10,20);
		System.out.println(addition(15, 25));
		System.out.println(max_array(array));
		System.out.println(Arrays.toString(decending(array)));
	}
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	public static double addition(double a, double b) {
		return a+b;
	}
	public static int max_array(int[] array) {
		Arrays.sort(array);
		int result = array[array.length-1];
		
		return result;
	}
	public static int[] decending(int[] array) {
		array = multiply(array, -1);
		
		Arrays.sort(array);
		
		array = multiply(array, -1);
		return array;
	}
	public static int[] multiply(int[]array,int m) {
		
		for(int i =0;i<array.length;i++) {
			array[i]*=m;
		}
		return array;
		
	}
	
	}
		



