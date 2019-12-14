package day15_ScannerClass;
import java.util.Scanner;

public class StringInput {
	
// Whilw we entering String it some different becouse of it is a complex data type
	
  public static void main(String[] args) {
	  
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter the strings : \n");
    
      String str1 = input.nextLine();// it returns the entire user input as a string
      
      String str = input.next();// it takes only the first word. It rejects after the first space
      
      System.out.println(str1 +"\n"+ str);
  }
}
     