package com.practice;

public class SecondLargest {
	public static void main(String args[]) {
		int nums[]= {3,2};
		secondLargest(nums);
		int k=2;
		int num=0;
		
		for(int i=nums.length-1;i>=0;i--) {
			if(k==0) {
				break;
			}
			k--;
			num=nums[i];
		}
//		System.out.println(num);
		
	}
	
	public static void secondLargest(int[] intArray) {
		if(intArray.length <= 2) {
			if(intArray[0] > intArray[1]) {
				System.out.println(intArray[1]);
			}else {
				System.out.println(intArray[0]);
			}
			return;
		}
		
		int max = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			
		}
		
		
	}

}
