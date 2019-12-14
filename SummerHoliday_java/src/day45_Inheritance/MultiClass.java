package day45_Inheritance;

public class MultiClass {		// you can have only one public class

		public static void main(String[] args) {
			System.out.println("It is the first class");
		}
}class A{	// if you didn't give any access modifier there had been given default one as default	
	public static void main(String[] args) {
		System.out.println("And it is the second one");
	}
}class B{
	public static void main(String[] args) {
		System.out.println("Thatis the third, also");
	}
}
