package com.pro.sortiontech;

public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[] = {1,4,7,9,2,10};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					
					arr[j]=arr[j+1];
					
					arr[j+1]=temp;
					
					
					
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
