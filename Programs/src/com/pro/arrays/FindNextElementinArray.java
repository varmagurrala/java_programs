package com.pro.arrays;

public class FindNextElementinArray {

	public static void main(String[] args) {

		int[] a = { 2, 5, 6, 7, 8, 8, 9 };
		
		int b=7;
		
		for(int i=0;i<a.length;i++) {
			
			if(b<a[i]) {
				
				System.out.println(a[i]);
				break;
			}
		}
		

	}

}
