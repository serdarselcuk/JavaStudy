package day03_Variables;

public class EscapeSequences {
/*
 \n (or \r): it finishes the line and continues from  the next line
 \t : horizontal tab
 \\:to print \
 \':to print '
 /:front slash
 \:back slash
 
 
 */
	public static void main(String[] args) {
		System.out.println("hello Cybertek \nBatch 12 students");
		System.out.print("As you see it \n");
		System.out.print("will pass for the next line");
		System.out.print("\n\n\n\n\nyou can also use multiple");
		System.out.print("\t \\t means horizontal tab and also if you use \n \\ first backslash makes the charakter "
				+ "printable as been in the code  ");
		System.out.println("for example if you want to write \" in the code you sould use \\ before wright \" ");
}

}
