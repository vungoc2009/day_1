package intern_java_core;

public class bai_7 {
	public static boolean check(int n) {
		if (n<2) {
			return false;
		}else if(n==2) {
			return true;
		}else {
			for(int i = 0 ; i < (int)n/2 ; i++) {
				if(n%2 ==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void kiem_tra_so_le(int a[]) {
		boolean b = true;
		for(int i =0 ; i< a.length ; i++) {
			int n = a[i];
			while (n > 0) {
				int so_du = n % 10;
				if(so_du % 2 ==0) {
					b = false;
				}
				n = n/10;
			}
			if(b == true) {
				System.out.println (a[i]);
			}
		}
	}
	public static void main (String[] args) {
		int dem = 0;
		for(int i = 10; i< 100 ; i++) {
			if(check(i)) {
				dem++;
			}
		}
		int a[] = new int [dem];
		int j =0;
		for(int i = 10 ; i< 100 ; i++) {
			if(check(i)) {
				a[j] = i;
				j++;
			}
		}
		kiem_tra_so_le(a);
	}
}
