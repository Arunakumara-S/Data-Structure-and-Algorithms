package com.practice;

import java.util.Arrays;

public class UnionArrays {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4}; 
		int arr2[] = {1, 2, 3, 4, 5} ;
		int count = 0;
		Arrays.sort(arr1);
		for(int i = 0; i < arr1.length; i++ ) {
			System.out.print(arr1[i] + " ");
		}
		for(int i = 0; i < arr2.length; i++) {
			count = 0;
			int j;
			for( j = 0; j < arr1.length; j++) {
					if(arr2[i] == arr1[j]) {
						count++;
				}	
			}
			if(count == 0) {
				System.out.print(arr2[i]+" ");
			}
		}
	}

}
