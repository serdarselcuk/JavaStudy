package day21_whileLoop;

public class whileLoop {

		public static void main(String[] args) {
			        
			        /*
			         while(condition){
			                    statements;
			            }
			         */
			        int a = 9;  // a=8
			        
			        while ( a > 8 ) {
			            System.out.println("Hello " + a );
			            
			            a--;
			        }
			        
			        /*
			         1. write a java program that can count how many time the word 
			             "book" is appered in a String
			         */
			        
			        String sentence ="I like book, I read book, book book book";
			        //                  "I like , I read book"
			        //                  "I like , I read"
			        int  count = 0;// 1 + 1
			        while( sentence.contains("book") ) {
			            count++;
			            sentence = sentence.replaceFirst("book", "");  
			                // can eventually make the condition false
			        }
			        
			        System.out.println( count );
			        System.out.println( sentence );
			        
			        while(true) {
			            
			            System.out.println("hello");
			            break;  // forcefully exits the loop
			            
			        }
			            int i = 0;
			        while ( true ) {
			            i++;
			            System.out.println("Hello: "+i);  // hello 1
			            if(i == 5) {
			                break;
			            }  
			        }
			        /*Any "for loop" can be converted to "while loop"
			         
			          for (initialization, condition, iterator)
			         		statement
			         		
			         initialization
			         While (condition)
			          		statements
			          		iterator
			         */
			        int e = 0;
			    	while(e < 100) {
			    		System.out.println(e+=2);
			    }
			    	
			 }
			 }
