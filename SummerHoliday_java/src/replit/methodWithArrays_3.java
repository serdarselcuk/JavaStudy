package replit;

public class methodWithArrays_3 {
public static void main(String[] args) {
	
}  
public static int getDup(String[] r) 
{
  int count = 0;
  for( int i=0; i<r.length;i++){
    for(int j = i+1; j<r.length; j++){
      if(r[j].equals(r[i])){
        count++;
      }
    }
  }System.out.println(count);
 
}public static boolean isAnagram(String word1, String word2) {
	   word1=word1.toLowerCase();
	   word2=word2.toLowerCase();
	   System.out.println(word1 +" "+ word2);//											 DELETE
	
	   if (word1.length() == word2.length()) {
	      
		   for(int i = 0 ; i < word1.length() ; i++){
			   boolean find = false;
			   for(int j = 0 ; j < word2.length() ; j++){
	          
				   if(word1.charAt(i)==word2.charAt(j)){
					   find = true;
					   break;
				   }
			   }if (find == false ) {
				   	return find;
			   }
				   
		   }return true;
	   }
		   return false;
	   
	}
}

