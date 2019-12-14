package replit;
import java.util.Scanner;
public class equalsPythonJava {
	
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine().toLowerCase();
		    int count_java = 0;
		    int count_python = 0;
		    while (sentence.contains("java")) {
		    	count_java += 1;
		    	sentence = sentence.replaceFirst("java", " ");	
		 	}
		    while (sentence.contains("python")) {
		    	count_python += 1;
		    	sentence = sentence.replaceFirst("python", " ");
		  }
		    System.out.println(count_java == count_python);
		  }
		}

