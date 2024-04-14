package com.pro.searching;

public class BinarySearch {
	
	public static int binarySearch(int[] arr,int target) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			
			int mid =(right+left)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
			
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,7,9,10};
		int target=7;
		
		int result=binarySearch(arr, target);
		
		if (result==-1) {
			
			System.out.println("element not found");
			
		}
		else {
			System.out.println("index value of"+target+" is"+result);
		}
		
		
	}

}
