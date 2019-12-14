package day38_classAndObjectsday38_CustomClassContinue;

public class EmployeesObjects {

	public static void main(String[] args) {
		Employee obj1= new Employee("Serdar", 38, 1234567890, "123abc", "sdet", 42);
		
		obj1.getInfo();
		
		Employee obj2= new Employee("sencer", 1987, 876543210, "321cba", "developer", 55);
		
		obj2.getInfo();
	}
}
