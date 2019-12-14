package day32_ArrayList;

import java.util.ArrayList;

import replit.equalsPythonJava;
import replit.shoppingList_1;

public class ArrayListClass {
/*
 	ArrayList : presented in "java.util"
 				does not support primitives, we can only store objects
 				- ArrayList's size is dynamic, adjusted automaticaly
 				- ArrayList supports only non-primitives
 				- ArrayList is an ordered collection of values (index number). we can 
 				
 	Declaration of ArrayList:
 				ArrayList<NonPrimitive> variableName = new ArrayList<NonPrimitive>();
 				ArrayList<NonPrimitive> variableName = new ArrayList<>(); (PREFERED)
 				
 	ArrayList methods :
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
 	 			
 	Declaration of arrays : 
 				primitive/non-primitive type[] variableName = new Type[number of contained];

 	Arrays vs ArrayLists:
 				- ArrayList' size is dynamic, array size is fixed
 				- ArrayList supports only non-primitives, we can assign
 				- Arrays can be multi-dimensional but ArrayList can not...
 			
 
 
 */
	public static void main(String[] args) {
		
// variableName.add() method:
		ArrayList<String>shoping_list = new ArrayList<String>();
		
		shoping_list.add("apple");
		shoping_list.add("orange");
		System.out.println(shoping_list);	//[apple, orange]
		shoping_list.add(1, "strawberry");	
		System.out.println(shoping_list);	//[apple, strawberry, orange]
		shoping_list.add(3,"watermelon");
		System.out.println(shoping_list);	//[apple, strawberry, orange, watermelon]  SIZE : ENLARGED TO 4 AUTOMATICALY
		//shoping_list.add(5,"not yet");		
		System.out.println(shoping_list);	//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
		
// variableName.get(index number) method : returns the data at the index 
		
		String name = shoping_list.get(1)	;	// no boxing here!   String <==> String
		System.out.println(name);		// strawberry
		
// variableName.size() method : turns the length of the ArrayList
		
		System.out.println(shoping_list.size());	// 4
// variableName,clear(); method :	removes all the objects from the array list
		
		shoping_list.clear();
		System.out.println(shoping_list);	//[]
		
// set(index, object)	: changes the object with the given one on the given index
		
		ArrayList<String>Javanger= new ArrayList<>();
		Javanger.add("serdar");
		Javanger.add("muhtar");
		Javanger.add("oguz");
		Javanger.set(1, "davut");
		System.out.println(Javanger);		//[serdar, davut, oguz]
		
		
// remove(index): removes the object in the given array
		
		Javanger.remove(1);
		System.out.println(Javanger);		//[serdar, oguz]
		
		ArrayList<Integer> lists = new ArrayList<Integer>();
		lists.add(1);	// auto-boxing	index : 0
		lists.add(2);	// auto-boxing	index : 1
		lists.add(3);	// auto-boxing	index : 2
		lists.add(4);	// auto-boxing	index : 3
		lists.add(5);	// auto-boxing	index : 4
		// remove(int): int is used for the index number
		System.out.println(lists);		//		[1, 2, 3, 4, 5]
		lists.remove(1);
		System.out.println(lists);		//		[1, 3, 4, 5]
		lists.remove(2);
		System.out.println(lists);		//		[1, 3, 5]
		// remove(Integer): removes the first matching object, it returns you the  boolean
		ArrayList<Integer> listss = new ArrayList<Integer>();
		
		listss.add(1);	// auto-boxing	index : 0
		listss.add(2);	// auto-boxing	index : 1
		listss.add(3);	// auto-boxing	index : 2
		listss.add(4);	// auto-boxing	index : 3
		listss.add(5);	// auto-boxing	index : 4
		
		Integer a = 1;
		listss.remove(a);
		System.out.println(listss);					//[2, 3, 4, 5]
		Integer b = 3;
		boolean rem = listss.remove(b);				//you can assign it to a boolean also
		System.out.println(rem + " " +listss);		//true [2, 4, 5]
		
		listss.add(1);								// 	[2, 4, 5, 1]	I added the one again		
		if(listss.remove(a)) {						//   true...and removes the "1"
			listss.remove(2);						// removes the 2. index
		}
		System.out.println(listss);					//	[2, 4]
		
		listss.add(1);	// auto-boxing	index : 0
		listss.add(2);	// auto-boxing	index : 1
		listss.add(3);	// auto-boxing	index : 2
		listss.add(4);	// auto-boxing	index : 3
		listss.add(5);	// auto-boxing	index : 4
		System.out.println(listss);		//[2, 4, 1, 2, 3, 4, 5]
		
		listss.remove(Integer.parseInt("3"));	//because parse method returns primitive remove method will deletes the index
		System.out.println(listss);				//[2, 4, 1, 3, 4, 5]
		
		listss.remove(Integer.valueOf("4"));	// valueOf method returns wrapperClass so removes the first "4". 
		System.out.println(listss);				//[2, 1, 3, 4, 5]
		
		
// variableName.contains(object) : returns boolean (true/false)
		
		boolean oguz = Javanger.contains("oguz");
		System.out.println(oguz);			//true
	
// variableName.equals(ArrayList) = checks if the two array list are equals or not, returns true/false as boolean
		
		boolean equality = shoping_list.equals(Javanger);
		System.out.println(equality);		//false
		
		
		
		
		
	}
}
