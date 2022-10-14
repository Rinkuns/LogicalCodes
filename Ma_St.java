package com.sasken.Rinkun;

//import java.util.Iterator;

public class Ma_St {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		int n2=3;
		int[] n3= {1,3,5};
		System.out.println(method(n1,n2,n3));
	}
	public static int method(int n1,int n2, int[] n3) {
		int[] arry=new int [n1];
		int count=0;
		int sum=0;
		
		for (int i = 1; i <= n1; i++) {
			arry[i-1]=i;
			for (int j = 0; j < n2; j++) {
				if(arry[i-1]==n3[j]) {
					arry[i-1]=0;
				}
			}
		}
		
		for (int i = 0; i < n1; i++) {
			if(sum<n1 && arry[i]!=0) {
				sum=sum+arry[i];
				if(sum<n1) {
					count++;
				}
			}
		}
		return count;
	}

}
