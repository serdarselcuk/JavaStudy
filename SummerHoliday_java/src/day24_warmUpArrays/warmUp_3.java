package day24_warmUpArrays;

public class warmUp_3 {
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 9, 3};
		int smallest = array[0];
		int smallest2 = array[0];
		for ( int i = 0; i< array.length;i++) {
			if (array[i]<smallest) {
				
				smallest = array[i];
		
			}else if(array[i]<smallest2 || smallest == smallest2)
				smallest2 = array[i];
		}System.out.println(smallest+""+smallest2);
	}
}
