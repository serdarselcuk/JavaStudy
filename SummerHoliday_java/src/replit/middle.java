package replit;

import java.util.Scanner;

public class middle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	   
	    if (word.length()>4 && word.length()%2 == 1)
	    	System.out.print(word.substring((word.length()-2)/2,(word.length()+1)/2));
	    else
	    	System.out.println("invalid");
	    
	  
}
}
