package day652_genericMethod;

import java.util.ArrayList;

public class GenericMethod {


public <E extends Comparable<E>> Boolean  isSorted(ArrayList<E>list){ 


	//this geeneric method an accept any kind object and also it can compare strings 
	
	
	E before = list.get(0);    // take first element 
	
	for (E each : list) { 
		
		if (each.compareTo(before)<0) { //if comparison is under 0 it means each is smaller 
			
			return false; // then return false 
			} 
		
		before = each; 
		} 
	
	return true; // otherwise true 

}
} 