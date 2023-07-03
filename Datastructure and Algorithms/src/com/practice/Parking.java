package com.practice;

public class Parking {
	public static void main(String args[]) {
		int arr[][]= {{0,1,0},{1,0,0},{1,1,1}};
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0) {
					count1++;
				}
				else if(arr[i][j]==1) {
					count2++;
				}
				System.out.println(count1+" "+count2);
				
			}
			
		}
		
	}

}
