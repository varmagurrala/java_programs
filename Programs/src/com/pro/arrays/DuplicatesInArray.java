package com.pro.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {



		int[] arr = { 4,9,4,7,8,8,5,8,8,9 };
		int[]d= removeDuplicates(arr);
		for (int i : d) {

			System.out.print(i);

		}

	}

	public static int[] removeDuplicates(int[] arr) {

		Arrays.sort(arr);

		Set<Integer> set = new HashSet<>();

		for(int i=0;i<arr.length-1;i++) {

	

				set.add(arr[i]);
			}

		int[] b=new int[set.size()];

		int c=0;
		for (int i : set) {

			b[c]=i;
			c++;

		}

		return b;
	}

}
