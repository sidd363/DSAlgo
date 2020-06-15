package binarySearch;

public class searchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int pos = 0;

        int l = 0 , h = nums.length-1;

        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m] == target){
                return m;
            }
            if((nums[m] < target && m+1 < nums.length && nums[m+1]>target) || (nums[m] < target && m+1 ==  nums.length)){
                return m+1;
            }
            if(nums[m]>target && m ==0){
                return 0;
            }

            if(nums[m]>target){
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int [] a = {1};
        System.out.println(searchInsert(a, 1));
    }
}
