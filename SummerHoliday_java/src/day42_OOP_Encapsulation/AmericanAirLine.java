package day42_OOP_Encapsulation;

public class AmericanAirLine {
	static  int total = 1;
	
	public AmericanAirLine() {
		total =2;
	}
	static {
		total =3;
		
	}
	static {
		total =4;
		
	}
	public AmericanAirLine(int total) {
		this();
		this.total += total;
	}
	{
		total= 5;
		System.out.println(" 5 ");
	}
	
	
	
	
		public static void main(String[] args) {
		AmericanAirLine obj = new AmericanAirLine();
			System.out.println(obj.total);
			
			
			
			
			
			
			
			
			
			
			/*	Employee obj = new Employee();
			
			obj.set("serdar");
			obj.set(15710875206l);
			obj.set((byte)38);
			obj.set(100.56);
			
			System.out.println(obj.getName());
			System.out.println(obj.getSsn());
			System.out.println(obj.getAge());
			System.out.println(obj.getSalary());
			
			*/
		}
	
}
