package com.practice;

public class PermutationOfAString {
	public static void main(String args[]) {
		String str = "ABC";
		permute(str, " ");
		
	}
	public static void permute(String str, String ans) {
//		String ans = " ";
		if(str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		else
		{
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				String ros = str.substring(0, i) + str.substring(i + 1);
				permute(ros, ans + ch);
			}
		}
		
	}

}
