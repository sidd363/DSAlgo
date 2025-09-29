package arrays;

public class LongestOnesCone111 {
    public static  int longestOnes(int[] nums, int k) {

        int end = 0, beg = 0;
        int n = nums.length;
        int max = 0;
        int kt = 0;
        while(end<n){
            if(nums[end] == 1){
                end++;
                max = Math.max(end-beg, max);
            }else{
                if( kt<k){
                    kt++;
                    end++;
                    max = Math.max(end-beg, max);

                }else{
                    while(kt>=k && beg<end){
                        if(nums[beg]==0){
                            kt--;
                            beg++;
                        }else {
                            beg++;
                        }
                    }
                    max = Math.max(end-beg, max);
                    //end++;


                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));

    }
}
