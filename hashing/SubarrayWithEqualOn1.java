package hashing;

import java.util.HashMap;

public class SubarrayWithEqualOn1 {

    // return the number of subarrays with equal 0s and 1s
    public static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int ans = 0;

        for(int i = 0 ;i<n;i++){
            if(arr[i]==0){
                arr[i] = -1;
            }
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        int prefixsum = 0;
        for(int i = 0;i<n;i++){

            prefixsum+= arr[i];
            if(prefixsum==0){
                ans++;
            }
            if(!hm.containsKey(prefixsum)){
                hm.put(prefixsum, 1);
            }else{
                ans += hm.get(prefixsum);
                hm.put(prefixsum, hm.get(prefixsum)+1);

            }
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(countSubarrWithEqualZeroAndOne(new int[]{1,0,0,1,0,1,1}, 7));

    }
}
