package replit;
import java.util.Scanner;
public class nums {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter 2 numbers:");
		    int num1 = input.nextInt();
		    int num2 = input.nextInt();
		    //CODE HERE 
		    String pos_1 = num1+" is greater than "+ num2;
		    String pos_2 = num1+" is greater than "+ num2;
		    String pos_3 = num1+" and "+num2+" are equal";
		    String PrintOut = num1 > num2 ? pos_1:num1==num2?pos_3:pos_2;
		    
		    System.out.print(PrintOut);
		    
		
		
	}
}
