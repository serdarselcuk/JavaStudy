package day30_wrapperClass;

public class WrapperClass {
/*All wrapper class presented in "java.lang" package 

String class is also presented in "java.lang" package 

All classes in "java.lang" are imported by default 
 
 PRIMITIVES									WRAPPERCLASS
 
 	byte										Byte
 	short		   AUTOBOXING					Short
 	int			>================>				Integer
 	long										Long
 	float		<================<				Float
 	double			UNBOXING					Double
 	boolean										Boolean
 	char										Character
  
  =================================================
  
  	default value:
  		byte, short, int, long ==============>	0
  		float, double	=====================>	0.0
  		boolean			=====================>	false
  		char			=====================>	' '
  		
  	default values in wrapper class:	null
  	if we do not give any object to class (reference) null will be given as default
  		
  		
  		
 */
	public static void main(String[] args) {
		int numInt = 10;			// primitive
		Integer numInteger = 10;	// Wrapper class
		
		double numdouble = 23.3;   //primitive
		Double numDouble = 23.3;	// wrapper class
		
		numdouble = numDouble;  // you can assign it to other and there is AUTO-BOXING (assigning automatically)
		
		long longnum = 20;
		Long Longnum = longnum;		// autoboxing between primitive from wrapperclass
		
		System.out.println(Longnum);	//20
		
		Boolean Booleanvalue = false;
		boolean booleanvalue = Booleanvalue;	// and if you assigning wrapper to primitive dtype of class it is UNBOXING

		Long num = (long)numInt;
		
		
		
		
		
	}
}
