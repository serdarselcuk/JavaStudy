package day27_customMethods;

public class removeDuplicates {
public static void main(String[] args) {
	
	RemoveDuplicates("aaabbbccc");
	
	
}public static void RemoveDuplicates(String str) {
	String control = "";
	for(int i = 0 ; i<str.length(); i++)
		
		if(!control.contains(str.substring(i,i+1))){
			control+=str.charAt(i);
			}
	System.out.println(control);
				
			
		}
}
