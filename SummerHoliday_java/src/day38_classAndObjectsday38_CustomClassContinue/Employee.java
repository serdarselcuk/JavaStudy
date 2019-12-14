package day38_classAndObjectsday38_CustomClassContinue;

public class Employee {
	
	
	String employeeName ;
	String employeeID ;
	int age ;
	int ssn ;
	String jobTitle ;
	double salary ;
	
	public void getInfo() {
		System.out.println("Employee name is: "+employeeName);
		System.out.println("SSN is          : "+ssn);
		System.out.println("Age is          : "+age);
		System.out.println("Job title is    : "+jobTitle);
		System.out.println("Salary is       : "+salary);
		System.out.println("Employee ID     : "+employeeID);
		System.out.println("===========================================");
		
	}
	public Employee(String employeeName,int birthYear,int ssn, String employeeID, String jobTitle, double salary ){
		
		this.employeeName = employeeName;
		this.age = birthYear>1000 ? (2019 - birthYear):birthYear;
		this.ssn = ssn;
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;
		this.salary = salary;
		
	}
}
