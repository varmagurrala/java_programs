package com.pro.arrays;

import java.util.Arrays;

public class ReverseAnArrayUsingRecrussion {
	
	
	public static void main(String[] args) {
		int arr[] = {1,4,7,9,2,10};
		
		System.out.println("before"+Arrays.toString(arr));
		
		reverseArray(arr, 0, arr.length-1);
		
		System.out.println("after"+Arrays.toString(arr));
	}
	
	public static void reverseArray(int arr[],int start, int end) {
		
		if(start>=end) {
			return;
		}
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		reverseArray(arr, start+1, end-1);
		
		
		
	}

}
