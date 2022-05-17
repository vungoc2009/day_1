package intern_java_core;
import java.util.Scanner;
public class bai_3 {
	public static int UCLN (int a , int b) {
		while (a != b) {
			if(a > b) {
				a = a-b;
			}else {
				b = b-a;
			}
		}
		return a;
		
	}
	public static int BCNN (int a , int b) {
		int c = a*b /UCLN(a,b);
		return c;
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số thứ 1");
		int a = sc.nextInt();
		System.out.println("nhập số thứ 2");
		int b = sc.nextInt();
		System.out.println("UCLN " + UCLN(a,b));
		System.out.println("BCNN " + BCNN(a,b));
	}
}
