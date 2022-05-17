package mang;
import java.util.Scanner;
public class bai_10 {
	public static void  sum_chinh(int [][]A) {
		int sum = 0;
		int sum1=0;
		for(int i =0 ; i < A.length; i++) {
			for(int j = 0 ; j < A[0].length ; j++) {
				if(i == j) {
					sum += A[i][j];
				}
				if(i+j == A.length -1) {
					sum1 += A[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int A [][] = new int [n][m];
		for(int i =0 ; i < n; i++) {
			for(int j = 0 ; j < m ; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		sum_chinh(A);
	}
}
