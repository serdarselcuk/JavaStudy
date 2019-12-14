package day42_OOP_Encapsulation;

public class Encapsulation {

// THIS CLASS IS USED WITH TestData class WHICH IS IN THE SAME PACKAGE
	
		public static void main(String[] args) {
			
			TestData obj = new TestData();
			
			System.out.println(obj.getName());		//	we call those method as GETtER
			System.out.println(obj.getId());
			
			obj.setName("Serdar");					// and it is setter
			obj.setId(167);
		
			System.out.println(obj.getName()+" <== name | id ==> "+obj.getId());
		
		}
}
