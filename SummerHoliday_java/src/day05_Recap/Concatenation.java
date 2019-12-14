package day05_Recap;

public class Concatenation {
	public static void main(String[] args) {
		
		/* 1 -String values should surrendered by double coute.
		 * Concatenation : combining linking things together / we can concat any value 
		 * 
		 */
		String myName = "Cybertek"+ "School" ;
		System.out.println(myName);
		String Year = "This is" + 2019 ;
		System.out.println(Year);
		
		int cucumber = 3;
		int tomato =5 ;
				
		System.out.println("cucumber is " + "$" + cucumber);
		
		String newStr = "100" + 10 ;
		
		System.out.println(newStr); //10010
		System.out.println("1"+2+3); //15
		//System.out.println("1" + 1-3);  // plus sign with string is means that concatenate them... because it have been concatinate "1" and 1
										// so "11" became a string. than -3 couldn't execute: 
		System.out.println(2-1+3+"4");// first 2-1 = 1, 1+3= 4 than 4+"4" =44: it starts from beginning
		
		System.out.println(1 + ("12"+1)); // 1121
		
		String bookName = "i like the book called /'Game of Thrones'";
		System.out.println(bookName);
		
		String myInfo = "My Name is : /n/tCybertek";
		System.out.println(myInfo);
		
		System.out.println('3'+3); //54 ('3' is not a string. it is a character  that symbolized yhe number of 51 on ASCII)
		System.out.println("3"+3);// 33
		System.out.println('3'+"3");//33
		System.out.println('7'+3);//55
		System.out.println('7'+ "3"); //"73" ( if you concatenate a chat whit num that will act as a representative num. but 
										// if you concatenate it with a string it will act as a char
		
		
		
		
		
		
		
		
		
		
	}
}
 