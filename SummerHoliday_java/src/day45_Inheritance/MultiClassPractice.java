package day45_Inheritance;

class Data{
	
	public String name;
	private String age;
	String ID;
	
	public void Hello() {
		
	}
	private void hola() {
		
	}
	void Aloha() {
		
	}
	
}

public class MultiClassPractice {
    
    public static void main(String[] args) {
        
        Data obj = new Data();
        
        System.out.println( obj.name );  // public is visible at everywhere
        
    //  System.out.println( obj.age );  // private is not visible outside the class
        
        System.out.println( obj.ID);  // default access modifier is visible to class in the same package
        
        /* 
         if those two classes were located in two different packages, 
            then the default access modifier is not going to be visible
        */
        
        obj.Hello();
        // obj.Hola();
        obj.Aloha();
        
        
        
    }
}
