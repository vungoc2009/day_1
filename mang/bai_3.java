package mang;
import java.util.Scanner;
public class bai_3 {
	public static void count (int a [] ) {
		int dem =1;
		for(int i =0 ; i< a.length ; i++) {
			for(int j =i+1 ; j<a.length ; j++) {
				if(a[i] == a[j]) {
					dem++;
				}
			}
			System.out.println("so lan xua hien cua "+ 1+" "+dem);
		}
	}
	public static void main (String [] args) {
		int a[] = {1,2,2,3,3,3};
		count (a);
	}
}
