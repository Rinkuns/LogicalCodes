package com.sasken.Rinkun;

public class Mbi {
	public static void main(String[] args) {
	    int[] in= {1,1,3,6,7,3};
	    int count=perfectCity(in);
	    System.out.println(count);
	}
	public static int perfectCity(int[] in) {
	    int flag=0;
	    for(int i=0;i<in.length-1;i++) {
	        if(in[i]>in[i+1]) {
	            for(int j=2;j<Math.sqrt(in[i]);j++) {
	                if(in[i]%j==0 && in[i+1]%j==0) {
	                    flag=1;
	                }
	            }
	            if(flag==0) {
	                return i;
	            }
	        }
	    }
	    return 0;
	}
}
