package com.sasken.Rinkun;

import java.util.HashSet;

public class SareFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //HelloWorld s=new HelloWorld();
	        int input1=7;
	        int input2=4;
	        int[] input3={1,2,1,3,4,7,1};
	        System.out.println(Sareena(input1,input2,input3));
	    }
	    public static int Sareena(int input1, int input2, int[] input3){
	        HashSet<Integer> hs=new HashSet<Integer>();
	        for(int i=0;i<input2;i++){
	            if(i<input2){
	                hs.add(input3[i]);
	            }
	        }
	        return hs.size();
	}

}
