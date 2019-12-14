package day26_forEach;

public class forEach {
public static void main(String[] args) {
	/*
	 For each loop : used to access the value in a collection of values
	 
	 * it's a loop that's already been iterated
	 * for each loop can never be infinite
	  
	 syntax : 
	 			for(DataType variableName(each is preferred) : VariableNameOfCollection){
	 
	 */
	int[]arr= {1,2,3,4,5};
	for(int i =0 ; i< arr.length;i++) {
		System.out.println(arr[i]);
	}
	int num = 0;
	for(int each : arr) {
		System.out.print(each+ ""+ num++);//1021324354
	}
	System.out.println();
	String[] str = {"se","rd","ar"};
	for(String each : str) {
		System.out.print(each);//serdar
	}
	System.out.println();
	char[] ch = {'a','b','c','d'};
	for (char each : ch) {
		System.out.print(each);//abcd
	}
	System.out.println();
	
	
	
}
}
