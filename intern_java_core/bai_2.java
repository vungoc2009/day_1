package intern_java_core;

import java.util.Scanner;

public class bai_2 {
	public static void uoc(double n) {
		int dem = 0 ;
		for(int i = 0 ; i <= n/2 ; i++) {
			if(n % i == 0) {
				System.out.print(i + " " );
				System.out.println( " " );
				dem ++;
			}
		}
		System.out.println("so luong uoc cua  " + (int)n + " là " + dem);
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		uoc(n);
	}
}
