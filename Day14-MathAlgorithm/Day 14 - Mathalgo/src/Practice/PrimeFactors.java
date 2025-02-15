package Practice;

public class PrimeFactors {

	public static void main(String[] args) {
		findprimefactors(54);

	}
	public static void findprimefactors(int val) {
		while(val % 2==0) {
			System.out.print(2+" ");
			val = val/2;
		}
		for(int i=3;i*i <= val;i+=2) {
			while(val %i ==0) {
				System.out.print(i+" ");
				val = val/i;
			}
		}
		if (val >2) {
			System.out.print(val +" ");
		}
	}

}
