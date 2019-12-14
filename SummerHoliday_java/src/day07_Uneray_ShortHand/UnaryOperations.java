package day07_Uneray_ShortHand;

public class UnaryOperations {

		public static void main(String[] args) {
			/* + : Positive 
			 * - : Negative
			 * ++: Increment
			 * --: Decrement
			 
			 *	for +&-:
			  (+) * (+) = (+)
			  (+) * (-) = (-)
			  (-) * (-) = (+)
			  			  
			 */
		// INCREMENT:
		// pre-increment : operator placed before the variable, increases the variable by 1 immediately
			
			int num = 100 ;
			++num;
			System.out.println(num);  //101
		// post-increment : operator placed after variable. it increases the variable after red it.
			System.out.println(num++);//101
			System.out.println(num);  //102
			
		//DECREMENT 
		//pre-decrement:
			System.out.println(--num); //101
		//post-decrement:
			System.out.println(num--); //101
			System.out.println(num);   //100
		
		
		}
}
