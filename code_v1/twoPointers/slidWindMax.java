package twoPointers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class slidWindMax {
    public static  int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        //int [] nums = {5,4,-1,3,5,3,6,7}; k = 3
        int end = 0, beg = 0;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int winLen = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        while(end < nums.length){
            pq.add(nums[end]);
            /*if(nums[end] >max){

                max = nums[end];
                if(secMax == Integer.MIN_VALUE){
                    secMax = max;
                }
            }
            if(nums[end] >secMax) {
                secMax = nums[end];
            }*/
            winLen++;
            end++;
            if(winLen == k){
                winLen--;
                int begN = nums[beg];
                //System.out.println(" pq "+ pq);
                ans.add(pq.peek());
                pq.remove(begN);
               /* System.out.println(" sec max "+ secMax + " max --"+ max);
                if(begN==max){
                    // max will be sec max
                    max = secMax;
                }*/
                beg++;

            }
        }




        // ans construction
        int [] res = new int[ans.size()];
        int ansSize = 0;
        for(int i : ans){
            res[ansSize++] = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {5,4,-1,-3,5,3,6,7};
        int k = 3;
        int [] ans = maxSlidingWindow(nums, k);
        for(int i : ans){
            System.out.println( "max in each window "+ i);
        }
    }
}
