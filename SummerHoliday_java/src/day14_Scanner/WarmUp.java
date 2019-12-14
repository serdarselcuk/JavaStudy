package day14_Scanner;


public class WarmUp {

	
	public static void main(String[] args) {
		String Days = "Sunday";
			if (Days == "Sunday" ||Days == "Monday" ||Days == "Tuesday" ||Days == "Wednesday" ||Days == "Thursday"||Days == "Friday"||"Saturday") {
				
				switch (Days) {
				case "Monday" :	
				case "Tuesday":
					System.out.println("Java class");
					break;
				case "Wednesday" :
				case "Saturday" :	
					System.out.println("SQL");
					break;
				case "Thursday" :
				case "Friday" :
					System.out.println("Selenium");
					break;
					
				default :
					System.out.println("day off");
				}			
		}else {
			System.out.println("you sure?");
		}
			
	}
}
