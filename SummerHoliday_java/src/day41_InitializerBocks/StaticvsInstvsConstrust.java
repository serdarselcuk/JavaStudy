package day41_InitializerBocks;

public class StaticvsInstvsConstrust {
	
	  static {
	        System.out.println("static block");    
	        // static block execution does not depend on the object
	                // executed as soon as the class is loaded, ONLY ONCE
	    }
	    
	    {
	        System.out.println("instance block");
	        // instance block' execution depends on the object
	        // when object is created, instance block runs first, then constructor
	    }
	    
	    public static void main(String[] args) {
	        
	    	 StaticvsInstvsConstrust obj  = new  StaticvsInstvsConstrust();
	    	 StaticvsInstvsConstrust obj2 = new  StaticvsInstvsConstrust();
	    	 StaticvsInstvsConstrust obj3 = new  StaticvsInstvsConstrust();
	        
	        // constructor and instance block' execution depends on the creation of object
	    }
	    
	
public StaticvsInstvsConstrust() {
    System.out.println("Constructor");
    // instance block' execution depends on the object
    // when object is created, constructor runs after the instance block
}

}
