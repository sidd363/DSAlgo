package arrays;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> al = new ArrayList<>();
        int end = 0;
        int n = nums.length;
        int curr_max = Integer.MIN_VALUE;
        int beg =0;
        while(end<n){
            if(end<k-1){
                curr_max = Math.max(curr_max, nums[end]);

            }else{
                if(al.size()==0) {
                    curr_max = Math.max(curr_max, nums[end]);

                    al.add(curr_max);
                }else{
                    int newOne= nums[end];
                    if(curr_max == nums[beg]){
                        if(curr_max<=newOne){
                            curr_max = newOne;
                            al.add(curr_max);
                            beg = end;
                            end++;
                            continue;
                        }else{
                            int tmp = Integer.MIN_VALUE;
                            for(int i = beg ; i<beg+k; i++){
                                if(nums[i]>=tmp){
                                    tmp = nums[i];
                                    beg = i;
                                }
                            }
                            curr_max = tmp;
                            al.add(curr_max);
                        }
                    }else{
                        curr_max = Math.max(curr_max, nums[end]);

                        al.add(curr_max);
                        beg =  end - k +1;
                    }
                }

            }

            end++;
        }






        int [] ans = new int[al.size()];
        int i = 0;
        for(Integer ele : al){
            ans[i++] = ele;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] input = {1,3,-1,-3,5,3,6,7};
        int k =3;
        int [] ans =maxSlidingWindow(input, k);
        for(int i : ans){
            System.out.print(" each \t"+i );
        }
    }
}
