package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int n = arr.length;
		bubblesort(arr, n);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubblesort(int[] arr, int n) {
		boolean swap = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
		
	}

}
