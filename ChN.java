package com.sasken.Rinkun;

public class ChN {
	static int Count(int N, int L, int R)
	{
	    
	    // Stores all DP-states
	    int[][] dp = new int[N][R - L + 1];
	    
	    // Stores the result
	    int ans = 0;



	   // Traverse the range [0, N]
	    for(int i = 0; i < N; i++)
	    {
	        dp[i][0] = 1;
	    }
	    
	    // Traverse the range [1, R - L]
	    for(int i = 1; i < dp[0].length; i++)
	    {
	        
	        // Update dp[i][j]
	        dp[0][i] = dp[0][i - 1] + 1;
	    }



	   // Assign dp[0][R-L] to ans
	    ans = dp[0][R - L];



	   // Traverse the range [1, N]
	    for(int i = 1; i < N; i++)
	    {
	        
	        // Traverse the range [1, R - L]
	        for(int j = 1; j < dp[0].length; j++)
	        {
	            
	            // Update dp[i][j]
	            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
	        }



	       // Increment ans by dp[i-1][j]
	        ans += dp[i][R - L];
	    }



	   // Return ans
	    return ans;
	}



	// Driver Code
	public static void main(String args[])
	{
	    
	    // Input
	    int N = 2;
	    int L = 8;
	    int R = 9;



	   // Function call
	    System.out.println(Count(N, L, R));
	}
}
