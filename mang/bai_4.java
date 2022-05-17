package mang;
import java.util.Scanner;
public class bai_4 {
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
	public static void vitri(int []a , int n) {
		int b = 9999999;
		for(int i = 0 ; i < a.length ; i++) {
			if(Math.abs(a[i]-n)<b) {
				b = Math.abs(n-a[i]);
			}
		}
		for(int i = 0 ; i < a.length ; i++ ) {
			if(isPrimeNumber(a[i]) && Math.abs(n-a[i]) == b) {
				System.out.println ("so gan nha la");
				System.out.println (a[i]);
			}
		}
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap do dai mang");
		int n = sc.nextInt();
		System.out.println("nhap so x");
		int x = sc.nextInt();
		int a[] = new int [n];
		System.out.println("nhap mang");
		for(int i =0 ; i < a.length ; i++) {
			a[i] = sc.nextInt();
		}
		vitri(a, x);
	}
}
