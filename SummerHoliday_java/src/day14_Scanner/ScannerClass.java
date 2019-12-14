package day14_Scanner;



import java.util.Scanner;
//  Every thing in Scanner class is imported


public class ScannerClass {

		public static void main(String[] args) {
	//Declaration of Scanner : 
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a Byte Value : ");
				byte byteNum = input.nextByte();
				
			System.out.println("And now enter an integer : ");
				byte ByteNum2 = input.nextByte();
			int total = byteNum + ByteNum2 ;
			System.out.println("You have entered : " + byteNum
					+"\nand than you have entered : " + ByteNum2 + "\nand those Byte total : " + total);
			
		}
	}

