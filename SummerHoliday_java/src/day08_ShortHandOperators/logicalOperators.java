package day08_ShortHandOperators;

public class logicalOperators {

	
	public static void main(String[] args) {
		
		/* 
		 &&  : And logic ==>    1 && 0 == 0
		 						1 && 1 == 1
		 						0 && 0 == 0
		 
		 
		 
		 ||  : Or  logic ==>    1 || 0 == 1
		 						1 || 1 == 1
		 						0 || 0 == 0
		 
		 
		 
		 
		 */
					
					boolean a = (true && false) == false, b = (true && true )== true, c = (false && false) == false;
					
					System.out.println(a+" "+b+" "+c);
					
					
					boolean e = (true || false) == true, f = (true || true) == true, g = (false || false) == false;
					
					System.out.println(e+" "+f+" "+g);
					
				
					
	
	
	}
}
