package day46_superKeyWord;

class B{
	public B() {
		System.out.println("super class default constructor");
	}
}

public class DefaultConstructor extends B {
	
	// if the constructor of super class is called by default in the sub class' default constructor by Default ...
	
	public DefaultConstructor() {
		// even you don't see here the superclass has been called automatically ( super(); ) 
		System.out.println("sub class constructor");
	}
	public static void main(String[] args) {
		
		DefaultConstructor obj = new DefaultConstructor();//	super class default constructor
//																sub class constructor


		
	}
	
}
