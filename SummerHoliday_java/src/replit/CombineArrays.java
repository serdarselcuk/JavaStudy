package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CombineArrays {
	
	ArrayList<String>array1 = new ArrayList<>();
	
	public CombineArrays() {
		
	}
	
	public CombineArrays(int i) {
		
	}
	public static ArrayList<String> combineAL(ArrayList<String>wordList1,ArrayList<String>wordList2){

		ArrayList<String>combineAL = new ArrayList<>(wordList1);
		combineAL.addAll(wordList2);
		return combineAL;
	}
	public static void main(String[] args) {
		
		String[] arr = {"1","2","3","4","5","6","7"};
		String[] arr2 = {"1","2","3","4","5","6","7"};
		
		ArrayList<String>wordList1 = new ArrayList<>(Arrays.asList(arr));
		ArrayList<String>wordList2 = new ArrayList<>(Arrays.asList(arr2));
		ArrayList<String> combin  = new ArrayList<>(combineAL(wordList1, wordList2));
		System.out.println(combin);
		
		removeAll(combin, "3");
		System.out.println(combin);
		
		String[] arr3 = {"serdar", "selcuk", "sencer", "Elif", "selcuk", "sencer", "Elif", "selcuk", "sencer", "Elif"};
		ArrayList<String>wordList3 = new ArrayList<>(Arrays.asList(arr3));
		
		System.out.println(wordList3);		//[serdar, selcuk, sencer, Elif, selcuk, sencer, Elif, selcuk, sencer, Elif]
		removeAll(wordList3, "sencer");
		System.out.println(wordList3);		//[serdar, selcuk,         Elif, selcuk,         Elif, selcuk,         Elif]
	}
	public static void removeAll(ArrayList<String>wordList, String targetWord){
		
		 while(wordList.remove(targetWord));
		 
		}

}

