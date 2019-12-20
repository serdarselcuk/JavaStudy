package day65_mapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
public static void main(String[] args) {
	
//	HashMap
	
		Map<String, Double> map1 = new HashMap<>();
		
		//	put(key,value): 
		
		map1.put("serdar", 4d);
		map1.put("ismail", 6d);
		map1.put("elif", 5d);
		
		System.out.println(map1);	//{serdar=4.0, ismail=6.0, elif=5.0}
		//	get(key) = value
		System.out.println(map1.get("ismail"));// 6.0
		System.out.println(map1.get("ser")); // null
	
		// keySet();
		
		Set<String> set = map1.keySet();//	[serdar, ismail, elif]
		System.out.println(set);
		
		//	remove(key, value)
		map1.remove("elif");
		map1.remove("ismail", 6d);
		System.out.println(map1); // {serdar=4.0}
		
		//	containsKey()
		
		System.out.println(map1.containsKey("serdar"));//	true
		
	
		//clear();
		
		map1.clear();
		System.out.println(map1);
		
//	LinkedHashMap();
		
		Map<String, Integer> map3 = new LinkedHashMap<>();
		
		map3.put("A", 100);
		map3.put("B", 10);
		map3.put("C", 1);
		map3.put("D", 4);
		map3.put("A", 50);
		
		System.out.println(map3);//	{A=50, B=10, C=1, D=4}
		
//		*** MAP DOES NOT ACCEPT DUPLICATED KEYBUT FOR KEYS IT IS ACCEPTEBLE
		
		Map<Integer, String> map2 = new Hashtable<>();
		
//		key and value can not be null
//		map2.compute(null, null);//		Exception in thread "main" java.lang.NullPointerException
		
//		syncronized
//		so that performance is slower but Thread-safe
		
//	TreeMap : implements SortedMap
		
		TreeMap<String, Integer>map4 = new TreeMap<String, Integer>();
		map4.put("Z", 1000);
		map4.put("Y", 9000);
		map4.put("H", 25);
		System.out.println(map4);
		
		
		
		
		
		
		
		
		
	}
}
