package com.pro.sortiontech;

import java.util.Arrays;

public class InsertionSortExample {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
    	
        int[] array = {5, 3, 9, 2, 7};

        insertionSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
