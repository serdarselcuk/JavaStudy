package day17_StringClass;

public class StringMethods_3 {
/*
*//* String methots :
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
			equals(str) 					==> checks if the two string equals or not . equal ==> true
			equalsIgnoreCase(str) 			==> checks two string without case sensitivity	
			contains(str) 					==> checks if the str is contained in the string or not and returns boolean
			startsWith(str)  				==> checks if the string starts with the str or not 
			endsWith(str)   				==> checks if the string is ended with given srt or not  
 */
	
	public static void main(String[] args) {
		String str1 = "Java is Funy programming language, Java is good";
		String str2 = str1.replace('a','i');
		str1 = str1.repla
		String str3 = str1.replace("Java","Python");
		String str4 = str1.replaceFirst("Java", "Python");
		System.out.println(str2); 	//Jivi is Funy progrimming linguige, Jivi is good
		System.out.println(str3);	//python is Funy programming language, Python is good
		System.out.println(str4);	//Python is Funy programming language, Java is good
	}
	
}
