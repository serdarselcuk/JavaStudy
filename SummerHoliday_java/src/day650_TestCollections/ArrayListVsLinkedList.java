package day650_TestCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import day50_Abstractio.SouthKorea;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		
		ArrayList<String>arrayList=new ArrayList<String>();
//		int[] ar = {1,2,3,4,5};
//
//		Arrays.sort(ar);
//		Arrays.
		arrayList.add("serdar");
		arrayList.add("Elif");
		arrayList.add("ahmet");
		arrayList.add("ismail");
		arrayList.add("Ahmet");
		Collections.sort(arrayList);
		arrayList.addAll(arrayList);
		//Arrays.sort(arrayList);							not work... it needs int, byte, short, long, double...
		Collections.sort(arrayList);
		System.out.println(arrayList);						//[Ahmet, Ahmet, Elif, Elif, ahmet, ahmet, ismail, ismail, serdar, serdar]
		System.out.println(arrayList.remove("Elif"));		//true
		System.out.println(arrayList.contains("Ahmet"));	//true
		System.out.println(arrayList.containsAll(arrayList));//true
		arrayList.ensureCapacity(5);
		System.out.println(arrayList);						//[Ahmet, Ahmet, Elif, ahmet, ahmet, ismail, ismail, serdar, serdar]
		System.out.println(arrayList.equals(arrayList));		//false
		arrayList.forEach(System.out::print);				//AhmetAhmetElifahmetahmetismailismailserdarserdar
		arrayList.forEach(p->arrayList.set(arrayList.indexOf(p),p+="ss"));	
		arrayList.forEach(System.out::print);				//AhmetssAhmetssElifssahmetssahmetssismailssismailssserdarssserdarss

		System.out.println(arrayList.get(0));				//Ahmetss
		System.out.println(arrayList.getClass());			//class java.util.ArrayList
		System.out.println(arrayList.indexOf("serdar"));	//-1
		
		arrayList.clear();
		System.out.println(arrayList);						//[]
		arrayList.add("serdar");
		arrayList.add("Elif");
		arrayList.add("ahmet");
		arrayList.add("ismail");
		arrayList.add("Ahmet");
		
		System.out.println();
		System.out.println("============================================================================");
//		it is faster to remove or add in linkedlist
		List<String>linkedList=(List<String>) arrayList.clone();
		System.out.println(linkedList);		//[serdar, Elif, ahmet, ismail, Ahmet]
		arrayList.remove("ahmet");
		linkedList.retainAll(arrayList);
		System.out.println(linkedList);		//[serdar, Elif, ismail, Ahmet]
		linkedList.addAll(arrayList);
		System.out.println(linkedList);		//[serdar, Elif, ahmet, ismail, Ahmet, serdar, Elif, ahmet, ismail, Ahmet]
		linkedList.set(3,"kemal");
		System.out.println(linkedList.get(3));//kemal
		String serdar = "serdar";
		
		String sel = "sel";
		
		
	
	}
}













