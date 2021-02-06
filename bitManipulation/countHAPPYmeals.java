package bitManipulation;

import java.util.HashMap;
import java.util.Map;

public class countHAPPYmeals {
    public static int countPairs(int[] deliciousness) {
        int ans = 0;
        int mod =(int) Math.pow(10, 9)+ 7;
        for (int i = 0;i<deliciousness.length-1;i++){
            for(int j = i+1;j<deliciousness.length;j++){
                int sum = (deliciousness[i]%mod)+(deliciousness[j]%mod);
                if(sum!=0 && ((sum&(sum-1)) == 0)){
                        ans++;
                        ans = ans%mod;
                }
            }
        }
        return ans;
    }

    public static int countPairsUsingHashMap(int[] deliciousness) {
        int ans = 0;
        int mod =(int) Math.pow(10, 9)+ 7;
        Map<Integer, Integer>  hm = new HashMap<>();

        for (int i = 0;i<deliciousness.length-1;i++){
            int prod = 1;
            for(int j = 0;j<22;j++){
                if(hm.containsKey(prod- deliciousness[i])){
                    ans+= hm.get(prod-deliciousness[i]);
                    ans = ans % mod;
                }
                prod = prod*2;
            }
            hm.put(deliciousness[i], hm.getOrDefault(deliciousness[i], 0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1,3,5,7,9}));
    }
}
