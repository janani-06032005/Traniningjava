package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		int n = arr.length;
		insertionsort(arr, n);
		System.out.println(Arrays.toString(arr));

	}
	public static void insertionsort(int[]arr,int n) {
		for(int i=0;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0) {
				if(key<arr[j]) {
					arr[j+1]=arr[j];
				}else {
					break;
				}
				j--;
			}
			arr[j+1]=key;
		}
	}

}
