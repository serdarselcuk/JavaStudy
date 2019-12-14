package day18_stringMethods;

public class ForLoop {
/*
 * for loop is used for repeated actions.
 	for (initialization ; condition ; iterator){
 			statement that we want to repeat
 	}
 	initialization = starting point
 		ex : int i = 0
 		
 	condition : is created based on the initialization
 		ex :  i < 10
 		
 	iterator : co-related to the condition. it makes some changes on initialization due to
 	 			related to condition
 	 			
 	 			ex : i++, ++i, i+=2
 */
	public static void main(String[] args) {
		
		String name = "serdar selcuk";
		for (int i = 0 ; i < 10 ; i++) {
			
			System.out.println("value of i is :"+i);
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0 ; i < name.length() ; i++) {
			
			System.out.println("value of i is :"+i+" - "+ name.charAt(i));
		System.out.println("------------------------------------------------------");
		
		
		for (int a = 1 ; a <= 10 ; ++a) {
			
			System.out.println(a*a);
		}	
			System.out.println("-----------------------");
	}
}
}
