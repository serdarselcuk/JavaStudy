package day65_mapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class warmUp {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19));
		
		for(Iterator<Integer> it = list.iterator();it.hasNext();) {
			int a = it.next();
			
			if(a % 2 == 0 ) {
				it.remove();
			}
		}System.out.println( list );
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
	
}
