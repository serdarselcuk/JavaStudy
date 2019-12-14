package day06_ArithmaticOperators;

public class primitivesCasting {

	public static void main(String[] args) {
		
		/* casting : in java is converting the larger primitive to a smaller size
		 * 	 datatype variablename = (datatype)value ;
		 * primitives : byte, short, int , long, float and double
		 *	 castings / explicit & implicit 
		  		explicit casting is used for converting the larger to e smaller
		  		implicit casting is the opposite
		 */
		int a = 10; // if you gave 128 it will be change to  -128...
		byte b = (byte) a ; //explicit casting
		
		System.out.println(b);
	
		double DecimalNumber = 15.55 ;
		float FloatNumber = (float)DecimalNumber ;
		
		System.out.println(FloatNumber);
	
		long Longnum = 300L ;
		int intnum = (int)300;
		System.out.println(intnum);
		
		// implicit casting
		
		byte bytenum = 100;
		int intnum1 = bytenum; 
		
		float Floatnum = 500.68F;
		int myNumber = (short) Floatnum; //500
		
		double numdouble = 500.345 ;
		double num1 = (int) numdouble ;  // you can cast it in any type but whilw declaring it if the size is not suitable it will give 
		// compile error
		
		System.out.println(num1);
		
		/* LOCAL VARIABLE :
		 * The variable that is not initialized yet and declared in main method
		 * You can't use them without initializing
		 */
		char serdar;// couldn't use yet
		
		
		
	
	}
}
