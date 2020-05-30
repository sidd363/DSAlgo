package backtracking;
import java.util.*;
public class permuation {
    public static  boolean checkInclusion(String s1, String s2) {
        //find all perm of s1 and check if it is substr of s2
    	ArrayList<String> ans = new ArrayList<String>();
    	permute(s1, 0 , s1.length()-1, ans);
    	//System.out.println(" ans "+ ans);
    	for(String s : ans) {
    		if(s2.indexOf(s)>-1) {
    			return true;
    		}
    	}
    	return false;
    }
	private static void permute(String s1, int l, int r, ArrayList<String> ans) {
		
		// TODO Auto-generated method stub
		if(l==r) {
			ans.add(s1);
			return;
		}
		for(int i = l;i<=r;i++) {
			s1 = swap(s1, i, l);
			permute(s1, l+1, r, ans);
			s1 = swap(s1, i, l);
		}
		
		
	}
	private static String swap(String a, int i, int j) {
		// TODO Auto-generated method stub
		char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub  "prosperity"
	
		System.out.println(" perumations "+ checkInclusion("prosperity", "properties"));
	}

}
