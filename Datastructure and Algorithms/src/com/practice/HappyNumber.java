package com.practice;

public class HappyNumber {
	public static void main(String args[]) {
//		System.out.println("Hello world");
		isHappy(19);
//		System.out.println("Hello world");
		
	}
	public static void isHappy(int n) {
		
		int rev = 0;
		int res = 0;
		int m = 0;
		while(n > 0) {
			if(m == 1) {
				break;
			}else if(n > 0) {
				rev = n % 10;
				n = n / 10;
				res = rev*rev;
				m = m + res;
				System.out.println(n);	
				
			}else
			{
				n = m;
			}
		}
//		System.out.print(res);
		
	}
	

}
