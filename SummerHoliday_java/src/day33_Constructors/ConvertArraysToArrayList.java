package day33_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArraysToArrayList {
/* You can only convert the object arrays.... to convert the arrays that are includes primitives you should use some loops... 
 * 
 * Arrays.asList()	: 
 * addAll(interface):
 * removeAll(interface) : removes aa the matching objects
 *  sorting the arrayList
			to sort the Array ==> Arrays.sort(variableName);
			but for ArrayList ===> collections class is presented in "java.util" package
			
 */
		public static void main(String[] args) {
			
// Arrays.asList()	: 			
			Integer[] arr = {1,2,3,4,5,6,7};
			
			ArrayList<Integer> list = new ArrayList<>( Arrays.asList(arr) );
			
			list.add(10);
			System.out.println(list);
			
			String[] arr2 = {"serdar", "selcuk", "sencer", "Elif"};
			
			ArrayList<String>list2 = new ArrayList<>(Arrays.asList(arr2));
			
			System.out.println(list2 +"   ====   "+Arrays.asList(arr2));
// addAll(interface):
			Integer[] arr3 = {1,2,3,4,5,6,7};
			
			ArrayList<Integer>list3 = new ArrayList<>();
			list3.addAll(Arrays.asList(arr3));
			
// removeAll(interface) : removes aa the matching objects
			ArrayList<Integer>numbers = new ArrayList<>();
			numbers.addAll(Arrays.asList(1,2,1,1,2,2,2,33,3,3,4,4,4));
			numbers.removeAll(Arrays.asList(1,3));
			System.out.println(numbers);		//[2, 2, 2, 2, 33, 4, 4, 4]
			
			// remove() method not designed to be used for in loop	???
			
			for (int i = 2; i<5; i+=2) {
				numbers.remove(i);
			}
			System.out.println(numbers);
			
	// sorting the arrayList
//			to sort the Array ==> Arrays.parallelSort(variableName);
//			but for ArrayList ===> collections class is presented in "java.util" package
			
//													collections class
//													collection class
			ArrayList<Integer>array = new ArrayList<>(Arrays.asList(1000,900,80,765,123,543));
			System.out.println(array);		//[1000, 900, 80, 765, 123, 543]
			
			Collections.sort(array);
			System.out.println(array);		//[80, 123, 543, 765, 900, 1000]
			
			
			
		}
}
