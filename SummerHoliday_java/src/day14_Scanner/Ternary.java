package day14_Scanner;

public class Ternary {
public static void main(String[] args) {
/* in Ternary:
	 * if (condition)  ==> (condition)?
	 * else            ==> :
	 * else if         ==> :(condition)?
	 */
	int num = 0;
	if (num == 0) {
		num = 100;
	} else {
		num =50;}
	System.out.println(num);
	
	num = (num == 0)? 100 : 50; // Ternary bodies can only give a single value
								//in Ternary () are not mandatory... you don't need to use
	
	String Schoolname = " ";
	boolean Batch12 = true;
	Schoolname = Batch12== true ?   "Cybertek" :  "nvalid"  ;
	System.out.println(Schoolname);
	
	/* ternary must be initialized to a variable or printed out because it returns a value
	 * total number of '?' and ':' are must be equal 
	 * so you can't use on only if statement there must be else also
	 */
	
	char FinalGrade = 'C';
	String Group = "";
	
	Group = FinalGrade == 'A'? "Early Bird" : FinalGrade=='B'? "Group 1":FinalGrade == 'C'? "Group 2":"After group 2";
	System.out.println(Group);
	
	//else-if statement:
	
	int Score = 80;
	char Finals =' ';
	
	Finals = Score <=100 && Score >=90 ? 'A' 
				: Score >= 80 ? 'B' 
					: Score >= 70 ? 'C'
						:Score >= 60 ? 'D'
							:Score >= 0 ? 'F'
							:' ';
	System.out.println(Finals);
	
	System.out.println("================================");
	
	System.out.println("\n\n\n");
	
	System.out.println(35%25);
		
	}
}
