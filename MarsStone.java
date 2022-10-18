/*Mars Stone:

Rob has gone to Mars to collect some stones. The bag he was carrying can hold a maximum weight of M. 
There are M stones weighing from 1 to M in Mars. There are N stones on Mars that are similar to the ones on Earth. 
Find the number of stones he can bring from Mars such that none of them are similar to any stone on Earth.

Input Specification:
Input1: M, denoting the size of the bag and the number of different stone weights present on Mars.
Input2: N, denoting the number of common stones on Earth and Mars.
Input3: An N element array containing the list of the weights of the common stones.

Output specification:
Your function should return the maximum unique stones that can be collected from Mars.

Example1:
Input1: 10
Input2: 3
Input3: {1,3,5}

Output: 2*/

//Code:
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