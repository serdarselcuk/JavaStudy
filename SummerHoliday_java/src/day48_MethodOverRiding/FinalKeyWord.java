package day48_MethodOverRiding;

class Holly{
	/*final*/ public void printName(){
			System.out.println();
	}
}
class Credentals{
	private final String UserName = "cybertek";
	private final String password = "batch12";
	
	private void setUserName(String UserName) {
		// TODO Auto-generated method stub
		/*this.*/UserName = UserName;  // can not assigned it because it is overloaded
			//	SO YOU CAN NOT CREATE THE SETTER METHOD
	
	}
	public String getUserName() {
		return this.UserName;
	}
}
public class FinalKeyWord extends Holly{
	
	@Override
	public void printName() {		// if final key word have been used on line 4 you won't be able to override this method
		// TODO Auto-generated method stub
		super.printName();
		
		
	}

	
	
}
