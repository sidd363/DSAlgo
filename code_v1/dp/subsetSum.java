package dp;

public class subsetSum {
    public static boolean findPartition(int[] a, int n) {
        // code here
        int sum = 0;
        for(int i :a){
            sum+= i;
        }
        if(sum%2!=0){
            return  false;
        }
        sum = sum/2;

        boolean[][] t = new boolean[n+1][sum+1];
        t[0][0] = true;
        for(int i = 1;i<=sum;i++){
            t[0][i] = false;
        }
        for(int i = 1;i<=n;i++){
            t[i][0] = true;
        }
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sum; j++){
                if(a[i-1]<=j){
                    t[i][j] = t[i-1][j] || t[i-1][j-a[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        System.out.println( "subset sum exists or not "+findPartition(new int[]{1,5,3}, 3));
    }
}
