package day54_Polymorphisim;

public class Jungle {

		public static void main(String[] args) {
			Zoo animal = new Tiger();
			animal.move();
			Alive animal2 = new Tiger();
			animal2.move();
			Tiger cat = new Cat();
			cat.move();// if the method has over rided so it executes that else it executes from parent
			
		}
}
