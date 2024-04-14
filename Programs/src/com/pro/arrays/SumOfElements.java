package com.pro.arrays;

public class SumOfElements {

	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 6, 8, 9, 18, 22, 43, 2, 7, 1, 54 };

		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}
