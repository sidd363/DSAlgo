package binarySearch;

public class splitArrLargestSum {
    public static int splitArray(int[] nums, int m) {
        long ans = 0;
        long low = 0;
        long high = 0;
        for(int i : nums){
            low = Math.max(low, i);
            high+=i;
        }
        while (low<=high){
            long mid = low+(high-low)/2;
            if(check(nums, m , mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return (int)ans;
    }

    private static boolean check(int[] nums, int m, long mid) {
        int group = 1;// by default group starts with 1
        int sum = 0;
        for(int i :nums){
            sum+=i;
            if(sum> mid){
                sum = i;
                group++;
                if(group > m){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{7,2,5,10,8}, 2));
    }
}
