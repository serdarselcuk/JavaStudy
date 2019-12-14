package day40_StaticKeyWord;

public class StaticVariable {
	
	
	static String name;
	String surname;
	static double staticNum;
	
	/*
	static members belongs to the class, also called class members 

	what can be static in java: 

	1. static variables 
	2. static methods 
	3. static initializer block 
	4. static inner class (nested class) 

	instance variables: created in the class outside any method. 
	belongs to the object. each object will have its own copy 
	
	local variables: declared within the methods or blocks 
	only accessible within the method or block 
	
	static variables: created in the class outside any method with static keyword

	when a variable is static, it's shared by class and all objects of the class. and we can call it through the class name 
	*/
	
	public static void main(String[] args) {
		
		StaticVariable obj1 = new StaticVariable();
		
		obj1.name = "Omer";					// static variable
		obj1.surname = "Selcuk";			// instance variable
		System.out.println(obj1.name);		//Omer
		System.out.println(obj1.surname);	//Selcuk
		
		StaticVariable obj2 = new StaticVariable();
		
		System.out.println(obj2.name);		//Omer ** name is static
		System.out.println(obj2.surname);	//null
		
		obj2.name = "Kurshad";
		obj2.surname = "agiralioglu";
		
		System.out.println(obj2.name);		//Kurshad   ** you can change it
		System.out.println(obj2.surname);	//agiralioglu
		System.out.println(obj1.name);		//Kurshad	** and it will be changed for all class
		System.out.println(obj1.surname);	//Selcuk
		
		System.out.println("============================================================================");
		System.out.println(StaticVariable.staticNum);// you can call static variables also by class name. 
													//		because they also shared with the class. Instance
													//		methos are shared only to the objects
		
		StaticVariable object = new StaticVariable();
		object.staticNum = 4.5;
	}
}
