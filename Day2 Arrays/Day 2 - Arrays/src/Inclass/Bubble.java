package Inclass;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int [] arr= new int [n1];
		for(int i =0;i<n1;i++) {
			arr[i]=sc.nextInt();
		}
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubblesort(int [] arr) {
		for(int i=0 ; i<arr.length;i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
		}
	}

}
}
