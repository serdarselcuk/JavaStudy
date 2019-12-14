package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class EstimationClass {
	
	ArrayList<Integer> possibleNums = new ArrayList<>();
	Integer myguess ;
	
	public EstimationClass(){	// default class calls generator and takes the numbers to the possibleNumbers arrayList
		
		generator();
		this.myguess = this.possibleNums.get(0);
	}
	
	
	private void generator(){	// generates   the numbers when the game starts
		
		for ( int i = 1000; i <= 9999; i++) {
   			
			if (estimation(i)){	
				this.possibleNums.add(i);
			}
		}
	}
	
	
	private boolean estimation(int number) {		// to understand if the integer includes repeating numbers
		
		boolean result = true;
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 1000 ; i > 0 ; i /= 10) {	// 
					
			if (arr.contains((number - (number % i))/i)){
						//System.out.println(" array contains the num: "+ arr.contains((number - (number % i)/i))+ "array: "+ arr);
				return false;
			} else {
					arr.add(((number - (number % i)) / i));
			}
			number = number % i;
			}
				
		return result;
	}
	
	
	public boolean gameOver() {					//when game over it turnes true
		
		if (this.possibleNums.size() == 1) {
			return true;
		}
		System.out.println( "elemanlar :" + possibleNums);
		return false;
	}
	
	
	public boolean updatePossibilities (int pos, int neg) {
		
		for (int i = possibleNums.size()-1; i >= 0; i--) {
			if ((controlNums(possibleNums.get(i)) != pos*10 + neg)) {				
				
				//System.out.println("I removed "+ possibleNums.get(i)+ "because num control is "+controlNums(possibleNums.get(i))+"you gave: "+(pos*10 + neg) );
				possibleNums.remove(i);// makes pos. and neg. integers like one num.
			}
		}
		if(possibleNums.size()== 0 ) {
			return false;
		}
		this.myguess = this.possibleNums.get(0);
		return true;
	}
	
	
	public int controlNums(int num) {//
		
		String[] arr_cont = Integer.toString(num).split("");
		String[] arr_myGuess = Integer.toString(this.myguess).split("");
//		System.out.println(Arrays.toString(arr_cont));
		int count_pos = 0;
    	int count_neg = 0;
		
    	for( int i = 0; i < arr_cont.length; i++) {
    		if(arr_cont[i].equals(arr_myGuess[i])){
    			count_pos +=1;
    			
    		} else if (Integer.toString(this.myguess).contains(arr_cont[i])) {
    			count_neg +=1 ;    	
    		} 
		
		}
    	//System.out.println(count_pos + " " + count_neg+" ==> "+ num );
    	return 10 * count_pos + count_neg;	
	}
	
}

