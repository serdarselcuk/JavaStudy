package day17_StringClass;

public class StringMethods_2 {

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
	                    when the String object is created by using "new" keyword: the object 
	                    will be saved at java heap memory (not within the String pool) 

	                    heap memory : the place where all the objects are store at 

	                    String pool : located in heap memory, stores all string literals' objects  
	                    every time when we use new keyword, compiler will create a new object in java Heap memory 
	                    */

			/* when the object is created by String literals, that will be stored in a special string pool,
			 * and if 2 different variable assigned for the same string it won't be created a new string in the pool. 
			 * it will be only assigned to the same word
			 
			 */
	/*
	2.  
	3. String is immutable 
	once you have been declared you can't modified it.
	
	
	*//* String methots :
 * 			charAt(index num)			 ==> it find the chan in the strung that you assigned the position 
 *			lenght()        			 ==> it returns the total number of characters as an integer value
 * 			indexOf(char)   			 ==> it turns the first index of the char in the string
 * 			concat(string)  			 ==> it takes the string and concatenate it the string that you written between the parentheses
 * 			toUpperCase()  				 ==> it creates a new string written by all upper case
 * 			toLowerCAse()   			 ==> it creates a new string written by all lower case
			trim()						 ==> it removes the unused spaces
	 	**	substring(beginning,end)     ==> sub value of string. returns as a new string value 
									  			starting from the index till ending index but ending index excluded
			replace(old char,new char)	 ==> replaces all the old char with new char						  
	
	
*/
	String name = "  ser    dar   sel    ";
				   0123456789012345678901
	System.out.println(name.trim());
	System.out.println(name.toUpperCase().trim());
	System.out.println(name.substring(1,18));
	System.out.println(name.substring(2,18).trim());
	
}	
}	
	

