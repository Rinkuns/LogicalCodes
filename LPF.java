package com.sasken.Rinkun;

import java.util.Scanner;

public class LPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        int result=Lpd(x);
        System.out.println("the result is: "+result);
        sc.close();
	}
	 public static int Lpd(int n){
	        if(n<=1){
	            return 0;
	        }
	        else{
	            int y=2;
	            while(y<n){
	                if(n%y!=0){
	                    y++;
	                }
	                else{
	                    n=n/y;
	                    y=2;
	                }
	            }
	        }
	        return n;
	 }
}