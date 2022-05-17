package intern_java_core;

import java.util.Scanner;

public class bai_1 {
	public static void tinh_tong(int n) {
		double sum = 0;
		int sum_chan = 0;
		int sum_le = 0;
		for(int i = 0 ; i <= n ; i++) {
			if(i%2 == 0) {
				sum_chan += i;
			}
			else {
				sum_le += i;
			}
			sum = sum + 1.0/n;
		}
		System.out.println("tổng chẵn "+ sum_chan);
		System.out.println("tổng lẻ "+ sum_le);
		System.out.println("tổng bai_1b "+ Math.ceil(sum*100)/100);
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số");
		int n = sc.nextInt();
		tinh_tong(n);
	}
}
