package day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;


public class IteraableInterface {

	public static void main(String[] args) {
		
		
//ArrayList
		List<Integer>list = new ArrayList<>();
		list.addAll(Arrays.asList(1,1,1,2,4,5,6,6,7,1,1,1,2));
		list.remove(1);	// deletes only the first 1 so you should iteration
		System.out.println(list);//[1, 1, 2, 4, 5, 6, 6, 7, 1, 1, 1, 2]
		
		for (int i = 0; i < list.size(); i++) {
			Integer each = list.get(i);
			if (each == 1) list.remove(each);//after using remove method the size of list has been changes and so index numbers does so some faults occurs while iterating
			
		}
		System.out.println(list);//[2, 4, 5, 6, 6, 7, 1, 1, 2]
//Iterator
		List<Integer>list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1,2,3));
		Iterator<Integer>iter =list2.iterator();
		
		System.out.println(iter.hasNext());	//true
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());	//true
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());	//true
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());	//false
		
		Iterator<Integer>iter2 =list.iterator();
		
		while (iter2.hasNext()) {
			System.out.print(iter2.next());
		}//245667112
		System.out.println();
		System.out.println("==============================");
		for(Iterator <Integer> iter3 = list.iterator();iter3.hasNext();) {
			System.out.print(iter3.next());
		}//245667112
		
		System.out.println();
		System.out.println("==============================");
//HashSet
		Set<Integer>list4 = new HashSet<Integer>();
		list4.addAll(Arrays.asList(1,6,1,5,4,5,7,6,6,7,1,1,1,2));
		System.out.println(list4.hashCode());//25 - it is the sum of numbers
		for(Iterator <Integer> iter4 = list4.iterator();iter4.hasNext();) {
			System.out.print(iter4.next());
		}//124567 - ordered

			System.out.println();
			System.out.println("==============================");
			
//LinkedHashSet	
		Set<Integer>list5 = new LinkedHashSet<Integer>();
		list5.addAll(Arrays.asList(1,6,1,5,4,5,7,6,6,7,1,1,1,2));
		
		for(Iterator <Integer> iter5 = list5.iterator();iter5.hasNext();) {
			System.out.print(iter5.next());
		}//165472 - not ordered (ordered as it added)
		
		System.out.println();
		System.out.println("==============================");
		
//TreeSet
		SortedSet<Integer>list6 = new TreeSet<Integer>();
		list6.addAll(Arrays.asList(1,6,1,5,4,5,7,6,6,7,1,1,1,2));
		
		for(Iterator <Integer> iter6 = list6.iterator();iter6.hasNext();) {
			System.out.print(iter6.next());
		}//124567 - ordered
		Stack<Integer>list7 = new Stack<Integer>();
		//list7.addAll(Arrays.asList(1,6,1,5,4,5,7,6,6,7,1,1,1,2));
		System.out.println();
		System.out.println("==============================");
		for(int i =1; i<10; i++) {
			list7.add(i);
		}
		int num = list7.pop();
		System.out.println(num);
	}
}
