package backtracking;
import java.util.*;
public class happyStr {
    public static String getHappyString(int n, int k) {
    	char [] ar = {'a','b','c'};
    	ArrayList<String> ans = new ArrayList<String>(); 
    	
    	backtrack(ans, "", n, ar);
    	
    	//System.out.println(" ans "+ ans);
    	//Collections.sort(ans);
    	
        return ans.size()>=k ? ans.get(k-1) : "";
    }
	private static void backtrack(ArrayList<String> ans, String str, int n, char [] ar) {
		// TODO Auto-generated method stub
		if(str.length()== n) {
			ans.add(str);
			return;
		}
		
		for(int i = 0; i<ar.length; i++) {
			String tmp = str;
			str += ar[i]+"";
			if(str.length()>=2 && str.charAt(str.length()-1)==str.charAt(str.length()-2)) {
				str = tmp;
				continue;
			}
			backtrack(ans, str, n, ar);
			
			str = tmp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHappyString(10, 100));
	}

}
