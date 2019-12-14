package day08_ShortHandOperators;

public class tasks {

	
	public static void main(String[] args) {
		int x = 2;
		int y = x++ ;
		System.out.println(y); //y =2 , x = 3
		x--; // x=2
		System.out.println(x++);// print : 2 but x = 3
		x--; // x=2
		System.out.println(--x); // print :1 , x=1
		x = 8 ;
		y = x-- ;  //y = 8 , x = 7
		System.out.println(y); // 8
		
	}
}
