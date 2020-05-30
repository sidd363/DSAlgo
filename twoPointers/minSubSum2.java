package twoPointers;

public class minSubSum2 {
	public static  int minSubArrayLen(int s, int[] nums) {
	    int res = Integer.MAX_VALUE,i = 0, sum =0, j=0;
	   
	    for( j =0;j<nums.length;j++) {
	    	    sum+=nums[j];
	    	    
	    	    while(sum>=s) {
	    	    	   res = Math.min(res, j-i+1);
	    	    	      sum-=nums[i++];
	    	    }
	    	    
	    }
	    i = nums.length-1;
	    sum = 0;
	    for( j =nums.length-1;j>=0;j--) {
    	    sum+=nums[j];
    	    
    	    while(sum>=s) {
    	    	res = Math.min(res, i-j+1);
    	        sum-=nums[i--];
    	    }
    	    
        }
	    return res = res!=Integer.MAX_VALUE ? res: -1;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println(" ans  "+ minSubArrayLen(89, new int[]{ -28,81,-20,28,-29}));
}

}
