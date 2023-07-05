package com.practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int num1 = 0;
		int num2 = 1,num3;
		
		System.out.print(num1+" "+num2);
		for(int i=1;i<=number;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
			
		}
		
	}

}
