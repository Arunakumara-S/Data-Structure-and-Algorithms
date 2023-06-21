package com.datastructureandalgorithms;

public class QuickSort {
	public static void main(String[] args) {
		int intArray[] = { 22, 35, -15, 1, 7, 55, -22};
		QuickSort(intArray, 0, intArray.length);
		for(int resultValues : intArray) {
			System.out.print(resultValues+" ");
		}
	}
	
	public static void QuickSort(int intArray[], int start, int end) {
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(intArray, start, end);
		QuickSort(intArray, start, pivotIndex);
		QuickSort(intArray, pivotIndex + 1, end);
	}
	
	public static int partition(int input[], int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		while( i < j) {
			while(i < j && input[--j] >= pivot);
			if(i < j) {
				input[i] = input[j];
			}
			
			while(i < j && input[++i] <= pivot);
			if(i < j) {
				input[j] = input[i];
			}
		}
		input[j] = pivot;
		return j;
		
	}

}
