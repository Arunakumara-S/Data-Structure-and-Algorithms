package com.practice;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		
		int number = sc.nextInt();
		
		int count = countNumber(number);
		
		int result = armString(number, count);
		
		if(number == result) {
			System.out.println(number + " is armstrong number");
		}else {
			System.out.println(number + " is not armstrong number");
		}
		
	}
	
	public static int countNumber(int number) {
		int count = 0;
		
		while(number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}
	
	public static int armString(int number, int count) {
		int rem = 0;
		int sum1 = 0;
		
		while(number > 0) {
			int sum = 1;
			rem = number % 10;
			number /= 10;
			int count1 = count;
			
			while(count1 > 0) {
				sum = sum * rem;
				count1--;
			}
			sum1 = sum1 + sum;
		}
		return sum1;
	
	}

}
