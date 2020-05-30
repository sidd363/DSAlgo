package twoPointers;



//Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
//Example: 
//
//Input: s = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: the subarray [4,3] has the minimal length under the problem constraint. 
// negatives not allowed
public class minSubSum {
    public static  int minSubArrayLen(int s, int[] nums) {
    	    int res = Integer.MAX_VALUE,i = 0, sum =0, j=0;
    	   
        if(nums.length<1){
            return 0;
        }
        for( j =0;j<nums.length;j++) {
        	    sum+=nums[j];
        	    
        	    while(sum>s) {
        	    	   res = Math.min(res, j-i+1);
        	    	      sum-=nums[i++];
        	    }
        	    
        }
        return res = res!=Integer.MAX_VALUE ? res: 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ans  "+ minSubArrayLen(6, new int[]{ 10,2, 3}));
	}

}
