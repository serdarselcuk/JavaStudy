package day30_wrapperClass;

import java.util.ArrayList;

import java.util.Collections;

public class ArraylistClass {
/* 1. presented in "java.util" package
		import java.util.ArrayList; 

	2. Array list does not support primitives 

	3. In Array List we store objects only , all the values in Array list are objects (none primitives) 

	4. ArrayList' size is Automatically adjusted 

	5.ArrayList is ordered {does have index numbers) 
	
	Declaration of arrayList: 

		ArrayList<ClassType> variableName = new  ArrayList<>();
		ArrayList<classType> variableName = new  ArrayList<classType>();

 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new  ArrayList<>();	// first declaration style
		
		ArrayList<String> list2 = new ArrayList<String>();// second declaration style
/*
 	ArrayList methods :
 	
 	1. add method: adds values to arrayList in wrapper class
 		list.add( 10 );---> it is a auto-boxing also
 		
 	2. get method: gets the object which in the declared position
 		list.get(indexNum);----> 
 
 	3. size method: returns the length (total number of included objects
 		list.size();
 	4. clear method: clears the array, removes all the values from the array
 		list.clear();
 
 */
	ArrayList<Integer>list3 = new ArrayList<>();
	list3.add(10);
	list3.add(20);
	list3.add(40);
	
	System.out.println(list3);			//	[10, 20, 30]
	System.out.println(list3.get(1));	//	20
	System.out.println(list3.size());	//	3
	list3.clear();
	System.out.println(list3);			//	[]
	System.out.println(list3.size());	//	0
	

//	 sorting the arraylists	
	
	ArrayList<Integer>list0 = new ArrayList<>();
	for(int i = 20; i> 0 ;i-- ) {
		list0.add(i);
	}
	System.out.println(list0);//[20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
	Collections.sort(list0);
	System.out.println(list0);
	
	
	}
}
