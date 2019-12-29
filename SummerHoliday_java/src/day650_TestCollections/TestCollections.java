package day650_TestCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class TestCollections {
	public static void main(String[] args) {
		
	

	ArrayList<String>collections1= new ArrayList<>();
	collections1.add("Atlanta");
	collections1.add("New York");
	collections1.add("Dallas");
	collections1.add("Madison");
	System.out.println("collection1 cities : ");	
	System.out.println(collections1) ;							//[Atlanta, New York, Dallas, Madison]
	System.out.println("collection1 contains Dallas ? : ");
	System.out.println(collections1.contains("Dallas"));		//true
	System.out.println("remove dallas collection1 : ");
	System.out.println(collections1.remove("Dallas"));			//true
	System.out.println("collection1 cities : ");
	System.out.println(collections1);							//[Atlanta, New York, Madison]
	
	Collection<String>collections2=new ArrayList<>();
	collections2.add("Seattle");
	collections2.add("Portland");
	collections2.add("Los Angeles");
	collections2.add("Atlanta");
	
	System.out.println("collection2 cities : ");
	System.out.println(collections2) ;							//[Seattle, Portland, Los Angeles, Atlanta]
	

	ArrayList<String>c1= (ArrayList<String>) (collections1.clone());
	System.out.println(c1) ;									//[Atlanta, New York, Madison]
	c1.addAll(collections2);
	System.out.println(c1) ;									//[Atlanta, New York, Madison, Seattle, Portland, Los Angeles, Atlanta]
	
	c1= (ArrayList<String>) (collections1.clone());
	System.out.println(c1) ;									//[Atlanta, New York, Madison]
	c1.retainAll(collections2);
	System.out.println(c1) ;									//[Atlanta]			
	
	
	c1= (ArrayList<String>) (collections1.clone());
	System.out.println(c1) ;									//[Atlanta, New York, Madison]
	c1.removeAll(collections2);
	System.out.println(c1) ;									//[New York, Madison]
	
	
	}
}
