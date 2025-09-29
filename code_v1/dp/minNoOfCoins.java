package dp;

public class minNoOfCoins {
    public static long minimumNumberOfCoins(int coins[],int numberOfCoins,int value)
    {
        // your code here
        long[][] t = new long[numberOfCoins+1][value+1];
        for(int i = 0;i<=value;i++){
            t[0][i] = Integer.MAX_VALUE -1;
        }
        for(int i = 1;i<=numberOfCoins;i++){
            t[i][0] =  0;
        }
        for(int i = 1;i<= value;i++){
            t[1][i] = i%coins[0] ==0 ? i/coins[0]: Integer.MAX_VALUE -1 ;
        }

        for(int i = 2;i<=numberOfCoins;i++){
            for(int j = 1;j<= value;j++){
                if(coins[i-1]<=j){
                    t[i][j] = Math.min(t[i][j- coins[i-1]] + 1 , t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[numberOfCoins][value];
    }
    public static void main(String[] args) {
        int [] coins = new int[]{1, 4, 3};
        System.out.println(" min no of coins "+ minimumNumberOfCoins(coins, 3, 5));
    }
}
