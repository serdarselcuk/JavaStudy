package Assignment3;

import java.util.Scanner;
public class task_2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 9:");
		byte num = input.nextByte();
		String word = "";
		switch (num) {
		case 1:
			word = "one";
			break;
		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		case 4:
			word = "four";
			break;
		case 5:
			word = "five";
			break;
		case 6:
			word = "Six";
			break;
		case 7:
			word = "seven";
			break;
		case 8:
			word = "eight";
			break;
		case 9:
			word = "nine";
			break;
		case 0:
			word = "zero";
			break;
		default :
			word = "An invalid number"

		}
		System.out.println("You have entered : "+ word);
	}
/*write a program that can convert numbers (between 0~9) to words.
if the number is greater than 9, the out put should be "invalid number.
            DO NOT USE IF STATEMENT
ex 1: 
input:
enter a number between 0 to 9:
1
out put:
you have entered: one
ex 2:
input:
enter a number between 0 to 9:
2
output:
you have entered: two
ex 3:
enter a number between 0 to 9:
10
output:
you have entered: Invalid number
*/

	
}

