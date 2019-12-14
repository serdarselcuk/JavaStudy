package day48_MethodOverRiding;

public class Bank {
	public int rate = 100;
    public void InterestRate() {
    	int rate = 9;
    	int cik = 0;
        System.out.println("9 percent");
    }
    
    public static void main(String[] args) {
    	
        BankOfAmerica BOA = new BankOfAmerica();
                    BOA.InterestRate();   //9
        
        Chase Chase = new Chase();
                    Chase.InterestRate();  //9
                    
        CapitalOne CO = new CapitalOne();
                    CO.InterestRate();  //9
                    
                
        
    }
    
}
class BankOfAmerica extends Bank{
	
	   public void InterestRate() {
		   	int cik = 2;
	        System.out.println("9 percent");
	    }
	    
}
class Chase extends Bank {
	
	   public void InterestRate() {
		   
	        System.out.println("9 percent");
	    }
	    
}
class CapitalOne extends Bank {
	
	   public void InterestRate() {
		   
	        System.out.println("9 percent");
	        

	    }
	    
}

