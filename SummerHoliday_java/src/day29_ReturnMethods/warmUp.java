package day29_ReturnMethods;

public class warmUp {
	
	public static void main(String[] args) {
	String str = "aaaaaaaabbbcccccttaa";
	String controlled = "";
	
	for(int i = 0; i < str.length(); i++) {	// iterate on the chars that included in str
		if (!controlled.contains(""+str.charAt(i))){ // add them if you didn't add before
			
			int count = 0;				// we will count the chars with this integer
			controlled+=str.charAt(i);	// add the chat as it has been controlled
			for(int a = i; a < str.length(); a++) {// this loop will check the chars and count them if they hadn't been controlled before
				if(str.charAt(i) == str.charAt(a)) { // if the char is the same with our controlling char
					count++;						// count will add by 1
				}
			}controlled+=""+count;					// add to controlled string our last count of the controlled char
			
		}
		}
	System.out.println(controlled);
	
	
	System.out.println("===============this was my solution==================================");
	
	
}
}
