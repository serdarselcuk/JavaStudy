package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class printSortedWords {

		public static void main(String[] args) {
			
		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    String[] array = str.split(",");
		    ArrayList<String> result = new ArrayList<>();
		    int i= 0 ;
		    int num = Integer.MAX_VALUE;
		    for(String each:array){
		      array[i] = each.trim();
		      
		      // System.out.println("loop: "+ i + " each: "+ each+ " after trim: " +array[i]);
		     
		      if(array[i].length() < num){
		        result.clear();;
		        result.add(array[i]);
		        num = array[i].length();
		      }else if(array[i].length() == num){
		        result.add(array[i]);
		      }
		       i++;
		    }
		    Collections.sort(result);
		    System.out.println(result);
		  }
		}
	
