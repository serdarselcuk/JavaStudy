package day41_InitializerBocks;

public class StaticBlock {

	static {
		
		System.out.println("sattic block1");
		// static block gets executed first even before main method
		// static blocks created out side the main method under the class
	}
	
	
	public static void main(String[] args) {

		
		System.out.println("main method");	
	}
	
	
	static {
		
		System.out.println("sattic block2");
		// we can create multiple static blocks and also it not differ the where we create it top or bottom
		
	}
}