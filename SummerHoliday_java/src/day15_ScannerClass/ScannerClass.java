package day15_ScannerClass;

import java.util.Scanner;

public class ScannerClass {
	/*Scanner class: used for reading user inputs 
	in order to use scanner, we MUST import it from its package: 
	 import java.util.Scanner; 
	 // imports scanner class only from the java.util' package  
	 the import statement MUSt be placed between class and pckage: 
	package A; 
	 import java.util.Scanner; 
	publi class B{  } 
	wild import:  
	import java.util.*; 
	 // imports all the classes within "java.util" package 

	Decleration of scanner class:
	 Scanner variableName = new Scanner(System.in) 
	  variableName: can reference an object of scanner class 
	 new Scanner(System.in): creates an object from the scanner class 
	  Scanner methods: 
	  variableName.nextByte(): 
	           returns the user input as byte value 
	    variableName.nextShort(): 
	                 returns the user input as short value 
	 variableName.nextInt(): 
	   returns the user input as int value 
	   variableName.nextLong(): 
	 returns the user input as long value 
	 variableName.nextBoolean(): 
	            returns the user input as boolean value 
	variableName.nextFloat(): 
	            return the user input as float value         
	 variableName.nextDoub            return the user input as double value 
	     variableName.nextLine(): 
*/
// Methods of input different data type
	
  public static void main(String[] args) {
	  
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter seven numbers : \n");
    
      Byte num1 = input.nextByte();
      
      double num2 = input.nextShort();
      
      double num3 = input.nextInt();
      
      double num4 = input.nextLong();
      
      double num5 = input.nextDouble();
      
      double num6 = input.nextFloat();
      System.out.println("enter a boolean : \n");
      
      boolean num7 = input.nextBoolean();
      
   System.out.println("enter some words : \n");
      
      String str1 = input.next();// it takes only one word
      String str = input.nextLine();// it takes the entire input
      System.out.println(str);
      
     // System.out.println(num1+""+num2+""+num3+""+num4+""+num5+""+num6+""+num7+""+str1+""+str);
}
}