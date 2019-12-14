package day40_StaticKeyWord;

public class StaticKeyWord{
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
	
	
	public static String name = "serdar" ;
	static {
		name = "a";
	}
	{
		name = "b";
	}
	            
	        int a;
	        static int b ;
	    
	    public static void main(String[] args) {
	        System.out.println(name);
	        StaticKeyWord obj1 = new StaticKeyWord();
	            obj1.a = 100;   
	            
	        StaticKeyWord obj2 = new StaticKeyWord();
	            obj2.a = 200;
	            
	            System.out.println( obj1.a );  // 100
	                // each object has its own copy of instance variables
	            
	            System.out.println( obj2.a ); //  200
	            
	        double num = 100.5;
	        
	        System.out.println( StaticKeyWord.b );
	        System.out.println( obj1.b );
	        System.out.println( obj2.b );
	        
	        System.out.println("=======================");
	        
	        StaticKeyWord obj3 = new StaticKeyWord();
	                obj3.a = 100;
	                System.out.println(obj3.a);    // 100
	                
	                
	        StaticKeyWord obj4 = new StaticKeyWord();       
	        System.out.println(  obj4.a );   //  0
	        
	        
	        obj3.b = 400;
	        System.out.println( obj3.b ); // 400  
	        
	        System.out.println( obj4.b );
	        
	        
	        
	    }
	    
	    public static void method1(){
	    //  System.out.println( num );  local variables only visible within the methods
	        
	    }
	    
	    
	    
	}

