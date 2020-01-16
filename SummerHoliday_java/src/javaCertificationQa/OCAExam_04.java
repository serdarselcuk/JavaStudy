package javaCertificationQa;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Student {
int price ;
	
	abstract public void printToy();
}
public class OCAExam_04 {

public static void main(String[] args) {

	
	ArrayList<Integer>arr=new ArrayList<Integer>();
	arr.add(1);
	arr.add(null);
	arr.add(3);
	System.out.println((arr));
	
}

}
/*
1- if extending a class, has non-default constructor must call super class constructor
2- you should use abstract key word even it is an abstract class
3- Arrays doesn't turns null while printing. it throws exception, but not in ArrayList
4- it is possible to import a static  method , also;
		import static package.class.method;
5- you can't use access modifier in methods, only final has been permitted
6- 
*/