package day39_javaReview;

	import java.text.DecimalFormat;

import day50_Abstractio.SouthKorea;
	public class DecimalFormater {
	    
	    public static void main(String[] args) {
	        
	        DecimalFormat format = new DecimalFormat("0.00");
	        
	        double b = 23.12345233231213;
	        
	        //format( double):  formats the decimals and returns string value
	            String num1 = format.format(b);
	            
	            System.out.println(num1);
	            
	            double c = 45.5689;  // 45.57
	            
	            System.out.println(  format.format(c) +1 );  //
	            
	            c = Double.parseDouble( format.format(c) ); 
	            
	            System.out.println(c+1);
	            
//	        or...
	            b  = (int)(b * 100d)/ 100d;
	            System.out.println(b);
	            
	    }
	    public static double formatting(double d) {
	    	
	    	double num  = (int)(d * 100d)/ 100d;
	    	
	    	return num;
	    }
	}



