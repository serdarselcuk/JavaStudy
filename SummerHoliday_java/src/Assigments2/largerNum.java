package Assigments2;

public class largerNum {
	/*You have 3 variables num1, num2, max

assign value of larger one into variable max

 

Ex:

if: int num1 = 20;  int num3= 30

then   int max=30;

 

if: num1 = 40;  num3 = 100;

then:  max= 100;
*/
		public static void main(String[] args) {
			int num1 = 125;
			int num2 = 124;
			int max;
			if (num1 > num2) {
				max = (num1);
				System.out.println("num 1 is max\n"+max);
			}
			if (num2>num1){
				max = (num2);
				System.out.println("num2 is max\n "+ max);
			}
			if (num1 == num2) {
				max = num1;
				System.out.println(" \nther is no larger!both of them \n" + max);
			}
			
		}
}
