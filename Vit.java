package com.sasken.Rinkun;



//Not a perfect code



public class Vit {

	    static int mini(int x, int y, int z)
	    {
	        return Math.min(Math.min(x, y), z);
	    }


	    static int MinSum(int arr1[], int x,int k)
	    {

	        int summation1[] =new int[x];


	        summation1[0] = arr1[0];
	        summation1[1] = arr1[1];
	        summation1[2] = arr1[2];


	        for (int i = k; i < x; i++)
	            summation1[i] = arr1[i] + mini(summation1[i - 3],
	                    summation1[i - 2], summation1[i - 1]);

	        return mini(summation1[x - 1], summation1[x - 2],summation1[x - 3]);
	    }

	    // Driver code
	    public static void main (String[] args)
	    {
	        int arra[] = {1, 2, 3, 20, 2, 10, 1};
	        int k=3;
	        int n = arra.length;
	        System.out.println("Minimum Sum is " + MinSum(arra, n,k));

	    }

}
