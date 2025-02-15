package Practice;

public class Factors {

	public static void main(String[] args) {
		findfact(36);

	}
	public static void findfact(int n) {
		for(int i=2;i<=n*n;i++) {
			if(n %i==0) {
				System.out.print(i+" ");
				
				if(i != (n/i)) {
					System.out.print(n/i +" ");
				}
			}
		}
	}

}
