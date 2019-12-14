package replit;

import java.util.Scanner;

public class theGame {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		EstimationClass oyun = new EstimationClass();
		int pos = 0;
		int neg = 0;
		while (! oyun.gameOver()) {
			
			System.out.println(oyun.myguess);
			System.out.println("how many number is on the correct place?");
			pos = scan.nextInt();	// take the answer for computer estimation
			System.out.println("how many number is exist bun not on the correct place?");
			neg = scan.nextInt();
			
			if (!oyun.updatePossibilities(pos, neg)){
				System.out.println("what fuck are you doing maaan");
				break;
			};			//oyun.degerlendir(pos, neg)
			
		}System.out.println("My guess is " + oyun.myguess+"\n===============================GAME OVER=============================");
		
		
	}
}
