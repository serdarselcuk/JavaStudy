package day19_forLoop;

public class star {
	public static void main(String[] args) {
		String space = " ";	
		String star = "*";
		for ( int i = 0; i < 10; i++) {
			System.out.println(space.repeat(10-i)+star.repeat(2*i+1));
		}
		
}
}
