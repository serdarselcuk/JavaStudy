	package replit;

	import java.util.Scanner;

	public class bread {
		public static void main(String[] args) {
		     Scanner scan = new Scanner(System.in);
		     String str = scan.next();
		     int first = 0;
		     int last = str.length()-1;
		     while(!str.substring(first,first+5).equalsIgnoreCase("bread")&&(first+5)<str.length()-4) {
		    	 first++;
		    	 
		    	 }
		     while(!str.substring(last-4,last+1).equalsIgnoreCase("bread")&&(last-4)>0) {
		    	 last--;
		    	 
		    	}
		     if (first+5 >= last-4) {
		    	 System.out.println("nothing");
		     }else {
		    	 System.out.println(str.substring(first+5, last-4));
		     }
		  }
		}