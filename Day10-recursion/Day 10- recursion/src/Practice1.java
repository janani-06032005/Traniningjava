import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
//	displayrev(3);
//  hello(3);
//	displayorder(1);
//  System.out.println(fact(5));
//  System.out.println(fibo(5));
//  print(5);
//  sum(5,0);
//  System.out.println(sumofnumbers(5));
		
//		int [] arr = {1,2,3,4,5};
//		Reverse(arr,0,arr.length-1);
//		System.out.println(Arrays.toString(arr));
		String str = "madsm";
		boolean result = ispalindrome(str, 0, str.length() - 1); // Call the method
        System.out.println(result);

	}

//	DISPLAY NUMBER IN REVERSE ORDER

	static void displayrev(int val) {
		if (val <= 0) {
			return;
		}
		System.out.println(val);
		displayrev(val - 1);
	}

//	PRINTING HELLO

	static void hello(int val) {
		if (val <= 0) {
			return;
		}
		System.out.println("Hello");
		hello(val - 1);
	}

//	DISPLAY IN ORDER

	static void displayorder(int val) {
		if (val <= 0) {
			return;
		}

		displayorder(val - 1);
		System.out.println(val);
	}

//	FACTORIAL OF A NUMBER

	static int fact(int n) {
		if (n <= 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

//	FIBONACCI SERIES

	static int fibo(int n) {
		if (n < 2) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
	
//	PRINTING NAMES
	
	static void print(int n) {
	
		if(n<=0) {
			return ;	
		}
		System.out.println("janani");
		print(n-1);
	}

	
//	SUM IN PARAMETERIZED WAY
	
	static void sum(int n,int sum) {
		if(n <1) {
			System.out.println(sum);
			return ;
		}
		
		sum(n-1,sum+n);
		
		
	}
	
	
//	SUM IN FUNCTIONAL WAY WITH RETURN TYPE
	
	static int sumofnumbers(int n) {
		if(n < 1) {
			return 0;
		}
		return n+sumofnumbers(n-1);
	}
	
	
	
//	REVERSE AN ARRAY 
	
	static void Reverse(int [] arr, int left,int right) {
		reverse(arr,left,right);
	}
	
	private static void reverse(int[]arr,int l,int r) {
		
		if(l>=r) {
			return;
		}
		int temp = arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		
		reverse(arr,l+1,r-1);
		
	}
	
	
//	CHECKING FOR PALINDROM USING RECURSION
	
	static boolean ispalindrome(String str,int l,int r) {
		if(l>=r) {
			return true;
		}
		if(str.charAt(l)!=str.charAt(r)) {
			return false;
		}
		return ispalindrome(str,l+1,r-1);
	}
}
