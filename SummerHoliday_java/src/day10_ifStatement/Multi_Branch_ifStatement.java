package day10_ifStatement;

public class Multi_Branch_ifStatement {
	    

	   /* 

	    if-else if-else: 

	           if(condition1){ 

	               // A ==> if condition1 is true 

	           } 

	           else if( condition2 ) { 

	               //B   ==> if condition1 is false and condition2 is true 

	           } 

	           else { 

	               //C  ==> if condition1 and condition2 are both false 

	           } 

	     

	    */ 

	    

	   public static void main(String[] args) { 

	        

	       if(false) { 

	           System.out.println("if block"); 

	       } 

	       else if(false) { 

	           System.out.println("else if block"); 

	       } 

	       else { 

	           System.out.println("else block"); 

	       } 

	        

	        

	        

	        

	   } 

	} 
/*
	Collapse 

	8:04 PM 

	class note 

	Untitled  

	08/26/2019 

	topic: If statement 

	package name:  day10_ifStatement 

	   firstclass: single_IfStatement 

	   secondclass: if_else_Statement 

	   thirdclass: Multi_Branch_IfStatement 

	       if statement by itself: 

	               if( condition ){ 

	                   // some codes 

	               } 

	           codes within if block gets executed if the condition is true 

	       if & else statement: we use them when there are more than two possibilities 

	               if( condition ){ 

	                       // A 

	                       //if block only gets executed if the condition is true 

	               }  

	               else { 

	                   // B 

	                   // else block only gets executed if the condition is false 

	               } 

	           if condition true -> A 

	           if condition is false -> B 

	       multi-branch if statement: we use them when tehre are more than two possibilities 

	               if(condition1){ 

	                       //A 

	               } else if(condition2){ 

	                       //B 

	               }else{ 

	                   // C 

	               } 

	           if condition1 is true ==>A 

	           if condition1 is false abd condition2 is true ==> B 

	           if condition1 and condtion2 both are false ==> C 

	 

}*/
