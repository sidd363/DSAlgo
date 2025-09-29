package dp;

public class zero1knapsack {
    // Returns the maximum value that can be put in a knapsack of capacity W
    static int[][] t = new int[10][10];
    static int knapSackRecursive(int w, int wt[], int val[], int n)
    {
        // your code here
        if(n ==0 || w==0){
            return 0;
        }

        if(wt[n-1] <=w){
            return Math.max(val[n-1]+knapSackRecursive(w-wt[n-1], wt, val, n-1) , knapSackRecursive(w, wt, val, n-1));
        }
        return knapSackRecursive(w, wt, val, n-1);

    }
    static int knapSackMemoize(int w, int wt[], int val[], int n)
    {
        // your code here
        if(n ==0 || w==0){
            return 0;
        }

        if(wt[n-1] <=w){
            return Math.max(val[n-1]+t[w-wt[n-1]][n-1] , t[w][  n-1]);
        }
        return t[w][n-1];

    }
    static int knapSackDP(int w, int wt[], int val[], int n)
    {
        // your code here
        if(n ==0 || w==0){
            return 0;
        }

        int[][] grid = new int[n+1][w+1];
        for(int i = 0;i<= w;i++){
            grid[0][i] =  0;
        }
        for(int i = 0;i<= n;i++){
            grid[i][0] =  0;
        }

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<= w;j++){
                if(wt[i-1] <= j){
                    grid[i][j] =  Math.max(val[i-1]+ grid[i-1][j-wt[i-1]], grid[i-1][j]);
                }else{
                    grid[i][j] = grid[i-1][j];
                }
            }
        }

        return grid[n][w];

    }
    public static void main(String[] args) {
       // int value = knapSackRecursive(4, new int[]{4,5,1}, new int[]{1,2,3}, 3);
        int value = knapSackDP(4, new int[]{4,5,1}, new int[]{1,2,3}, 3);

        System.out.println(" value "+ value);
    }
}
