package com.pro.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindTheSameElementsInTwoArrays {
public static void main(String[] args) {
	int[] a1 = {1,2,3,4,5,6,7,8,9};
	int[] a2 = {1,9,2,11,12,13,3,4};
	
	Set<Integer> s= new HashSet<>();
	for(int i=0;i<a1.length;i++) {
		
		for(int j=0;j<a2.length-1;j++) {
			
			if(a1[i]==a2[j]) {
				
				s.add(a1[i]);
				
			}
		}
	}
	
	for(int i: s) {
		System.out.println(i);
	}
	
	
}
}
