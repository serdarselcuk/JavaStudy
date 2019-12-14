package day33_Constructors;

public class constructors {

	/* 3 type of methods:
	 			
	 			1- void
	  			2- return methods
	  			3- constructor (special)
	  			
	 * Constructor is  a very  special method , used for creating the objects

 	in the regular methods we have :
 								Access modifier- specifier- return type - method name(parameters)
 	but in declaration of constructors :
 								access modifier- className(parameter)
 	
 	*   Every single class MUST have a constructor, if we din't give the constructor, then the complier
 		will give the default (no-arg) constructor
 		
 								access modifier - className(){
 									// statement
 								}
 	*	constructor can not have return type and also specifier so it can not return any value
 	*	constructor name MUST be same with the class name
 	*	if you want to have more than one constructor you MUST overload it
 
 	Constructor calls :
 	only a constructor can call another constructor
 	
 	constructors' execution depends of the creation of the object
 	
 	Creation of an object from a class :
 		className referanceName : new existingConstructor
 		when we create object we need to use the existing constructor name
 
  	
	 */
	public constructors(String str) {
//  public constructors(){
		// TODO Auto-generated constructor stub
		System.out.println(str + "serdar made this constructor");
	}
	public constructors() {
		
		System.out.println("And this is the overloding the constructor");
		
	}
	public static void main(String[] args) {
	
		constructors obj = new constructors("serdar");		// serdar made this constructor
		constructors obj1 = new constructors();				// And this is the overloading the constructor

//		as soon as you create the object it executes the constructor


	}
}
