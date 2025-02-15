package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8,4,7,9};
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        System.out.print(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int lo, int mid, int hi) {
        int n1 = mid - lo + 1; // Size of the left subarray
        int n2 = hi - mid;     // Size of the right subarray

        int[] l = new int[n1]; // Left subarray
        int[] r = new int[n2]; // Right subarray

        // Copy data to left and right subarrays
        for (int i = 0; i < n1; i++) {
            l[i] = arr[lo + i];
        }
        for (int j = 0; j < n2; j++) {
            r[j] = arr[mid + 1 + j];
        }

        // Merge the two subarrays
        int i = 0, j = 0, k = lo; // k starts from lo, not 0
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left subarray (if any)
        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        // Copy remaining elements of right subarray (if any)
        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }

    public static void mergesort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2; // Safer midpoint calculation
            mergesort(arr, lo, mid);    // Sort the left half
            mergesort(arr, mid + 1, hi); // Sort the right half
            merge(arr, lo, mid, hi);    // Merge the sorted halves
        }
    }
}