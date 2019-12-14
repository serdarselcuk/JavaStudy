package day22_nestedLoop;

import java.util.Scanner;

public class warmUp_2 {
	 public static void main(String[] args) {
	String str="";
    int i = 1;
    while( i<=30) {
        if (i % 3 == 0||i % 5 == 0) {
            
            if (i % 3 == 0)
                str+=" FIN";
            if (i % 5 == 0) 
                str+=" RA";
        }else
            str+=" "+i;
        i++;
    }System.out.print(str);
}
}
