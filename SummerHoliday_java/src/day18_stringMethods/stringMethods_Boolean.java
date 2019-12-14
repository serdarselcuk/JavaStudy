package day18_stringMethods;

public class stringMethods_Boolean {
	public static void main(String[] args) {
		
	// isEmpty() ; Checks if the string is empty turns boolean expression // empty == true
		
		String str = " ";
		String str2 = "";
		boolean R1 = str2.isEmpty();
		boolean R2 = str2.isBlank();
		System.out.println(R1 +"/"+ R2); // for str == false/true
										 // for str2== true/true
	// equals(str) ; checks if the two string equals or not . equal ==> true
		
		boolean R3 = str.equals(str2);
		System.out.println(R3);  // false
		String str3 = "cybertek";
		String str4 = new String("cybertek");
		System.out.println(str3.equals(str4));  // true because it looks for the values of string
		
	// equalsIgnoreCase(str) ==> checks two string without case sensitivity
		
		String str5 = "CYBERTEK";
		String str6 = "cybertek";
		System.out.println(str5.equalsIgnoreCase(str6)); /// true
		
	// contains(str) ==> checks if the str is contained in the string or not and returns boolean
		
		System.out.println(str5.contains("BER"));// true
		
	// startsWith(str)  ==> checks if the string starts with the str or not
		
		System.out.println(str6.startsWith("cy")); // true
		
	// endsWith(str)   ==> checks if the string is ended with given srt or not
		System.out.println(str6.endsWith("te"));// false
		
		
		
		/* String methots :
			charAt(index num)			 	==> it find the chan in the strung that you assigned the 
												position 
			lenght()        			 	==> it returns the total number of characters as an integer 
												value
			concat(string)  			 	==> it takes the string and concatenate it the string that you 
												written between the parentheses
			toUpperCase()  				 	==> it creates a new string written by all upper case
			toLowerCAse()   			 	==> it creates a new string written by all lower case
		trim()						 	==> it removes the unused spaces
 	**	substring(beginning,end)     	==> sub value of string. returns as a new string value starting
 	*										from the index till ending index but ending index excluded
		replace(old char,new char)	 	==> replaces all the old char with new char						  
			   (old str , new str)
		replaceFirst(old str , new str) ==> it will only replace the first index
		indexOf(char)   			 	==> it turns the first index of the char in the string
		lastIndexOf(char)				==> it turns the first index of the char in the string
		isEmpty() 						==> Checks if the string is empty turns boolean expression
		isBlank()						==> cheks if the string is blank
		equals(str) 					==> checks if the two string equals or not . equal ==> true
		equalsIgnoreCase(str) 			==> checks two string without case sensitivity	
		contains(str) 					==> checks if the str is contained in the string or not and returns boolean
		startsWith(str)  				==> checks if the string starts with the str or not 
		endsWith(str)   				==> checks if the string is ended with given srt or not
		*/
		
		
		
		
		
		
		
	}
}
