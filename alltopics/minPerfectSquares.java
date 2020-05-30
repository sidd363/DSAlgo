
public class minPerfectSquares {
	
	public static int numSquares(int n) {
        // state: dp[i] => minimum number of perfect squares number needed to add up to i 
        // state transfer function:
        // dp[i] = min(dp[i - square] + 1 for each perfect square)
        // base case: dp[0] = 0
        int[] dp = new int[n + 1];
        dp[0] = 0;
        
        for (int i = 1; i <= n; ++i) {
        	System.out.println("i----------"+i);
            int v = n;
            for (int j = 1; j * j<= i; ++j) {
            	System.out.println("j"+j);
                v = Math.min(v, dp[i - j * j] + 1);
            }
            dp[i] = v;
            
            System.out.println("----------");
        }
        
        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(numSquares(13));
	}

}
