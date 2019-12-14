package day27_customMethods;

public class voidMethodWithArgument {
	
	public static void main(String[] args) {
		for (int i =0; i<100 ; i++) {
			if(oddOrEven(i));{
				System.out.println(i + " is even");
			}
				System.out.println(i+" is odd");
					
		}
		System.out.print("sum of the 23 and 45 is : "  );
		sumOfTwoNum(23, 45);
		
		RemoveDuplicates("aabbccccdddaaa");
	}
	public static boolean oddOrEven(int a){
		if (a%2 == 0)
			return true;//even
		else
			return false;//odd
	}
	public static void sumOfTwoNum(int a, int b) {
		
		System.out.println(a+b);
	}
	public static void RemoveDuplicates(String str) {
		String control = "";
		for(int i = 0 ; i<str.length(); i++)
			
			if(!control.contains(str.substring(i,i+1))){
				control+=str.charAt(i);
				}
		System.out.println(control);
					
				
			}
	}
}
