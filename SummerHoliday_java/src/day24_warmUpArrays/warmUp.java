package day24_warmUpArrays;

public class warmUp {
	public static void main(String[] args) {
		
		int[] array = {1, 0, 2, 9, 3};
		int biggest = 0;
		for ( int i = 0; i< array.length;i++) {
			if (array[i]>biggest) {
				biggest = array[i];
			}
		}System.out.println(biggest);
			
	}
}
