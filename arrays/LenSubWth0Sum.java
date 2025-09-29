package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LenSubWth0Sum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        // Write your code here.
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;

        for(int i = 0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum == 0){
                ans = Math.max(ans, i+1);
            }
            if(hm.containsKey(sum)) {
                ans = Math.max(ans, i - hm.get(sum));
            }else
            hm.put(sum, i);

        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0 ,15, 66, -66, -15, -36, 43, -41, 36, 13, 25, -52, 52, 28, -56, 26, 19, -17, 0, 52, 20, 24, -44
        ));
        System.out.println(LongestSubsetWithZeroSum(list));


    }
}
