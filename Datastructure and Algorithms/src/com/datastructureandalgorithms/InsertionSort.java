package com.datastructureandalgorithms;

public class InsertionSort {
	public static void main(String[] args) {
		int intArray[] = { 22, 35, -15, 1, 7, 55, -22};
		
		for(int unsortedIndex = 0; unsortedIndex < intArray.length; unsortedIndex++) {
			int newElment = intArray[unsortedIndex];
			int i;
			for(i = unsortedIndex; i > 0 && intArray[i - 1] > newElment; i--) {
				intArray[i] = intArray[i - 1];
			}
			
			intArray[i] = newElment;
		}
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] +" ");
		}
	}

}
