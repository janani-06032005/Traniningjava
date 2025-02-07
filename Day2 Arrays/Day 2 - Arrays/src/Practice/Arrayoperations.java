package Practice;

import java.util.Arrays;

public class Arrayoperations {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		
//		System.out.println("the minimum element in the array is :" +findmin(arr));
//		System.out.println("the maximum element in the array is :" +findmax(arr));
//		System.out.println("the average of the array is :"+ findavg(arr));
//		revarr(arr);
//		System.out.println("the reversed array is :"+ Arrays.toString(arr));
//		System.out.println(checkcompartability(arr1,arr2));
	}
	public static int findmin(int[] arr) {
		int min =arr[0];
		for(int i =1;i<=arr.length-1;i++) {
			if(arr[i]<min){
				min = arr[i];	
			}	
		}
		return min;
	}
	public static int findmax(int [] arr) {
		int max =arr[0];
		for(int i =1;i<=arr.length-1;i++) {
			if(arr[i]>max){
				max = arr[i];	
			}	
		}
		return max;	
	}
	public static int  findavg(int[]arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum/arr.length;
	
	}
	public static void revarr(int []arr) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start ++;
			end --;
		}
		
	}
	public static String checkcompartability(int [] arr1,int [] arr2) {
		if(arr1.length != arr2.length) {
			return "Incompartible";
		}else {
			for(int i=0;i<arr1.length ;i++) {
					if(arr1[i]<=arr2[i]) {
						return "Incompartible";
					}
				}
			}
		return "Compartible";
	}

}
