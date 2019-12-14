package day33_Constructors;

import java.util.ArrayList;

public class ArrayListmethods {
	/*ArrayList methods :
			
			add(object,index) 	: it is an overloaded method. you can add the object with the index number if you want
		
			get(index number)	: returns the data at the index 
					
			size()				: returns the length of the ArrayList
			
			clear 				: clear the ArrayList 
			
			set()				: change the specific index number
			
			contains(object) : returns boolean (true/false)
 	 		
 	 		equals(ArrayList) = checks if the two array list are equals or not, returns true/false as boolean
 	 		
 	 		remove(index): removes the object in the given array
 	 			remove(int): int is used for the index number
 	 			remove(Integer): removes the first matching object, it returns you the  boolean
 	 		
 	 		indexOf() :  returns the index of the given object from the array(IF RETURNS NEGATIVE NUMBER SO THE GIVEN OBJECT DOES NOT EXSIST)
 	 		lastIndexOf() : returns the last index of the object
 	 			
 	 		isEmpty(): checks if arrayLIst is empty and turns true or false
 	 			
	*/
	public static void main(String[] args) {
		ArrayList<Integer>arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		System.out.println(arr);			//[1, 2, 3, 4, 5, 6]
		System.out.println(arr.indexOf(4));	  //        3
		
// lastIndexOf : 
		arr.add(5);
		System.out.println(arr);			//[1, 2, 3, 4, 5, 6, 5]
		System.out.println(arr.lastIndexOf(5));//				 6
		
		
	}
}
