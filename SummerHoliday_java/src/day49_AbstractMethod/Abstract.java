package day49_AbstractMethod;

	public abstract class Abstract {
	    public abstract void startTheCar(); 
	    
	}
	class Toyota extends Abstract{
	    
	    // public abstract void startTheCar();
	    
	    @Override
	    public void startTheCar() {
	        System.out.println("Brake");
	        System.out.println("push the start button");
	        System.out.println("Release the brake");
	    }
	    
	    public static void main(String[] args) {
	        Abstract  obj = new Toyota ();
	        obj.startTheCar();
	    }
	}
	class Tesla extends Abstract{
	        // regular class MUST implement the abstract methods from the abstract class
	    
	    public void startTheCar() {
	        System.out.println("voice constrol");
	        System.out.println("driver");
	    }
	    
	}