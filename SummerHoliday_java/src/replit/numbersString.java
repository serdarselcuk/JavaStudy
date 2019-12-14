package replit;

import java.util.Scanner;

public class numbersString {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number to the thousand");
		
		String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","teen","ty"};
		int num = scan.nextInt();
		int num3 = 0;
		int num2 = 0;
		int num1 = 0;
		boolean cont = true;
		while(cont) {
		if (num > 99) {
			num3 = num / 100;
			num %= 100;
		}else if (num > 9) {
			num2 = num / 10;
			num %= 10;
		}else {
			num1 = num;
			cont = false;
		}
		}if (num2 < 2 ) {
			System.out.println(hundered(num3)+one(num1,num2));
		
		}else {void
			System.out.println(hundered(num3)+ten(num2)+one(num1,num2));}
	}public static String one(int num1,int num2) {
			
			String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
			String result="";
			if (num2>0){
				if (num1 == 0) {
					result = nums[10];
				}else if ( num1 == 1) {
					result = nums[11];
				}else if ( num1 == 2) {
					result = nums[num1].substring(0,2)+"elve";
				}else if ( num1 == 3) {
					result = nums[num1].substring(0,2)+"ir";
				}else if ( num1 == 5) {
					result = nums[num1].substring(0,2)+"f";
				}else if ( num1 == 8) {
					result = nums[num1].substring(0,4) ;
				}else {
					result = nums[num1];
					}
				}
			return result+ten(num2);	
	
		
	}public static String ten(int num1) {
		String result = "";
		String[] nums = {"teen", "ty"};
		
		if(num > 2) {
			result = one(num1)+"nums[1]";
		}
		/*if (num == 13) {
				result += (nums[num%10].substring(0,2)+"ir" + nums[13]); // th + ir + teen
		}else if ( num == 15) {
				System.out.println(nums[num%10].substring(0,2)+"f" + nums[13]);// fi + f + teen
		}else if ( num == 18) {
				System.out.println(nums[num%10].substring(0,4) + nums[13]);	// eigh + teen
		}else {
				System.out.println(nums[num%10] + nums[13]);	// out of 13,15,18 : number + teen
			}*/
		return result;
		
		
	}public static String hundered(int num) {
		String result ="";
		if (num > 0)
			result =  one(num)+"hundered";
		else
			result = "";
		return result;
		
		/*
		
		
		
		
		
		
		
		
		
		
		if ( num < 13) {
			one(num);		
		}else if (num < 20 ) {
			if (num == 13) {
				System.out.println(nums[num%10].substring(0,2)+"ir" + nums[13]); // th + ir + teen
			}else if ( num == 15) {
				System.out.println(nums[num%10].substring(0,2)+"f" + nums[13]);// fi + f + teen
			}else if ( num == 18) {
				System.out.println(nums[num%10].substring(0,4) + nums[13]);	// eigh + teen
			}
			else {
				System.out.println(nums[num%10] + nums[13]);	// out of 13,15,18 : number + teen
			}
		}else if (num < 99) {
			if (num < 30) {
				System.out.println(nums[(num - (num%10)) / 10].substring(0, 2)+"en"+ nums[14]); // tw + en + ty
			}else if ( num == 15) {
				System.out.println(nums[num%10].substring(0,2)+"f" + nums[13]);// fi + f + teen
			}else if ( num == 18) {
				System.out.println(nums[num%10].substring(0,4) + nums[13]);	// eigh + teen
			}
			
			System.out.println(nums[(num - (num%10)) / 10]+ nums[14]);  // (23 - 3 )/10 = 2 ==> number + ty
			
		}else {
			System.out.println("");
		}
		
		
		
		
	
	
	}public static String one(int num) {
		
		String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
		
		return nums[num];	
		
	}public static String ten(int num) {
		String result = "";
		String nums = {"teen", "ty"};
			
		if (num == 13) {
				result += (nums[num%10].substring(0,2)+"ir" + nums[13]); // th + ir + teen
		}else if ( num == 15) {
				System.out.println(nums[num%10].substring(0,2)+"f" + nums[13]);// fi + f + teen
		}else if ( num == 18) {
				System.out.println(nums[num%10].substring(0,4) + nums[13]);	// eigh + teen
		}else {
				System.out.println(nums[num%10] + nums[13]);	// out of 13,15,18 : number + teen
			}
		return result;
	}public static String hundered(int num) {
		
		*/
		
		}
	}

