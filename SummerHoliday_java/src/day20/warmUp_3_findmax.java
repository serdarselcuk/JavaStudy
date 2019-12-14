package day20;
	import java.util.Scanner;

	public class warmUp_3_findmax {
		public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter 5 numbers");
				int max = 0;
				for(int i= 0 ; i< 5 ; i++ ) {
					int num = scan.nextInt();
					if (num > max)
						max = num;
				}
				System.out.println(max);
		}
	}
