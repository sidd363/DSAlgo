package dp;

public class RodCutting {
    public static int cutRodMemoize(int price[], int n) {
        // Write your code here.
        int [] [] dp = new int[n+1][n+1];
        for(int i = 0;i<= n;i++){
            for(int j = 0;j<= n;j++) {
                 dp[i][j] = -1;
            }
        }
        int ans = util(price, n, n, dp);
        return ans;
    }

    public static int cutRodTabulation(int price[], int n) {
        // Write your code here.
        int [] [] dp = new int[n+1][n+1];

        for(int  i = 1;i<= n ; i++){
            dp[1][i] = i*price[0];
        }

        for(int i = 2; i<= n; i++){
            for(int j = 1;j<= n;j++) {

                int notTake =  dp[ i-1][j];

                int take = Integer.MIN_VALUE;

                if(i<= j){
                    take = price[i-1] + dp[ i][j-i];
                }

                dp[i][j] = Math.max(notTake, take);
            }
        }
        return dp[n][n] ;
    }

    private static int util(int[] price, int index, int total, int[][]dp) {
        if(index == 1){
            if(total % index == 0){
                return (total/index)*price[index-1];
            }
            return 0;
        }

        if(dp[index][total]!= -1){
            return -1;
        }
        int notTake = util(price, index-1, total, dp);

        int take = Integer.MIN_VALUE;
        if(index<= total){
            take = price[index-1] + util(price, index, total - index, dp);
        }

        return dp[index][total] = Math.max(notTake, take);
    }

    public static void main(String[] args) {
        int [] price = {3, 5, 8, 9, 10, 17, 17, 20};
        int maxProfit = cutRodTabulation(price, price.length);
        System.out.println(" max profit -- "+ maxProfit);
    }
}
