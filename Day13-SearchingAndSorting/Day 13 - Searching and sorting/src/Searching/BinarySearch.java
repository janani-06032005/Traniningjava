package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr= {11,12,13,14,15,16,17,18,19,20};
		int n= arr.length-1;
		System.out.println(binarysearch(arr,0,n,15));

	}
	public static int binarysearch(int [] arr,int lo,int hi,int target) {
		if(lo<=hi) {
			int mid = (lo+hi)/2;		
			if(target == arr[mid]) {
				return mid;
			}else if(target <arr[mid]) {
				return binarysearch(arr,lo,mid-1,target);
			}else {
				return binarysearch(arr,mid+1,hi,target);
			}
		}
		return -1;
	}
	
	

}
