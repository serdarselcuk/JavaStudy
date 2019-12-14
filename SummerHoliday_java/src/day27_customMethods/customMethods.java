package day27_customMethods;

import java.util.Arrays;

public class customMethods {

			/* methods : grouping a series of statements together to perform a specific tasks
			  
			  methods can make our codes reusable
			  Any method can't be created in another method. They must be declared within the class
			  methods must be call in the other method to work... 
			  
			  method declaration:
			  
			public 			static 			void 			main(String[] args)		{ 	}
		access modifier  - specifier		-return type 	- 		method name()		{ 	}
		-public			 -static			-void
		-protected		 -abstract			-int
		-default		 -final				-double
		-private							-(any other 
											   data type)
											   
											   
		Void : does not return any value 

		Methods with parameters : 
		
			Some methods needs specific information to perform its task, then we need to declare the methods with parameters 
		arr [] = {1,2,3,4,5}; 
		
		Example: Arrays.sort(arr);    
			 */
		public static void main(String[] args) {
			int[][][] arr3D = {{{1,2},{3,4},{5,6},{7,8}}};
			arr3D[0][0][0] =2;
			System.out.println(arr3D[0][0][0]);
			
			
		}


}
