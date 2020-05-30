
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<List<Integer>>  a=  subsets(new int[]{1,2,3});
		 System.out.println(" ANS "+ a);

	}
	
	    public static List<List<Integer>> subsets(int[] nums) {
	        ArrayList<List<Integer>>  ans = new ArrayList<List<Integer>> ();
	        
	        bt(nums, 0, new ArrayList<Integer> (),ans, new  HashSet < ArrayList<Integer>>());
	        return ans;
	        
	    }
	    public static  void bt(int [] a, int s, ArrayList<Integer> tmp, ArrayList<List<Integer>> ans, HashSet < ArrayList<Integer>> hs){
	        
	        if(!hs.contains(tmp)){
	            ans.add(new ArrayList<Integer>(tmp));
	            hs.add(new ArrayList<Integer>(tmp));
	        }
	        for(int i =s;i< a.length;i++){
	            tmp.add(a[i]);
	            bt(a, i+1, tmp, ans, hs);
	            tmp.remove(new Integer(a[i]));
	        }
	        
	        
	    }
	

}
