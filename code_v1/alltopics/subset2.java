import java.util.*;

public class subset2 {
	
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	List<List<Integer>>  ans = new ArrayList<List<Integer>>();
    	List<Integer> tmp = new ArrayList<Integer>();
    	Arrays.sort(nums);
    	
    	bt(ans, tmp, nums, 0, new boolean[nums.length]);
    	return ans;
    	
    }
	private void bt(List<List<Integer>> ans, List<Integer> tmp, int[] nums, int s, boolean [] used) {
		// TODO Auto-generated method stub
		ans.add(new ArrayList<Integer>(tmp));
		for(int i =s;i<nums.length;i++) {
			//duplicate remove
			if(used[i] || (i>0 && nums[i]==nums[i-1]&& !used[i-1])) {
				continue;
			}
			used[i]=true;
			tmp.add(nums[i]);
			bt(ans, tmp, nums, i+1, used);
			used[i]=false;
			tmp.remove(tmp.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subset2 ob = new subset2();
		int [] nums = {1,2,2};
		System.out.println(ob.subsetsWithDup(nums));
	}

}
