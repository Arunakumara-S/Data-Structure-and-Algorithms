package com.practice;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		//Two different Arrays
		int firstArray[] =  { 1, 3, 4, 5};
		int	secondArray[] = {2, 4, 6, 8} ;
		int size = firstArray.length + secondArray.length;
		int result[] = new int[size];
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		int count = 0;
		
		for(int i = 0; i < firstArray.length; i++) {
			result[count++] = firstArray[i];
		}
		
		for(int j = 0; j < secondArray.length; j++) {
			result[count++] = secondArray[j];
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
