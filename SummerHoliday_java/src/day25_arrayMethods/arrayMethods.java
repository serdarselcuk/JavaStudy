package day25_arrayMethods;

import java.util.Arrays;

public class arrayMethods {
	
	/*
		
 		to print entrire array as whole, we need to convert the array to String
Arrays.toString( VairableName ): used for converting single
	 	dimensional arrays to  String  value
		  			 	 
		Arrays class: Utility of all the arrays, 
		Arrays class is presented in "Java.util"package
		  			 	 
		  
			String str = Arrays.toString( arr );
			System.out.println(str);
			
		String[] names = { "Elvira" , "Bibish", "Tural" ,"Daulet", "Hakan" };
		
			System.out.println( names[0]);
			System.out.println( names );  // hash code
			System.out.println(  Arrays.toString( names )  );
			
			
Arrays.sort(variableName): sorts the values of the array in ascending order (smallest to largest)
			 
			int[] Numbers = { 9, 8, 100, 3000, 4, 5, 6};
			
			System.out.println(  Arrays.toString(Numbers) );
			
				Arrays.sort(  Numbers );   // sort all the values of the array in acsending order
		
// sort method does: 	Numberds = [4, 5, 6, 8, 9, 100, 3000];
				

		System.out.println(  Arrays.toString(Numbers) );
		
		System.out.println("Maximum: " + Numbers[Numbers.length-1]);
		System.out.println("Minimum: "+ Numbers[0]);
			
		
		String[] Namelists = { "Alma" ,"Enes", "Myra","Smith", "Sarah","Lexi" ,"ABC"};
		Arrays.sort(Namelists); // alphabetical order ( from AsCII table)
		
		System.out.println( Arrays.toString(Namelists) );
		
		char[] ch = {'0' , '9', '8', '5' ,'3', '2', '1' };
			Arrays.sort(ch);
			 
			System.out.println( Arrays.toString(ch) );
			int[] nums  = {2000, 90, 89, 78, 65, 5555, 444, -5};
	
split(str): splits the String by the given value, and returns it as String array
     
     
toCharArray():returns a char array from the String
     
     */
		
		

	
	public static void main(String[] args) {
		// sort method does : make array in ascending order
		
		int[] arr = {9, 4, 2, 6, 5, 8, 3, 7, 1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		String[] str = {"serdar", "enes", "kazim", "levent", "Ahmet","Fatih"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));//[Ahmet, Fatih, enes, kazim, levent, serdar]
		
		char[] ch = {'a','c','g','e','l'};
		Arrays.sort(ch);
		System.out.println(ch[0]);//a
		System.out.println(Arrays.toString(ch));//[a, c, e, g, l]
		
		//split() : it makes array by mentioned in parenthesis
		
		//	variableName.split(" ");
		String str2 = "Serdar Selcuk";
		
		System.out.println(Arrays.toString(str2.split(" ")));// [Serdar, Selcuk]
		
		String str3[] = str2.split("S");
		System.out.println(Arrays.toString(str3));//			[, erdar , elcuk]
		System.out.println(str3.length);// 3     this is how you can count some thing in arrays
		System.out.println(str3[0]+"<=== no thing");		//   <=== no thing is the first element
		
		// toCharArray() : returns a char array from the String
		
		System.out.println(Arrays.toString(str2.toCharArray()));//[S, e, r, d, a, r,  , S, e, l, c, u, k]
		
	}
}
