package replit;
import java.util.Scanner;

public class printletters {

	  public static void main(String[] args) {
		  
	    Scanner scan = new Scanner(System.in);
	    
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    
	    String result = "";
	    
	    for (int i = start; i<= end; i++){
	      result += (char)i;
	    }
	    System.out.println(result);
	  }
}