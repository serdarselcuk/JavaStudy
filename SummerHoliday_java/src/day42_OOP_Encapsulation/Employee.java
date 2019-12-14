package day42_OOP_Encapsulation;

public class Employee {

		/*
		 * Name
		 * SSN
		 * Age
		 * Salary
		 */
	
	private String name;
	private long sSN;
	private byte age;
	private double salary;
	
// getters 
	
	public  String getName() {
		return name;
	}
	public long getSsn() {
		return sSN;
	}
	public byte getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	
//setters
	
	public  void set(String name) {
		this.name = name;
	}
	public void set(long sSN) {
		this.sSN = sSN;
	}
	public void set(byte age) {
		this.age = age;
	}
	public void set(double salary) {
		this.salary = salary;
	}
}
