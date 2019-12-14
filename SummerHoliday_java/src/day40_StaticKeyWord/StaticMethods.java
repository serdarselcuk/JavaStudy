package day40_StaticKeyWord;

import java.util.Scanner;

public class StaticMethods {
	
	/* static methods: a method that we can call through the class name
	 
	 STATIC METHOD ONLY ACCEPTS CLASS MEMBERS
	 
	
	 */
	static String staticString = "serdar";
	String non_StaticString = "Selcuk";
	static Scanner scan = new Scanner(System.in);
	
	public static void sayHello() {
		
		System.out.println("Hello!");
		 // static methods only accepts the static variables or methods, 
		// only static member are be shared with the class
	}
	
	public void sayGoodbye() {
		System.out.println("bye!");
	}
	
	public static void main(String[] args) {
		
		StaticMethods.sayHello();		//hello
//		StaticMethods.sayGoodbye();	=====> it's not available because it shared only with the objects . it's not static. you should create object first
		
		System.out.println(StaticMethods.staticString);// static variables are also called by the class name
		System.out.println("StaticMethods.non_StaticString"+"can not be called by the method names");//Non Static variables can not be called by the method name
		
		StaticMethods obj = new StaticMethods();
		
		obj.sayGoodbye();// instance methods has been shared with only instance variables
		obj.sayHello(); // you can also call the static methods by objects but the static way is preferred...so yellow line is
		
		System.out.println(obj.non_StaticString ); //Non static variables can only called with objects
		System.out.println(obj.staticString);// Also you can all static variables whit objects but again it is not preferred way
		
		System.out.println(StaticVariable.name);// you can also call the class in other classes and there will be available to call static variables by class name also
		
		/*
		 	1-	static is shared by class and according to that all static methods
		 	2-	  
		 */
	}
	
	
}
