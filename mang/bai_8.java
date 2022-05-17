package mang;

import java.util.Scanner;

public class bai_8 {
	public static Scanner sc = new Scanner(System.in);
	public static void nhan() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int A [][] = new int [m][n];
		int B [][] = new int [n][k];
		for(int i = 0 ; i < m; i++) {
			for(int j =0 ; j < n ; j ++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("nhap B");
		for(int i = 0 ; i < n; i++) {
			for(int j =0 ; j < k ; j ++) {
				B[i][j] = sc.nextInt();
			}
		}
		int c [][] = new int [m][k];
		for(int i =0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				for(int g =0 ; g <k ; g++) {
					c[i][j] += A[i][g] * B[g][j];
				}
			}
		}
		for(int i = 0 ; i< c.length ; i ++) {
			for(int j = 0 ; j< c[0].length ; j ++) {
				System.out.println (c[i][j]);
			}
		}
	}
	public static void main (String [] args) {
		nhan();
	}
}
