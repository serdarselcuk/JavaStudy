package replit;

import java.util.ArrayList;
import java.util.Scanner;

public class num_estimationGame {
	
  public static void main(String[] args) {
	  
    Scanner inp = new Scanner(System.in);
   
    int num = inp.nextInt();
    int estimat = 0;
    
    while(num != estimat){
    	
    	estimat = inp.nextInt();
    	
	    ArrayList <Integer> est_arr = spliting(estimat);
	    ArrayList <Integer>	num_arr = spliting(num);
	    
    	int count_pos = 0;
    	int count_neg = 0;
    	
    	for( int i =0;i< est_arr.size(); i++) {
    		
    		if(est_arr.get(i) == num_arr.get(i)){
    			count_pos +=1;
    			
    		}else if (num_arr.contains(est_arr.get(i))) {
    			count_neg +=1 ;
    			
    			System.out.println(num_arr.contains(est_arr.get(i))+" estimation array: "
    			+ est_arr +" num array: "+num_arr);
    			
    		}else
    			continue;
    	}System.out.println(count_pos + " "+ count_neg);
    }
  }

  
  
public static ArrayList<Integer> spliting(int estimat){
	
	ArrayList<Integer> arr = new ArrayList<>();
	
	for (int i = 1000 ; i > 0 ; i /= 10) {
		// 
		arr.add(((estimat - (estimat % i)) / i));	// to holding the first number
		estimat = estimat % i;		// turns the last 3 number of estimation
		 
		}return arr;
}
}