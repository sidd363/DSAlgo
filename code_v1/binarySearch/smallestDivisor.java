package binarySearch;

public class smallestDivisor {


    public static int smallestDivisor(int[] nums, int threshold) {
        int ans = 0;
        int low = 1;
        int high = 0;
        for(int i :nums){
            high += i;
        }
        while(low<= high){
            int mid = low+(high-low)/2;

            if(checkDivisiorSum(nums, mid, threshold)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean checkDivisiorSum(int[] nums, int mid, int threshold) {
        int divisorsum = 0;

        for(int i = 0;i<nums.length;i++){
            int q = nums[i]/mid;
            int r = nums[i]%mid;
            if(r !=0){
                q++;
            }
            divisorsum+= q;
        }
        if(divisorsum <= threshold){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int []{19}, 5));
    }
}
