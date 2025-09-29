package dp;

import java.util.Arrays;

public class frogJump {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        // frog can jump from i+1 th or to i+2 th stair
        int ans = 0;
        int [] dp = new int[n];
        Arrays.fill(dp, -1);
        ans = func(n-1, heights, dp);
        return ans;

        // min total energy required

    }

    public static int frogJumpTabulation(int n, int heights[]) {

        // Write your code here..
        // frog can jump from i+1 th or to i+2 th stair
        int ans = 0;

       /* int [] dp = new int[n];

        dp[0] = 0;

        for(int index = 1;index <n; index++){

            int first = Integer.MAX_VALUE;
            int sec = Integer.MAX_VALUE;

            if(index>=1) {
                first = dp[index - 1] + Math.abs(heights[index] - heights[index - 1]);
            }
            if(index>=2) {
                sec = dp[index - 2] + Math.abs(heights[index] - heights[index - 2]);
            }

            dp[index] =  Math.min(first, sec);
        }

        return dp[n-1];*/

        // space optimisation


       // int [] dp = new int[n];

        int prev  = 0;
//        int secPrev = 0;

        for(int index = 1;index <n; index++){

            int first = Integer.MAX_VALUE;
            int sec = Integer.MAX_VALUE;

            if(index>=1) {
                first = prev + Math.abs(heights[index] - heights[index - 1]);
            }
            if(index>=2) {
                sec = prev + Math.abs(heights[index] - heights[index - 2]);
            }

           prev =  Math.min(first, sec);
        }

        return prev;
        // min total energy required

    }

    private static int func(int index , int[] heights, int[] dp) {
        if(index <= 0){
            return 0;
        }

        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;


        if(dp[index] != -1){
            return  dp[index];
        }
        if(index>=1) {
            first = func(index - 1, heights, dp) + Math.abs(heights[index] - heights[index - 1]);
        }
        if(index>=2) {
            sec = func(index - 2, heights, dp) + Math.abs(heights[index] - heights[index - 2]);
        }
        return dp[index] =  Math.min(first, sec);

    }

    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        System.out.println(" min total energy required "+ frogJumpTabulation(heights.length, heights));
    }
}
