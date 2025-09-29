package dp;

public class particles {
    public static int particleVelocity(int[] particles) {
        // WRITE YOUR BRILLIANT CODE HERE
        int n = particles.length;
        int [] dp = new int[n];

        if(n<3){
            return 0;
        }
        dp[0]=dp[1]=0;
        int diff = particles[1]-particles[0];
        int count = 0;
        for(int i = 2; i<n; i++){

            if(diff == (particles[i] - particles[i-1] )){

                count++;
                dp[i] = dp[i-1] + count;
            }else{
                dp[i] = dp[i-1];
                diff = particles[i] - particles[i-1];
                count = 0;
            }
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(" num " +  particleVelocity(new int[]{1,3,5,7,9}));

    }
}
