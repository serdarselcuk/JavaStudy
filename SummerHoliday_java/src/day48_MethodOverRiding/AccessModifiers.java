package day48_MethodOverRiding;

class Mahribana{
    
    void methodA() {   
        // the method we are going to override MUST be inheritable to the sub class
        System.out.println("Method A");
    }
    
    
    protected String methodB() {
        return "B";
    }
    
    /*
    public String methodB() {// you can not override in the same class
        return "C"
    }
    */
    
    
    protected double salary(double bonus) {
        return bonus+100000;
    }
    
}
public class AccessModifiers extends Mahribana {
    /*
     protected double salary(double bonus) {	// you can not override in the same class
        return bonus+100000;
    }
     */
    
    @Override
    protected double salary(double bonus) {
        return bonus+20000;
    }
    
    
    /*
    @Override
    private void methodA() {
        System.out.println("Method A");
    }
        override method' access modifiers need to be same or MORE VISIBLE
    */  
    
    @Override
     void methodA() {       //  same or more visible
        System.out.println("Method A");
    }
    
    @Override
     protected String methodB() { // must be same MORE VISIBLE; you can not reduce the visibility
        return "C";
    }
    
    
}