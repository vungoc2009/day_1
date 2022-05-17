package mang;

public class bai_6 {
	public static void sort(int [] a) {
		for(int i =0 ; i < a.length;  i++) {
			for(int j = i+ 1 ; j < a.length ; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void chen (int []a , int x) {
		int b [] = new int [a.length +1];
		b[0] = x;
		for(int i = 1 ; i < b.length ; i++) {
			b[i]= a[i-1];
		}
		sort(b);
		for(int i = 0 ; i < b.length  ;i++) {
			System.out.print(b[i]+ " ");
		}
	}
	public static void main (String [] args) {
		int a[] = {1,2,3,5};
		int x = 4;
		chen(a,x);
	}
}
