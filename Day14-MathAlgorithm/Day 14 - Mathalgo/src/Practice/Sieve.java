package Practice;

import java.util.Arrays;

public class Sieve {
	public static int count =0;
	public static void sieve(int val) {
		boolean [] isprime = new boolean[val+1];
		Arrays.fill(isprime,true);
		isprime[0]=isprime[1]= false;
		
		
		for(int i = 2 ; i*i <= val ;i++) {
			if(isprime[i]) {
				for (int j=i*i;j<= val;j+=i) {
					isprime[j]=false;
					count ++;
				}
			}
		}
		for(int i=2;i <= val;i++) {
			if(isprime[i]) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		sieve(100);
		System.out.println(count);

	}

}
