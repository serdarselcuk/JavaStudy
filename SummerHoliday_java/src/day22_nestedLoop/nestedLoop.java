package day22_nestedLoop;

public class nestedLoop {
	public static void main(String[] args) {
		
		int i = 0;
		while(i<10) {
			for(int a = 10-i; a>0; a--) {
				System.out.print("*");
			}i++;
			System.out.println();
		}
	}
}