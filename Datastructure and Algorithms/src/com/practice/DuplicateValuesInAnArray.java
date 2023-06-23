package com.practice;

public class DuplicateValuesInAnArray {
	public static void main(String[] args) {
		int array[]= {1,2,3,4,2,5,6,8,10,5};
		for(int i = 0; i < array.length; i++) {
			int value = array[i];
			for(int j = i + 1; j < array.length; j++) {
				if(value == array[j]) {
					System.out.println(value);
				}
			}
		}
	}

}
