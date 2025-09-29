package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class subarrSumLessThank {
   /* Given an array A of N non-negative numbers and you are also given non-negative number B.

    You need to find the number of subarrays in A having sum less than B. We may assume that there is no overflow.

    Return an integer denoting the number of subarrays in A having sum less than B.



            Example Input
    Input 1:

    A = [2, 5, 6]
    2
    2,5
    5
    6

    B = 10 op = 4
    Input 2:

    A = [1, 11, 2, 3, 15]
    B = 10*/


    public static int solve(ArrayList<Integer> arr, int k) {
        int ans = 0;
        int low = 0, high = 0, n = arr.size();
        int sum = 0;
        while(high<n){
            sum += arr.get(high++);
            if(sum < k){
                ans = ans + (high- low);
            }else{
                while(sum >=k && low<high){
                    sum = sum - arr.get(low);
                    low++;
                }
                if(low == high){
                     sum = 0;
                }
                if(sum != 0){
                    ans =  ans + (high- low);
                }
            }


        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 11, 2, 3, 15)), 10));
    }

}
