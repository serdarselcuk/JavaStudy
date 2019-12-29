package day651_compare_Comparator;

public class Compareable{
//	String, Date, Calendar, all WrapperClasses, BigDecimal, BigInteger classes are already implemented the 
//	Comparable interface so you can compare them by using compare() method
	
	public static void main(String[] args) {
		System.out.println("Serdar".compareTo("serda"));//	-32
		System.out.println("a".compareTo("b"));//			-1
		System.out.println((Integer)1>(Integer)0);//		true
		Integer a = 10;
		Integer b = 20;
		Object c = 30;
		System.out.println(a.compareTo(b));//				-1
		
		System.out.println(a instanceof Comparable);		// true
		
//		System.out.println(a.compareTo(c));
//		it is not possible to compare different objects that are
//		belongs to different classes and so have different specialties
			
	}
	
	
}

