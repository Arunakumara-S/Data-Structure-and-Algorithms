package com.practice;

public class SecondLargest {
	public static void main(String args[]) {
		int nums[]= {3,2,1,5,6,4};
		int k=2;
		int num=0;
		
		for(int i=nums.length-1;i>=0;i--) {
			if(k==0) {
				break;
			}
			k--;
			num=nums[i];
		}
		System.out.println(num);
		
	}

}
