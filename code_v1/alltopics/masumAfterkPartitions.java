
public class masumAfterkPartitions {
	
    public static int maxSumAfterPartitioning(int[] A, int K) {
        int N = A.length, dp[] = new int[N];
        for (int i = 0; i < N; ++i) {
            int curMax = 0;
            System.out.println(" i chanegd----------------------------");
            for (int k = 1; k <= K && i - k + 1 >= 0; ++k) {
            	System.out.println("j i "+k + "  "+i);
                curMax = Math.max(curMax, A[i - k + 1]);
                System.out.println("curmax "+curMax);
                dp[i] = Math.max(dp[i], (i >= k ? dp[i - k] : 0) + curMax * k);
                System.out.println("DP  "+dp[i]);
            }
        }
        return dp[N - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,15,7,9,2,5,10};
		
      System.out.println(maxSumAfterPartitioning(a,3));
	}

}
