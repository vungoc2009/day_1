package intern_java_core;

import java.util.Scanner;

public class bai_6 {
	public static void phanTich(int n) {
		int i = 2;
		while (n > 1) {
			if (isPrimeNumber(i)) {
				if (n % i == 0) {
					System.out.print(i + "X");
					n /= i;
				} else
					i++;
			} else
				i++;
		}
	}

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n");
		int n = sc.nextInt();
		System.out.print("n= ");
		phanTich(n);
	}

}
