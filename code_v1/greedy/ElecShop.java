package greedy;

import java.util.Arrays;

public class ElecShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int count = 0;
        int ks = keyboards.length;
        int ds = drives.length;

        int tb = b;
        int csum = 0;
        for(int  i = ks-1;i>=0;i--) {

            for (int j = ds - 1; j >= 0; j--) {
                int tsum = keyboards[i] + drives[j];
                if (tsum<= tb) {
                    csum+= tsum;
                    count = Math.max(count, csum);
                    tb = tb - tsum;
                    tb = b;
                    csum = 0;
                    break;
                }else{
                    tb = b;
                    csum = 0;
                   // continue;
                }

            }
        }
        return count > 0 ? count : -1;

    }
    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3,1},new int[]{5,2,8},10 ));
    }
}
