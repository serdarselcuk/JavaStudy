package day45_Protected_Default;

import day45_Inheritance.Protectd_VS_Default;

public class Test extends Protectd_VS_Default{
	
	public static void main(String[] args) {
		
		Protectd_VS_Default obj = new Protectd_VS_Default();

		Test obj1 = new Test();
		
		
		obj1.printHello();		 	//protected does not visible out of the class but it can be inherited
//		obj.printHola();			default does not also seen out of the class
		
		
		
	}
}
