package twoPointers;
import java.util.*;

public class allanagrams {
	
    public static List<Integer> findAnagrams(String s, String p) {
    	List<Integer> ans = new ArrayList<Integer>();
    	
    	// "cbaebabacd", "abc"
    	
    	if(p.length() > s.length() || s.length() ==0 || p.length()==0) {
    		return ans;
    	}
    	
    	Map<Character, Integer> hm = new HashMap<Character, Integer>();
    	
    	for(char c: p.toCharArray()) {
    		hm.put(c, hm.getOrDefault(c, 0)+1);
    	}
    	int sl = s.length();
    	int pl = hm.size();
    	//System.out.println(pl+ " hm "+ hm);
    	int begin = 0 , end = 0;
    	
    	while(end<sl) {
    		char c = s.charAt(end);
    		if(hm.containsKey(c)) {
    			hm.put(c, hm.get(c)-1);
    			if(hm.get(c)==0) {
    				pl--;
    			}
    		}
    		
    		
    		end++;
    		while(pl==0) {
    			char bc = s.charAt(begin);
        		if(hm.containsKey(bc)) {
        			//System.out.println(" bc "+bc + " pl " + pl);
        			hm.put(bc, hm.get(bc)+1);
        			if(hm.get(bc)>0) {
        				pl++;
        			}
        			//System.out.println(" bc after "+bc + " pl " + pl);
        		}
        		
        		if(end - begin == p.length()) {
        			ans.add(begin);
        		}
        		begin++;
    		}
    		
    		
    	}
    	
    	
    	return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" find ana "+ findAnagrams("cbbaebabacd", "abb"));
	}

}
