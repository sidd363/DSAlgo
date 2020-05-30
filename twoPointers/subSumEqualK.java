package twoPointers;
import java.util.*;
public class subSumEqualK {
    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        
        int sum = 0;
        for(int i: nums) {
        	sum+= i;
        	
        	if(hm.containsKey(sum - k)) {
        		ans+= hm.get(sum-k);
        	}
        	
        	hm.put(sum, hm.getOrDefault(sum, 0)+1);
        	
        	
        }
        return ans;
        
        // this will work when all elements are positive
//        while(right<=l) {
//        	sum += nums[right];
//        	if(sum == k) {
//        		ans++;
//        		right++;
//        	}else if(sum>k) {
//        		right++;
//        		while(sum > k && k>0 ) {
//        			if(left <right ) {
//	        			sum = sum - nums[left++];
//	        			if(sum==k){
//	        				ans++;
//	        			}
//        			}
//        		}
//        	}else {
//        		right++;
//        	}
//        }   return ans;
        
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum(i, j) = sum(0,j) - sum(0, i);
		System.out.println(subarraySum(new int[] {1,-1,1}, -1 ));
	}

}
