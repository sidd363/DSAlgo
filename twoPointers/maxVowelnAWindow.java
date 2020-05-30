package twoPointers;

import java.util.HashSet;

public class maxVowelnAWindow {
	
    public static int maxVowels(String s, int k) {
        int ans = 0;
        int l = s.length();
        
        HashSet<Character> hs = new HashSet<Character>();
        hs.add('a');hs.add('e');hs.add('i');hs.add('o');hs.add('u');
        
        int beg = 0;
        int end = 0;
        char [] ca = s.toCharArray();
        int count = 0;
        while(end<l) {
        	
        	char c = ca[end];
        	if(hs.contains(c)) {
        		count++;
        	}
        	end++;
        	if(end-beg == k) {
        		// update ans 
        		ans = Math.max(ans, count);
        		if(ans == k) {
        			return ans;
        		}
        		char cb = ca[beg];
            	if(hs.contains(cb)) {
            		count--;
            	}
            	beg++;
        	}
        	
        }
        
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// s = "abciiidef", k = 3
		System.out.println(maxVowels("abciiidef", 3));
	}

}
