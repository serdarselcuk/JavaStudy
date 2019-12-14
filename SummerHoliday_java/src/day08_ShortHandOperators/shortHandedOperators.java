package day08_ShortHandOperators;

public class shortHandedOperators {

	/*
	 

		NAME						SHORTHAND OPERATOR 				MEANING 
	
	Assignment							x = y 						x = y 
																		
	Addition Assignment 				x += y 						x = x + y 

	Subtraction Assignment 				x -= y						x = x – y 

	Multiplication Assignment 			x *= y						x = x * y 

	Division Assignment 				x /= y 						x = x / y 
	
	Remainder Assignment				x %= y						x = x % y
	
	*/
	public static void main(String[] args) {
		
		//Addition Assignment 
		int a = 9;
		a += 3 ; // a = a + 3
	
		int  b = a += 5 ; // 12 + 5 = 17 so b = 17
		
		System.out.println(a + "and" + b);
		
		int c = a+= b;
		System.out.println( c +"is c\n"+ a + "is a\n" + b + "is b");
		
		int d = c += a * 2 ;// 34 * 2 = 68 + 34(for c) = 102
		System.out.println("d=" + d +" c= "+ c +" a="+a );// d=102 c= 102 a=34
		
		//Subtraction Assignment 	
		
		int e = d-= a%5;
		System.out.println("e ="+e+" d ="+d+" a ="+a);// e = 98 d= 98 a= 34
		//Division Assignment 
		int f = e /= b %5 ; // 98 / 2 (17% 5 = 2) = 49 , f = e = 49
		System.out.println("f="+f+"e="+e+"b=j"+b);
		//Multiplication Assignment 
		int B = 100 ;
		B *= B - 100 ; // first ???  
		
				System.out.println(B);// B = 0
				
		B += a * 2;
		System.out.println("B= "+B+" a= "+a); // B = 68 a = 34
		double C = B /= a - 32 ;// 
		System.out.println("C="+ C + " B="+B+" a="+a); //C =  34.0 B= 34 a= 34
		a += B/2  ;// again it does the operation that is after equality
		System.out.println(a); //a = 51
		
		
		
		double F = 10  ;
		System.out.println(F%= 4); //2
		double G = -10 ;
		System.out.println(G%= 4 );//-2
		double H = 10 ;
		System.out.println(H %= -4 );//2
		double J = -10 ;
		System.out.println(J %= -4 );//-2
		
		
		
		
		
		
		
		
	}
}
