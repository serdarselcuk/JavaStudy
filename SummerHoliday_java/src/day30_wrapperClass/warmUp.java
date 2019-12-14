package day30_wrapperClass;

import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(RevDup(str));
		System.out.println(unique(str));
	}public static String RevDup( String str) {
		String  non_dup ="";
		for (int i = 0; i<str.length();i++) {
			if(!non_dup.contains(""+str.charAt(i))){
				non_dup+=str.charAt(i);
			}
		}return non_dup;
	}
	public static String unique(String str) {
		String  str2 = RevDup(str);
		String result = "";
		for (int i = 0 ; i < str2.length(); i++) {
			int count =0;
			for (int j = 0 ; j < str.length(); j++) {
				if (str.charAt(j) == str2.charAt(i)){
					count++;
					System.out.println(str2.charAt(i)+"original str" +str.charAt(j)+"unduplicated string"+"count is :"+count);
				}
			}if(count == 1){
				System.out.println("after second loop count is :"+count+"result is"+result);
				result  += str2.charAt(i);
			}
		}return result;
	}
}
