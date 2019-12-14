package day21_whileLoop;

public class warmUp_2 {
	public static void main(String[] args) {
		
		int i = 1;
		while( i<=30) {
			if (i % 3 == 0||i % 5 == 0) {
				System.out.println();
				if (i % 3 == 0)
					System.out.print("FIN");
				if (i % 5 == 0) 
					System.out.print("RA");
			}else
				System.out.print("\n"+i);
			i++;
		}
	}
}
