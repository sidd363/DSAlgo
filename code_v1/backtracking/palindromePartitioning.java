package backtracking;
import java.util.*;
public class palindromePartitioning {
	
	public List<List<String>> partition(String s) {
		List<List<String>> ans = new ArrayList< List<String>>();
		List<String> tmp = new ArrayList<String>();
	    dfs(ans, tmp, 0, s);
		return ans;
	}
	private void dfs( List<List<String>> ans, List<String> tmp, int index, String word) {
		// TODO Auto-generated method stub
		if(index >= word.length()) {
			ans.add(new ArrayList<String>(tmp));
			return;
		}
		for(int i = index; i< word.length();i++) {
			String sub ="";
			
			
		    if(i==index) {
		    	sub = word.charAt(index)+"";
		    }else {
		    	sub= word.substring(index, i+1);
		    }
			//check for palindrome
			
			if(ispal(sub)) {
				tmp.add(sub);
				dfs(ans, tmp, i+1, word);
				
				tmp.remove(tmp.size()-1);
			}
		}
		
	}
	private boolean ispal(String sub) {
		// TODO Auto-generated method stub
		int low = 0, high = sub.length();
		if(low==high) return true;
		while(low<high) {
			if(sub.charAt(low)!=sub.charAt(high-1)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromePartitioning obj = new palindromePartitioning();
		System.out.println(obj.partition("ababababababababababababcbabababababababababababa"));
	}

}
