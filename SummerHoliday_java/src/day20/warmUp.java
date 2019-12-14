package day20;

public class warmUp {
	public static void main(String[] args) {
	//	atsk1
		int sum = 0;
		for (int i=1; i<=1000; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	// task 2
	//	find the sum of all even numbers between 1 to1000
		
		int sum1 = 0;
		for (int i=1; i<=1000; i++) {
			if (i % 2 ==1) {
				sum1+=i;
			}
		}
		System.out.println(sum1);
		
	//   3. find the sum of all odd numbers between 1 to 1000
		int sum2 = 0;
		for (int i=2; i<=1000; i+=2) {
				sum2+=i;
			
		}
		System.out.println(sum2);
		
	}
}
