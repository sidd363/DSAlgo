package dp;

public class TargetSum {
    public static int targetSum(int n, int target, int[] arr) {
        // Write your code here.

        int sum = 0;
        for(int i : arr){
            sum+= i;
        }
        if(sum - target< 0){
            return 0;
        }
        if(((sum - target)%2!=0)){
            return 0;
        }
        int nT = (sum-target)/2;


        int [][] dp = new int[n][nT+1];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<=nT; j++){
                dp[i][j] = -1;
            }
        }
        return util(n-1, nT, arr, dp);

    }

        private static int util(int i, int target, int[] arr, int[][] dp) {

            if(i == 0){
                if(arr[i]==0 && target == 0){
                    return 2;
                }
                if((arr[i]==target) ||  target ==0){
                    return 1;
                }
                return 0;

            }

            if(dp[i][target]!= -1){
                return dp[i][target];
            }
            int take = 0;
            if(target>= arr[i]){
                take = util(i-1, target-arr[i], arr, dp);
            }

            int nottake = util(i-1, target, arr, dp);

            return  dp[i][target] = take+nottake;
        }

    public static void main(String[] args) {
            int [] arr = {1,1,1,1,1};

        System.out.println("total ways are : "+targetSum(5, 3, arr) );
    }
}
