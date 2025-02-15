package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		int n = arr.length;
		selectionsort(arr, n);
		System.out.println(Arrays.toString(arr));

	}

	public static void selectionsort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}

	private static void swap(int[] arr, int i, int minIndex) {
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;

	}

}
