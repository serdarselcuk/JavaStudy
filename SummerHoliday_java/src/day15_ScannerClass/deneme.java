package day15_ScannerClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class deneme {

  public static void main(String[] args) {
	  String str3 = "cybertek";
		String str4 = new String("cybertek");
		System.out.println(str3.equals(str4));  // false because of the string pool and heap memory
		
	int[] arr = {1,2,3,4,5,6};
	
	ArrayList<Integer>list = new ArrayList<>(Arrays.asList(arr));
	
	
	
  }

}