package mang;

import java.util.Scanner;

public class bai_5 {
	public static void chen(int a[], int b[],int x, int c[]) {
		for(int i =0 ; i < x ; i++) {
			c[i] = a[i];
		}
		for(int i =0 ; i < b.length ; i++) {
			c[i+x] = b[i];
		}
		for(int i =x ; i < a.length ; i++) {
			c[i+b.length] = a[i];
		}
		for(int i =0 ; i< c.length ; i++) {
			System.out.println(c[i]);
		}
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so phan tu a");
		int n = sc.nextInt();
		int a [] = new int [n];
		System.out.println("nhap mang a");
		for(int i = 0 ; i< a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("nhap so phan tu b");
		int m = sc.nextInt();
		System.out.println("nhap mang a");
		int b [] = new int [m];
		for(int i = 0 ; i< b.length;i++) {
			b[i] = sc.nextInt();
		}
		int[] c = new int [a.length+ b.length];
		int x ;
		System.out.println("nhap vi tri can chen");
		do {
			x = sc.nextInt();
		}while(0>x || x >n);
		
		chen(a,b,x,c);
		
	}
}



