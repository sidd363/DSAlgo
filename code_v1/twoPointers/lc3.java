package twoPointers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// Longest Substring Without Repeating Characters
public class lc3 {
	
	public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        if(s.length()<=1) {
        	return s.length();
        }
        
        int begin =0, end = 0;
        HashSet<Character> hm = new HashSet<Character>();
        while(end < s.length()) {
        	char c = s.charAt(end);
        	if(!hm.contains(c)) {
        		hm.add(c);
        		ans = Math.max(ans, hm.size());
        	}else {
        		while(begin!=end) {
        			char tmp = s.charAt(begin++);
        			//System.out.println(" tmp "+ tmp);
        			
        			if(tmp == s.charAt(end)) {
        				break;
        			}
        			hm.remove(tmp);
        			
        		}
        	}
        	end++;
        }
        return ans;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("aa"));

	}

}
