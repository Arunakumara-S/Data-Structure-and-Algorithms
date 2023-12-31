package com.datastructureandalgorithms;

public class MergeSort {
	public static void main(String[] args) {
		int intArray[] = { 22, 35, -15, 1, 7, 55, -22};
		mergeSort(intArray, 0, intArray.length);
		for(int resultValues : intArray) {
			System.out.println(resultValues);
		}
	}
	
	public static void mergeSort(int intArray[], int start, int end) {
		if(end - start < 2) {
			return;
		}
		 int mid = (start + end) / 2;
		 mergeSort(intArray, start, mid);
		 mergeSort(intArray, mid, end);
		 merge(intArray, start, mid,  end);
	}
	public static void merge(int input[], int start, int mid, int end) {
		if(input[mid - 1] <= input[mid]) {
			return;
		}
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int temp[] = new int[end - start];
		while( i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}

}
