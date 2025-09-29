package dp;

public class distinctOccurence {
    public static int  subsequenceCount(String S, String T)
    {
        // Your code here
        // ban ban
//        for(int[] inner : dp) {
//            Arrays.fill(inner, -1);
//        }
//        int ans = 0;
        int [][] dp = new int[S.length()+1][T.length()+1];

        int n1 = S.length();
        int n2= T.length();
        for(int i = 0;i<n1; i++){
            dp[i][0] = 1;
        }


        for(int i = 1 ; i<=n1;i++){
            for(int j = 1 ; j<=n2;j++){
                int tk = 0;
                int ntk = 0;
                if(S.charAt(i-1) == T.charAt(j-1)){
                    tk = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    ntk = dp[i-1][j];
                }
                dp[i][j] = (tk + ntk) % 1000000007;
            }

        }
        //ans =  f(S.length()-1, T.length()-1, S,T, dp);
        return dp[n1] [n2];
    }
    static int f(int ind1, int ind2,String  s,String p, int[][] dp){
        if(ind2 < 0 ){
            return 1;
        }
        if(ind1 <0){
            return 0;
        }
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        int tk = 0;
        int ntk = 0;
        if(s.charAt(ind1) == p.charAt(ind2)){
            tk = f(ind1-1, ind2-1, s, p, dp) + f(ind1-1, ind2, s, p, dp);
        }else{
            ntk = f(ind1-1,  ind2, s, p, dp);
        }
        return dp[ind1][ind2] = (tk + ntk) % 1000000007;
    }
    public static void main(String[] args) {
        System.out.println( "SUB SEQ COUNT "+subsequenceCount("banana", "ban"));
        System.out.println( "SUB SEQ COUNT "+subsequenceCount("nwnk", "n"));

    }
}
