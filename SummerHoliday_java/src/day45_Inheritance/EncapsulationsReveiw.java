package day45_Inheritance;

import java.util.ArrayList;

class Credentials{
	String userName;
	String passWord;
	
   public  Credentials() {
       setuserName("admin");
       setpassWord("123");
   }
   
    // getter: 
    public String getuserName() {
        return userName;
    }
    
    public String getpassWord() {
        return passWord;
    }
    
    // setter:
    public void setuserName(String userName) {
        this.userName = userName;
    }
    
    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public void setCredentials(String userName, String passWord ) {
        // this.userName = userName;
        // this.passWord = passWord;
           setuserName(userName);
           setpassWord(passWord);
    }
    
    public void getInfo() {
           System.out.println( "username: " + getuserName() );
           System.out.println( "password: " + getpassWord() );
    }  
}
public class EncapsulationsReveiw {
   
   public static void main(String[] args) {
	   Credentials Zlfy = new Credentials();
       
       //  obj.userName = "Zlfy";   // private is only visible within the class
       //  obj.passWord = "123456"; // private is only visible within the class
       
       // read:
           Zlfy.setCredentials("Zlfy", "111");
       
           System.out.println( "username: "+Zlfy.getuserName() );
           System.out.println( "password: "+Zlfy.getpassWord() );
           
           Credentials Nurzat = new Credentials();
                   Nurzat.setuserName("9876");
                   Nurzat.setpassWord("nuri345");
           
           System.out.println( "username: "+Nurzat.getuserName());
           System.out.println( "password: "+Nurzat.getpassWord() );
           
       
           Credentials Seyfo = new Credentials();
           Seyfo.setCredentials("Seyfo", "456");
           Seyfo.setpassWord("789");
       
           Seyfo.getInfo();
           
           System.out.println("==============================================");
       
           Credentials[]  users = { Zlfy, Nurzat, Seyfo };
               users[0].getInfo();
               users[1].getInfo();
               users[2].getInfo();
           
       ArrayList<Credentials>  credentialsList = new ArrayList<>();
           
       
       
   }
}

