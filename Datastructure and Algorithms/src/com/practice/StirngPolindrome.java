package com.practice;

import java.util.LinkedList;

public class StirngPolindrome {
	public static void main(String[] args) {
		
//		System.out.println(checkPolindrome("abccba"));
//		
//		System.out.println(checkPolindrome("I did, did I ?"));
		
		System.out.println(checkPolindrome1("I did, did I ?"));
	}
	
	public static boolean checkPolindrome(String string) {
		LinkedList<Character> stack = new LinkedList<Character>();
		StringBuilder stringNoPunctuation = new StringBuilder(string.length());
		String lowerCase = string.toLowerCase();
		
		for(int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if(c >= 'a' && c <= 'z') {
				stringNoPunctuation.append(c);
				stack.push(c);
			}
		}
		
		StringBuilder reverseString = new StringBuilder(stack.size());
		while(!stack.isEmpty()) {
			reverseString.append(stack.pop());
		}
		return reverseString.toString().equals(stringNoPunctuation.toString());
	}

	public static boolean checkPolindrome1(String string) {
		LinkedList<Character> stack = new LinkedList<Character>();
		
		StringBuilder stringNoPunctation = new StringBuilder(string.length());
		
		String lowerCase = string.toLowerCase();
		
		for(int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if(c >= 'a' && c <= 'z') {
				stringNoPunctation.append(c);
				stack.push(c);
			}
		}
		
		StringBuilder reverseString = new StringBuilder(stack.size());
		while(!stack.isEmpty()) {
			reverseString.append(stack.pop());
		}
		
		return reverseString.toString().equals(stringNoPunctation.toString());
	}
}
