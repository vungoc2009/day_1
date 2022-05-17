package intern_java_core;

import java.util.Scanner;

public class bai_5 {
	public static void Sum(int n) {
		int so_du;
		int sum = 0;
		while (n > 0) {
			so_du = n % 10;
			n =n/10;
			sum += so_du;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Sum(n);
	}
}
