package replit;

public class Palindrolme {
	public static void main(String[] args) {
		
		String check = "serdar";
		
		System.out.println(check.equalsIgnoreCase(check));
		
	}public static boolean isPalindrome(String check) {
	    String check2="";  
	    for ( int i = 0; i < check.length(); i++){
	    	if(check.charAt(i) != ' '){  
	    		check2 +=""+check.charAt(i);
	        }
	      }
	    String result ="";
	    for ( int i = check.length()-1; i >= 0; i--){
	      if (check.charAt(i) != ' '){
	        result += ""+ check.charAt(i);
	      
	    }
	    }
	    return check2.equalsIgnoreCase(result);
	}
	}
