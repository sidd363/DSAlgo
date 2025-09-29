package dp;

public class reachAScoreWays {
    public static int count(int sum, int [] ar)
    {
        //Your code here
        int [][] t = new int[ar.length+1][sum+1];
        int n = ar.length;
        for(int i = 1;i<=sum;i++){
            t[0][i] = 0;
        }
        for(int i = 0;i<=n;i++){
            t[i][0] = 1;
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=sum;j++){
                if(ar[i-1] <=j){
                    t[i][j] = t[i-1][j] + t[i] [j-ar[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];

    }
    public static void main(String[] args) {
        System.out.println(" total ways --->>>> "+ count(4, new int[]{3,2,1}));
    }
}
