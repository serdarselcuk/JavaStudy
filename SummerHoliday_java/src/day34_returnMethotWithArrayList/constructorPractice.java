package day34_returnMethotWithArrayList;

import java.util.ArrayList;

public class constructorPractice {
	public static void main(String[] args) {
		
		/* It's mainly used for creating the object
		 * Every single class must have constructor
		 * If you don't create any constructor than complier will determine a default one
		 * Constructors name must be the same with class name
		 * Constructors doesn't returns any thing as you see there is not any return type and also specifier
		 * Constructors can  be overloaded also. If not you can not create any other out of the dfault. Because
		  names must be the same as class name
	
		
	Defining Default constructor
		 
		Access-modifier   -   className(){
 
 	Constructor Call :
 
		 	* Only constructors can call another constructor
		 	* Constructors can not be called by their name. you should use " this() " word and call 
		 	current class constructor
		 	* Constructor  calls MUST be the first statement in the constructor
		 	* One constructor can only call one constructor. thats the capacity
			* Constructor can't call itself.
			* Constructors can not contain itself also... So if you called a constructor thats already 
			calling the constructor that you are coding there will be a compiler error 
			* 
		Constructor
		
		*/
		
		constructorPractice obj = new constructorPractice();
		
	}public constructorPractice(){
		this(9120);				// MUST BE  THE FIRST STATEMENT IN THE CONSTRUCTOR
		System.out.println("constructor without argument");
		
	}public constructorPractice(int a){
		this(10.2);
		System.out.println("now the constructor with parameter of int id working : int "+ a);
		
	}public constructorPractice(double a){
		
	//	this();		you can not call the constructor that includes this constructor
		System.out.println("and this is the double one");
		
	}
}
