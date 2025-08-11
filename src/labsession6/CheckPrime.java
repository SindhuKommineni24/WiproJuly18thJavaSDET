package labsession6;

public class CheckPrime {
	static boolean isPrime(int n) {
		if(n==1 || (n%2==0 && n!=2)) {
			return false;
		}
		int k=(int)Math.sqrt(n);
		int fc=0;
		for(int i=2;i<=k;i++) {
			if(n%i==0) {
				fc++;
			}
		}
		return fc==0;
	}
	public static void main(String[] args) {
		int n=2;
		boolean b=isPrime(n);
		if(b==true) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}

