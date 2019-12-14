package day33_Constructors;

public class warmUp {
	
	public static void main(String[] args) {
		
		String str = "aaabbbscs";
		System.out.println(rem_dup(str));
		System.out.println(charCounter(str, 'a' ));
		System.out.println(frequency(str));
		
	}
	public static String rem_dup(String duplicated) {
		String non_dupl = "";
		
		for( int i = 0; i<duplicated.length();i++) {
			if (!non_dupl.contains(""+duplicated.charAt(i))) {
				non_dupl+=duplicated.charAt(i);
			}
		}
		return non_dupl;
	}
	public static int charCounter(String str, char a) {
		int count = 0;
		for( int i = 0; i<str.length();i++) {
			if (str.charAt(i)==	a ) {
				count++;
			}
		}
		
		return count;
	}
	public static String frequency(String str){
		
		String frequent = "";
		String non_dupl = rem_dup(str);
		for (int i =0; i< non_dupl.length();i++) {
			
			frequent += ""+non_dupl.charAt(i)+charCounter(str, non_dupl.charAt(i));
		}return frequent;
		}
}
