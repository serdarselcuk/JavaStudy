package day46_superKeyWord;

class A{
	
	String name = "Madina";
	
	public void methodA() {
		System.out.println(name);
	}
	
	public A(int a) {
		
	}
	
}


public class SuperKeyWord extends A {
	//			sub				super	
	
	
	// String name = "Madina";  has been inherited here
	
	
	public SuperKeyWord() {
		
		super(3);		// superclass constructor must be called in the sub class constructor// And it is calling by super keyword
	}
	/* 
	 if you have not created any constructor in superclass than default one going to be cancelled. And than you have to be call this constructor in the sub class' constructor
	  
	 */
	public static void main(String[] args) {
		
		SuperKeyWord obj = new SuperKeyWord();
	}
	public void method() {
		
		SuperKeyWord obj = new SuperKeyWord();
		obj.name = "serdar";
        super.name = "Mahir";
        this.name = "Ihsan";
        obj.methodA();
        super.methodA();
        this.methodA();
        Fake obj = new Fake();
        
	}
}
