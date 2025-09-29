package twoPointers;

public class maxConsOnes2025_2 {
    public static int longestOnes(int[] nums, int k) {
        int max = 0, curr =0, st =0, tmp = 0;
        while(curr< nums.length){
            if(nums[curr] == 0){
                while(tmp==k) {
                   if(nums[st++] == 0){
                       tmp--;
                   }
                }
                tmp++;
            }
            curr++;
            max = Math.max(max, curr-st);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {1,0, 0, 0, 1, 0, 1, 1, 1, 1, 1};
        System.out.println(" ans "+ longestOnes(nums, 3));
    }
}
