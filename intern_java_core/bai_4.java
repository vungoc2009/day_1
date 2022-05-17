package intern_java_core;

import java.util.Scanner;

public class bai_4 {
	static boolean soNguyenToCung(int a, int b){
		  int n=1;
      for(int i = 2; i <= a && i <= b; i++)
      {
          if(a%i==0 && b%i==0)
          n= i;
      } 
      if(n>1) return false;
	
	return true;
	}
	 public static void main (String[] args)
	    {
	        
	      
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số thứ nhất:");
	        int a = scanner.nextInt();
	        System.out.print("Nhập số thứ hai:");
	     int    b = scanner.nextInt();
	      for(int i=a;i<=b;++i)
	      for(int j=a+1;j<=b;++j)
	    	  
	    	  if(soNguyenToCung(i, j))
	    	  System.out.println(i+" "+j);
	      
	      
	 
	        }
	       
	    }
	
	


