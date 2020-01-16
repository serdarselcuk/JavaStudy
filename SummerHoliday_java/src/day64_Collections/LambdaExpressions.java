package day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;import day50_Abstractio.SouthKorea;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		Predicate<Integer>remove100 = p -> p == 100; 
		
		List<Integer>list = new ArrayList<>(Arrays.asList(100,100,100,100,100,100));
		
		list.removeIf(remove100);
		
		System.out.println(list);//		[]
		
		List<Integer>list1 = new ArrayList<>(Arrays.asList(100,10,500,200, 300,400));
	
		list1.removeIf(R -> R > 300);
		
		System.out.println(list1);
		
//	foreEach

		List<Integer>list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
				
		System.out.println("=====================================");
		
		list2.forEach( p-> { if ( p > 5 ) {System.out.print(p);} } );
		
		
		System.out.println();
		System.out.println("=====================================");
		
		list2.forEach( System.out::print);
		
		List<String> names= new ArrayList<String>();
		names.addAll(Arrays.asList("Ahmet", "serdar", "Ibrohim","madina","keml","mehmet"));
		
		Predicate<String> remvET = Suna -> Suna.endsWith("et");
		names.removeIf(remvET);
		System.out.println(names);//	[serdar, Ibrohim, madina, keml]

		List<String>ss = new ArrayList();
		ss.forEach(p-> {if(p.startsWith("s")){}}) ;
				
				
		
		
	}
	
}
