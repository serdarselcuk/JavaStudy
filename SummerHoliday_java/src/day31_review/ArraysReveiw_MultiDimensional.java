package day31_review;
import java.util.Arrays;
public class ArraysReveiw_MultiDimensional {

	public static void main(String[] args) {
		
		    /*
		      n dimensional array: contains (n-1) dimensional arrays
		     
		     */
		        
		        int[] arr1D = {1,2,3};
		        
		        // index:          0 1 2     0 1 2
		        int[][] arr2D = { {1,2,3} , {4,5,6}  };
		        // index:            0         1
		        
		        System.out.println(arr2D.length ); //2
		        
		        //[index num of 1D arrays][index num of each values]
		        
		        // print 2:
		            System.out.println(arr2D[0][1]);
		        
		        //print:  {4,5,6}
		        System.out.println( arr2D[1] );  // hashcode
		        System.out.println( Arrays.toString( arr2D[1] ));
		        
		        // print: { {1,2,3} , {4,5,6}  }
		        System.out.println( arr2D );  // hashcode	([[I@244038d0)
		        System.out.println( Arrays.toString( arr2D ));  //hashcodes ([[I@5680a178, [I@e2d56bf])
		        
		    //  Arrays.deepToString(variableName):  converts multi dimensional arrays to String
		        
		        String str = Arrays.deepToString(arr2D);
		        System.out.println(str);//		[[1, 2, 3], [4, 5, 6]]
		        
		        
		        char[] ch = {'a', 'b', 'c','d', 'c', 'e'};
		        
		        for( char each  :  ch ) {
		            if(each == 'c') {
		                continue;
		            //    System.out.print(each + " "); //this sttatement will never executed because also
		                //	   if statement will be true it will b under the continue statement
		                  // as soon as continue statement is executed, it skips the next statement
		            }
		    
		            System.out.print(each + " ");
		            
		        }
		        System.out.println();
		        
		        
		    String[][] names = { {"Erhan","Holy", "Denis", "John-Snow", "Tarzan"},  {"Muhtar","Mike", "Ariya", "Dilyar", "Nadira"} };
		        //                          0                                                   1
		        for( String[] each1D   :  names ) {
		            
		        //  System.out.println( Arrays.toString(  each1D )  );
		            for(String  eachValue : each1D ) {
		                if(eachValue.equals("Holy") || eachValue.equals("John-Snow") ) {
		                    continue;
		                }
		                System.out.print( eachValue  +" ");
		            }
		            
		            
		        }
		        
		        
		        
		        
		        
		        
		    }
		}
	

