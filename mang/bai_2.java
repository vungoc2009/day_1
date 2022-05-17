package mang;

public class bai_2 {
	public static void sort(int a[]) {
		for(int i = 0 ; i< a.length ; i++) {
			for(int j = i+i; j<a.length ; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main (String [] args) {
		int a [] =  {1,4,2,5};
		sort(a);
		for(int i =0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
