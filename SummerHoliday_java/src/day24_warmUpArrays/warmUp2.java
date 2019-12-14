package day24_warmUpArrays;

public class warmUp2 {
public static void main(String[] args) {
	//2. write a program that can return the second maximum value from an int array

	int[] array = {9, 0, 2, 1, 3};
	int biggest = 0;
	int biggest2 = 0;
	for ( int i = 0; i< array.length;i++) {
		if (array[i]>biggest) {
			
			biggest = array[i];
		}else if (array[i]>biggest2) {
			biggest2 = array[i];
		}
	}System.out.println(biggest2);
		

}
}
