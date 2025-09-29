package twoPointers;

import java.util.Collections;
import java.util.PriorityQueue;

public class NonOverLapSubArrWthTargetSum {
    // [7,3,4,7] 7
    public static int minSumOfLengths(int[] arr, int target) {
        int ans = -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int beg = 0 , end = 0;

        int curr = 0;
        while(end<arr.length){
            curr+= arr[end++];
            if(curr ==target){
                pq.add(end-beg);
                if(pq.size()>2){
                    pq.poll();
                }
                beg = end;
                curr = 0;
            }else if(curr<target){
                continue;

            }else{
                while(curr > target){
                    curr =  curr - arr[beg++];
                    if(curr == target){
                        pq.add(end-beg);
                        if(pq.size()>2){
                            pq.poll();
                        }
                    }
                }
            }

        }
        if(pq.size()==2){
            ans = 0;
            while(pq.size()>0){
                ans+= pq.poll();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,6,1};
        System.out.println(minSumOfLengths(arr, 7));
    }

}
