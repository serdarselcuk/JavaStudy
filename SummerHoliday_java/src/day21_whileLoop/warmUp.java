package day21_whileLoop;

public class warmUp {
	public static void main(String[] args) {
		// delete the duplications
		String input = "adabdbcc";
		String noduplicate = "";
		for( int i=0 ; i < input.length();i++) {			// look for each character one by one
			if (!noduplicate.contains(input.charAt(i)+"")) {//if the char have been added before don't add it again
			noduplicate += input.charAt(i);					//adding the non duplicated char to new string
		}
	}	System.out.println(noduplicate);
			
	}
}
