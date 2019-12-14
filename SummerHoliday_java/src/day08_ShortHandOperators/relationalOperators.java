package day08_ShortHandOperators;

public class relationalOperators {

	 /**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 /*
		  * >   :  greater than
		  * >=  :  greater than or equal
		  * <   :  less than
		  * <=  :  less than or equal
		  * ==  :  equal
		  * =   :  assign
		  * !=  :  not equal
		  * !   :  not
		  */
		 
		boolean a = 10>9 ;
		System.out.println(a); //true
		
		boolean b = 10 == 9 ;
		System.out.println(b); // false
		
		boolean c = 10>= 9 ;
		System.out.println(c);// true
		
		boolean d = true ;
		System.out.println(!d);//false
		
		boolean e = "b12" == "b13";
		System.out.println(e);
		
		
		boolean f = 'e'=='E'+32 ;
		 System.out.println(f);
		 
	 
	 
	 
	 }
}
