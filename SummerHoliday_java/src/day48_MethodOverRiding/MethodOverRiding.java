package day48_MethodOverRiding;


class Student{
	public void printName() {
		System.out.println("hakan");	
	}
	
}



public class MethodOverRiding extends Student{

	public void print(String[] str) {
		
	}
	public void print(double a) {
		
	}
//public void print(String[] str) 	over riding cannot happenin the same class
		
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.printName();
		
		MethodOverRiding obj2 = new MethodOverRiding();
		obj2.printName();
	}
}
