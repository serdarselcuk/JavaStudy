package day20;

public class StringMethod {
	public static void main(String[] args) {
		
	String space = " ";	
	String star = "*";
	for ( int i = 0; i < 5; i++) {
		System.out.print(i);
		System.out.println(space.repeat(10-i)+star.repeat(2*i+1));
		if (i == 4) {
			for (int a = 0; a<5; a++) {
			i= i-a;
			System.out.println(space.repeat(10-i)+star.repeat(2*i+1));
			}
		}
	}	
}
}