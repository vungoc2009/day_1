package mang;

import java.util.Scanner;

public class bai12 {
	public static void xoay (int [][]A) {
		for(int i =A.length -1 ; i >=0 ; i--) {
			for(int j =0 ; j <A.length ; j++) {
				System.out.print(A[j][i] + " ");
			}
			System.out.println(" ");
		}
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] A = new int [n][n];
		for(int i =0 ; i< A.length ; i++) {
			for(int j =0 ; j <A[0].length;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		xoay(A);
		
	}
}
