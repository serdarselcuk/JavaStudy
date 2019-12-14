package day17_StringClass;

public class withoutx_X {
public static void main(String[] args) {
	
	String word = "xssewwfdx";
	if (word.startsWith("x")) {
		word=word.substring(0,1);
	}	
	if (word.endsWith("x")){
		word = word.substring(0,word.length()-1);
	}
	
	System.out.println(word);
}
}