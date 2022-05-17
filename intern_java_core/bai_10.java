package intern_java_core;

public class bai_10 {
	public static boolean isPrimeNumber(int n) {

		if (n < 2) {
			return false;
		}

		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean all_nguyen_to(int i) {
		int so_du = 0 ;
		while (i > 0) {
			so_du = i % 10;
			i = i/10;
			if(so_du != 2 && so_du != 3 && so_du != 5 && so_du != 7) {
				return false;
			}
			
		}
		return true;
	}
	public static boolean dao_nguoc(int n) {
		int res = 0, so_du = 0;
		while (n > 0) {
			so_du = n % 10;
			res = res * 10 + so_du;
			n = n / 10;
		}
		if(isPrimeNumber(res)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main (String [] args) {
		for(int i = 1000000 ; i < 9999999 ; i++) {
			if(isPrimeNumber(i) && all_nguyen_to(i) && dao_nguoc(i)) {
				System.out.println(" " +i);
			}
		}
	}
}
