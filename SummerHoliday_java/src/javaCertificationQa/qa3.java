package javaCertificationQa;

import java.io.IOException;


public class qa3 {
	
	public void printFileContent(){
		
			throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		
		qa3 q=new qa3();
		
		try {
			q.printFileContent();
			System.out.println("1");
		} catch (RuntimeException e) {
			System.out.println("2");
		}
	}
		
}