package com.pro.arrays;

import java.util.Arrays;

public class RemoveDuplicatesInArray {

public static void main(String[] args) {
	
	int[] a1 = {1,2,2,3,3,4,5};
	int [] a2= new int[a1.length];
	
	int j=0;
	Arrays.sort(a1);
	for(int i=0;i<a1.length-1;i++) {
		if(a1[i]<a1[i+1]) {
			a2[j]=a1[i];
			j++;
		}
		
	}
	
	for(int i:a2) {
		System.out.println(i);
	}
}
}
