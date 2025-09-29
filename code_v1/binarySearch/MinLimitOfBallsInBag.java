package binarySearch;

public class MinLimitOfBallsInBag {
    public static int minimumSize(int[] nums, int maxOperations) {
        int right =0;
        int low =1;
        for(int i :nums){
            if(i>right){
                right = i;
            }
        }
        int ans = Integer.MAX_VALUE;
        while(low<right){
            int mid = (low+right)/2;
            // calculate operations , if op is greater then we need to look in right half else in left half
            int ops = calculateOps(mid, nums, maxOperations);
            if(ops> maxOperations){
                low = mid+1;
                }else if(ops <= maxOperations){
                    ans = Math.min(ans, mid);

                    right = mid-1;
                }
            //

        }
        return ans;
    }

    private static int calculateOps(int mid, int[] nums, int maxOperations) {
        int tmp = 0;
        int max = -1;
        for(int i =0;i<nums.length;i++){
            if(maxOperations<tmp){
                return tmp;
            }
            if(nums[i] > mid){
                max = nums[i];
                while(max> mid && tmp <=maxOperations){
                    max = Math.max(mid, max-mid);
                    tmp++;
                }

                // here i need to break

            }
        }
        return  tmp;
    }

    public static void main(String[] args) {
        System.out.println(" minimumSize--- + "+minimumSize(new int[]{9}, 2 ));
    }
}
