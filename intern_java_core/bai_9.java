package intern_java_core;

public class bai_9 {
	public static int dao_nguoc(int n) {
		int res = 0 , so_du = 0;
		while (n > 0) {
			so_du = n % 10;
			res = res * 10 + so_du;
			n = n/10;
		}
		return res;
	}
	public static boolean chua_0_6_8(int i) {
		int so_du =0;
		while (i >0) {
			so_du = i%10;
			i = i/10;
			if(so_du !=0 && so_du !=6 && so_du !=8) {
				return false;
			}
		}
		return true;
	}
	public static boolean tong_chia_10(int i) {
		int so_du;
		int sum = 0;
		while (i > 0) {
			so_du = i % 10;
			i = i / 10;
			sum += so_du;
		}
		if (sum % 10 == 0) {
			return true;
		}
		return false;
	}
		
	
	public static void main (String [] args) {
		for(int i = 1000000 ; i < 999999999; i++) {
			if(i == dao_nguoc(i)  && tong_chia_10(i) && chua_0_6_8(i)) {
				System.out.println(i);
			}
			
		}
	}
}
