package day11_If_Else_review;

public class Warmup {

	
	public static void main(String[] args) {
		
		int month = 2 ;  //month num input
		int year = 2019 ;
		
		if (month >0 && month <13) {// testing the number for valid or not
			if (month == 2) {
				// print out if  it's febr
				if (year % 4  == 0)
					System.out.println("29 days"); // for the leap year for feb
				else 
					System.out.println("28 days"); // in the other years for feb
					
			}
			else if (month == 4 || month == 6|| month == 9|| month == 11 ) {
				System.out.println("30 days");// the short list of mount that takes 30 days
			}
			else {
				System.out.println("31 days");//all the others takes 31 days
			}
	 }
		else {
			System.out.println("invalid number");// if the input isn't valid execute that
	 }
	}
}
