package com.practice;

import java.util.Scanner;

public class ReverseStirng {
	public static void main(String args[]) {
		String reverse = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value: ");
		String original = scanner.nextLine();
		System.out.println("The given value is "+original);
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if(reverse.equals(original)) {
			System.out.println("The revese of the value is "+reverse);
			System.out.println("The given value is polindrome");
		}
		else
		{
			System.out.println("The revese of the value is "+reverse);
			System.out.println("The given value is not polindrome");
		}
		
	}

}
