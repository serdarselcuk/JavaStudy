package replit;

public class email_2 {
	public static void main(String[] args) {
	String email = "serdar_selcuk@gmail.com";
	
	
	String First = email.substring(0,email.indexOf('_'));
    String Last = email.substring(email.indexOf('_')+1,email.indexOf('@'));
    String Domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));
    String Top_level = email.substring(email.indexOf('.')+1);
    
    System.out.print("First name: "+First.substring(0,1).toUpperCase()+First.substring(1)
                    +"\nLast name: "+Last.substring(0,1).toUpperCase()+Last.substring(1)
                    +"\nmain: "+Domain
                    +"\nTop-Level Domain: "+Top_level);
    
    
	}
}
