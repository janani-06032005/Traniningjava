package Searching;

public class TernarySearch {

	public static void main(String[] args) {
		int [] arr= {11,12,13,14,15,16,17,18,19,20};
		int n= arr.length-1;
		System.out.println(ternarysearch(arr,0,n,15));

	}
	public static int ternarysearch(int [] arr,int lo,int hi,int target) {
		if(lo<=hi) {
			int mid1 = lo+(hi-lo)/3;
			int mid2 = hi-(hi-lo)/3;
			
			
			if(target == arr[mid1]) {
				return mid1;
			}
			if(target == arr[mid2]) {
				return mid2;
			}
			else if(target <arr[mid1]) {
				return ternarysearch(arr,lo,mid1-1,target);
			}else if(target > arr[mid2]){
				return ternarysearch(arr,mid2+1,hi,target);
			}else {
				return ternarysearch(arr,mid1+1,mid2-1,target);
			}
		}
		return -1;
	}

}
