package com.datastructureandalgorithms;

public class SelectionSort {
	public static void main(String[] args) {
		int intArray[] = { 22, 35, -15, 1, 7, 55, -22};
		
		for(int unsortedIndex = intArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
			int largest = 0;
			for(int i = 1; i < unsortedIndex; i++) {
				if(intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, unsortedIndex);
		}
		
		for(int resultValues : intArray) {
			System.out.print(resultValues+" ");
		}
	}
	
	public static void swap(int intArray[], int i, int j) {
		if(i == j) {
			return;
		}
		
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
