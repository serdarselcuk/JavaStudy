package nobet_prog;

import java.util.ArrayList;

public class personel {
	
	static int i = 0;
	
	int personel_id;
	String name ;
	String position ;
	ArrayList<Integer> ignoreDays  ;
	boolean block  ;
	boolean daybuday  ;
	
public personel(String n) {
	
	this(i);
	if (name == null) {
		name = n;
		i++;		
	}else{
		position = n;
	}
}
public personel(int i) {
	personel_id = i;
	
}

public static void main(String[] args) {
	personel obj = new personel("serdar");
	System.out.println(obj.personel_id);
	personel obj1 = new personel("serdar");
	System.out.println(obj1.personel_id);
}
}
