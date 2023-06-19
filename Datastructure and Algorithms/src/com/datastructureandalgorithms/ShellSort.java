package com.datastructureandalgorithms;

public class ShellSort {
	public static void main(String[] args) {
		int intArray[] = { 22, 35, -15, 1, 7, 55, -22};
		
		for(int gap = intArray.length / 2; gap > 0; gap /= 2) {
			for(int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				int j = i;
				while(j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				
				intArray[j] = newElement;
			}
		}
		
		for(int resultValues : intArray) {
			System.out.print(resultValues+" ");
		}
	}

}
