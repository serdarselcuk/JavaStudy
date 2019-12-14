package day37_classAndObjects;

public class CarObjects {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car1 = new Car("BMW")
		car            car1   =  new 	     car();// as a default constructor we called "car" in the car class
	//className		obj. Name	keyword	  constructor
		
		car1.Brand = "BMW" ;// YOU CAN SEE TYPE BY pushing shift and moving on the "brand"(for win use ctrl)
		car1.Color = "yellow";
		car1.Mileage = 123333;
		car1.Model = "X6" ;
		car1.Price = 30500.5;
		car1.Year = 2019 ;
		System.out.println(car1.Brand);		//BMW
		System.out.println(car1.Color);		//yellow
		System.out.println(car1.Mileage);	//123333
		System.out.println(car1.Model);		//X6
		System.out.println(car1.Price);		//30500.5
		System.out.println(car1.Year);		//2019
		
		System.out.println("======================================");
		car car2 = new car();
		
		car2.Brand = "Porshe";
		car2.Color = "red" ;
		car2.Mileage = 50000 ;
		car2.Model = "Carrera";
		car2.Price = 35055.43;
		car2.Year = 2015;
		
		System.out.println(car2.Brand);		//porshe
		System.out.println(car2.Color);		//red
		System.out.println(car2.Mileage);	//50000
		System.out.println(car2.Model);		//carrera
		System.out.println(car2.Price);		//35055.43
		System.out.println(car2.Year);		//2015
		
		car1.drive();//driving BMW
		car2.drive();//driving Porshe
		
		car1.start();//X6 is stating
		car2.start();//carrera is stating
		
		car1.info();//2019 BMW X6, yellow, $30500.5 ,123333 mile
		car2.info();//2015 Porshe carrera, red, $35055.43 ,50000 mile
		
		
		
	}
}
