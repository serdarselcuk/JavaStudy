package javaCertificationQa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

abstract class Student {
int price ;
	
	abstract public void printToy();
}
public class OCAExam_04 {

public static void main(String[] args) {

	qa3 q=new qa3();
	
	try {
		q.printFileContent();
	} catch (Exception e) {
		System.out.println("1");
	}catch (IOException e) {
		System.out.println("2");
	}
	
	
}

}
/*
1- if extending a class, has non-default constructor must call super class constructor
2- you should use abstract key word even it is an abstract class
3- Arrays doesn't turns null while printing. it throws exception, but not in ArrayList
4- it is possible to import a static  method , also;
		import static package.class.method;
5- you can't use access modifiers in methods, only final has been permitted
6- you can add and remove "null" to array list as a value
7- 
*/