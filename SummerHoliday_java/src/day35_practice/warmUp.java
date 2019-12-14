package day35_practice;

import java.util.ArrayList;

public class warmUp {
	
	

	public static void main(String[] args) {
		int []arr = {1,2,3,3,4,4,5,5};
		System.out.println(removeDub(arr));
		}
	public static ArrayList<Integer> removeDub(int[] arr){
		
		ArrayList<Integer>Array = new ArrayList<>();		// removes duplicates from int array
		
		for (Integer each : arr) {		//auto-boxing
			if(!Array.contains(each)){
				Array.add(each);
				
			}
		}return Array; 
	}
	public static ArrayList<Integer> removeDup(ArrayList<Integer> theArrayList){
		
		ArrayList<Integer>Array = new ArrayList<>();		// removes duplicates from an ArrayList
		
		for (Integer each : theArrayList) {		//auto-boxing
			if(!Array.contains(each)){
				Array.add(each);
		
		}
			}
		return Array;
	}
public static ArrayList<String> removeDup2(ArrayList<String> theArrayList){
		
		ArrayList<String>Array = new ArrayList<>();		// removes duplicates from an ArrayList
		
		for (String each : theArrayList) {		//auto-boxing
			if(!Array.contains(each)){
				Array.add(each);
		
		}
			}
		return Array;
}
}
