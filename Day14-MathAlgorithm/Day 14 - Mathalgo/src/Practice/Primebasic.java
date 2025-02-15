package Practice;

public class Primebasic {

	public static void main(String[] args) {
		System.out.println(isprime(13));

	}
	public static boolean isprime(int val) {
		for(int i=2;i<val;i++) {
			if(val%i == 0) {
				return false;
			}
		}
		return true;
	}
	

}
