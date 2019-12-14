package day28_review;

public class warmUp_1 {

		public static void main(String[] args) {
			
			converter(3, "Km");
			
		}private static void converter(double value, String variable) {
			variable = variable.toLowerCase();
			switch(variable) {
				case ("galon"):
					System.out.println(value*3.75+" L");
					break;
				case ("km"):
					System.out.println(value*0.612+" miles");
					break;
		}

		}
}
