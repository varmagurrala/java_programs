package com.pro.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1,4,7,9,10};
		int target=7;
		int result=linearSearch(arr, target);
		if(result==-1) {
			System.out.println("element not found");
		}
		else {
			
			System.out.println("the index of "+target +"is"+result);
		}
		

	}

	
	public static int linearSearch(int arr[],int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}
}
