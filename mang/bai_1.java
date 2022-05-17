package mang;
import java.util.Scanner;
public class bai_1 {
	public static boolean check (int [] a) {
		for(int i = 0 ; i< (int)a.length/2; i++) {
			if(a[i] == a[a.length-i-1]) {
				return true;
			}
		}
		return false;
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b [] = new int [a];
		for(int i = 0 ; i < b.length ; i ++) {
			b[i] = sc.nextInt();
		}
		if(check(b)) {
			System.out.println("đúng");
		}else {
			System.out.println("sai");
		}
	}
}
