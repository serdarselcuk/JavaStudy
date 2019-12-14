package replit;

import java.util.Arrays;
import java.util.Scanner;

public class printSortedWaors_A {


			public static void main(String[] args) {
				
			    Scanner scan = new Scanner(System.in);
			    String str = scan.nextLine();
			    String[] array = str.split(",");
			    String[] result = new String[array.length];
			    result[0] = array [0];
			    
			    for(int i= 1 ;i < array.length; i++){
			      array[i] = array[i].trim();
			      
			      
			      // System.out.println("loop: "+ i + " each: "+ each+ " after trim: " +array[i]);
			     
			      if(array[i].length() < result[0].length()){
			        for (int clr = 0; clr < result.length; clr++) {
			        	result[i] = "";
			        }
			    	result[0] = array[i];
			    	  
			        }else if(array[i].length() == result[0].length()){
			        result[i] = array[i];
			      }
			       
			    }
			    System.out.println(Arrays.toString(result));
			    int count = 0;
			    for(String each : result) {
			    	if( each != null && !(each.isBlank())) {
			    		count++;
			    		System.out.println("each : "+each+ " count: "+count);
			    	}
			    }String[] result_last =new String[count];
			    count = 0;
			    for(String each : result) {
			    	if( each != null && !(each.isBlank())) {
			    		result_last[count] = each;
			    		count++;
			    	}}
			    Arrays.sort(result_last);
			    
			    System.out.println(Arrays.toString(result_last));
			  }
			}
		
