package twoPointers;

import java.util.Arrays;
//https://leetcode.com/problems/frequency-of-the-most-frequent-element/discuss/1175088/C%2B%2B-Maximum-Sliding-Window-Cheatsheet-Template!
public class freqOfMostFreqLC_1838 {
    public static int maxFrequency(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int i = 0, j=0, l= nums.length;
        int sum = 0;
        for(;j<l;){
            sum+= nums[j];
            while(i<j && (j-i+1) * nums[j] - sum >k){
                sum = sum - nums[i];
                i++;
            }
            ans = Math.max(j-i+1, ans);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[]{2,2,2,2}, 5));
    }
}
