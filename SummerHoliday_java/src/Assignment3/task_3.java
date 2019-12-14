package Assignment3;
import java.util.Scanner;
public class task_3 {
/*write a program that can convert numbers (between 0~9) to words.
if the number is greater than 9, the out put should be "invalid number.
           DO it with TERNARY*/



	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 9:");
		byte num = input.nextByte();
		
		String word = num == 1 ? "One" 
				: num == 2 ? "Two" 
						: num == 3 ? "Three" 
								: num == 4 ? "Four"
										: num == 5 ? "Five" 
												: num == 6 ? "Six"
														: num == 7 ? "Seven" 
																: num == 8 ? "Eight"
																		: num == 9 ? "Nine" 
																				: num == 0 ? "Zero" 
																						: "invalid number";
		System.out.println("You have entered : "+ word);
	}
		}

