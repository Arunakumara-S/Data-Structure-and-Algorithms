package com.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int num = number/2;
		int count = 0;
		while(num > 2) {
			if(number%num == 0) {
				count++;
				break;
			}
			num--;
		}
		if(count == 0) {
			System.out.println(number+" is a prime");
		}else {
			System.out.println(number+" is not a prime number");
		}
	
	}

}
