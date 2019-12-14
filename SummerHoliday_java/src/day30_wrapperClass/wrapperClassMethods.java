package day30_wrapperClass;

public class wrapperClassMethods {
	public static void main(String[] args) {
		
		int minimum = Integer.MIN_VALUE;//-2147483648

		System.out.println(minimum);
		
		int maximum = Integer.MAX_VALUE;//2147483647
		System.out.println(maximum);
		
		byte minimumbyte = Byte.MAX_VALUE;	//127
		byte maximumbyte = Byte.MIN_VALUE;	//-128
		
		System.out.println(minimumbyte+"\n"+maximumbyte);
		
		long maxilong = Long.MAX_VALUE;	//9223372036854775807
		long minilong = Long.MIN_VALUE; //-9223372036854775808

		
		System.out.println(minilong+"\n"+maxilong);
		
		double maxidouble = Double.MAX_VALUE;	//1.7976931348623157E308

		double minidouble = Double.MIN_VALUE;	//4.9E-324

		
		System.out.println(minidouble+"\n"+maxidouble);

		short maxishort= Short.MAX_VALUE;		//-32768
		short minishort  = Short.MIN_VALUE;		//32767
		
		System.out.println(minishort+"\n"+maxishort);
		
		/*
		 WrapperClass.MAX_VALUE;
		 WrapperClass,MIN_VALUE; 
		  	gives the max or min values as primitive data
		 
		 parse methods takes the string returns us primitive some values . 
		  example : parseInt("123");
		 
		 values
		 ValueOf methods: Converts String to wrapper class values
		 
		 
		 */
		Byte.parseByte("123");
		Short.parseShort("2");
		Integer example = Integer.parseInt("123");// it is auto boxing because parse method returns data as primitive
		Long.parseLong("3");
		double example1 = Double.parseDouble("124");// it's not a boxing 
		Float.parseFloat("098");
		boolean exemple2 = Boolean.parseBoolean("TRUE"); //		this method ignores the case sensitivty
		
		System.out.println(example+1);			//124
		System.out.println(example1+1);			//125.0
		System.out.println(exemple2);			//true
		
		boolean ex = Boolean.parseBoolean("9 > 5");
		
		System.out.println(ex);		//false because "9>5" is only a text...
		
//		you can not assign different type of primitive to a wrapper class
		
		Integer a = 10;
//		Double c = a; compile error !!!
		
		Double c = (double)a;// it can be acceptable 
//		wrapper classes are only dedicated to their own type
		
//		THE ValueOf methods:
		
		Integer value = Integer.valueOf("123");// its not a boxing valueOf method is returns in wrapper class
		System.out.println(value+1); // 124
		
		int intr = value; // un-boxing		because we are assigning the wrapper class to a primitive data type
		
		
		
		
		
		
		
		
		
		
	}
}
