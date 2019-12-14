package day37_classAndObjects;

public class car{
// access modifier allows to use this class on the other methods
	/*
Car (is the class name) 
	 
Data/Attiribute: 
	Model, year, brand, color, price, milage, VIN... 

Actions: 
	Start, drive, accelerate, stop, drift, brake, get ticket... 
*/
	// some variables defined : 
	String Model;
	int Year;
	String Color;
	double Price;
	long Mileage;
	String Brand;
	
	public car (String k) {
		Model = k;
	}
// instance methods : methods belong to the object, does not have  the sppecifier static. designed to work as an instance of the class
 
/* 
regular method:
    access-modifer  specifier  return-Type methodName(parameter){
    }
instance method:
    access-modifer returnType methodName(parameter){
    }

 	
 */
	 	
	public void drive() {
		System.out.println("driving "+ Brand);
	}
	public void start() {
		System.out.println(Model + " is stating");
	}
	public void info() { 
		System.out.println(Year+" "+Brand+" "+Model+", "+Color+", $"+Price+" ," +Mileage+ " mile");
	}
	public static void main (String[] args) {
		car car1 = new car("ferrari");
		car1.drive();
	}
}
