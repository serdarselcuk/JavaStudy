package day39_javaReview;

public class CellPhone {

		String brand;
		String model;
		String color;
		double screenSize;
		double price;
		
		public CellPhone() {
			 brand = "Apple";
			 price = 750;
			 color = "red";
			 screenSize = 5.8;
			 model = "Xs" ;
		}
		public CellPhone(String brand,	String model,	String color,	double screenSize,	double price) {
			 this.brand = brand;
			 this.price = price;
			 this.color = color;
			 this.screenSize = screenSize;
			 this.model = model ;
		}
		public void call(long phoneNumber) {
			System.out.println(brand+" "+model+" is calling "+phoneNumber);
		}
		
		public void SendMessage( long PhoneNumber) {
            System.out.println("Sending messages to "+PhoneNumber);
        }
        
        public void getInfo() {
            System.out.println(brand+" "+model+" "+color+" "+screenSize+" $"+price);
        }
		
}
