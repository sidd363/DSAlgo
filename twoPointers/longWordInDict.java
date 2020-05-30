package twoPointers;
import java.util.*;

public class longWordInDict {
	public static String findLongestWord(String s, List<String> d) {
	        String ans = "";
	        for(String each :d) {
	        	    int j=0;
	        		for(int i = 0;i<s.length();i++) {
	        			if(j<each.length() && s.charAt(i)==each.charAt(j) ) {
	        				j++;
	        			}
	        		}
	        		if(j==each.length() && ans.length()<j) {
	        			ans = each;
	        		}
	        }
	        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ans "+findLongestWord("abpcplea",new ArrayList<String>( 
				Arrays.asList("z", 
	                    "q", 
	                    "d"))));
	}

}
