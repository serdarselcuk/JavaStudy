package day15_ScannerClass;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
/*
 * 09/05/2019 
Topic:  
            1. Scanner class 
            2. String class & String manipulations 

                                    returns the ENTIRE user input as String value 

                        variableName.next(): 
                                    returns the first word of the user input as String value 

String class: 
        1. String is an object 
                    there are two ways to create object from String class: 
                                1. String literals: 
                                                String str = "Cybertek"; 
                                2. by using "new" keyword: 
                                    String str = new String("Cybertek") 
                    when the String object is created by String literals, that object will 
                    be saved at String pool (String pool does not take duplicates) 
                    when the String object is created by using "new" keyword. the object 
                    will be saved at java heap memory (not within the String pool) 

                    heap memory : the place where all the objects are store at 

                    String pool : located in heap memory, stores all string literals' objects  
                    every time when we use new keyword, compiler will create a new object in java Heap memory 
                    */

		/* when the object is created by String literals, that will be stored in a special string pool,
		 * and if 2 different variable assigned for the same string it won't be created a new string in the pool. 
		 * it will be only assigned to the same word
		 
		 */
		String word = "serdar";
		String word2= "serdar";
		String  word3= new String("serdar");
		
		System.out.println(word == word2 );// instead of they are the same by the "new" keyword complier has created a new 
		System.out.println(word2 == word3);// String which is out of the pool
		

		
	    Scanner input = new Scanner(System.in);
	    String Newstr = input.nextLine();    						//"serdar"
		String Newstr2 = input.nextLine();   						//"serdar"
	    System.out.println(Newstr == Newstr2);  					// False 
	    System.out.println(Newstr == "serdar");  					// False
	    System.out.println(Newstr.charAt(0) == Newstr2.charAt(0));  //true
	    input.close();   /// Because of new str ' s stored on Heap memory it should be useful to closing input
		  
	/*
	2.  
	3. String is immutable 
	once you have been declared you can't modified it.
	
	
	*/
	
	
	}
		
	}
	
	

