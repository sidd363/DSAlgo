

//
//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
//
//A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//
//
//
//Example:
//
//Input: "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
import java.util.*;
public class lc17 {
    public static List<String> letterCombinations(String digits) {
    	List<String>  ans = new ArrayList<String>();
    	
    	//logic
    	
    	HashMap<String,String> hm = new HashMap<>();
    	hm.put("2", "abc");
    	hm.put("3", "def");
    	hm.put("4", "ghi");
    	hm.put("5", "jkl");
    	hm.put("6", "mno");
    	hm.put("7", "pqrs");
    	hm.put("8", "tuv");
    	hm.put("9", "wxyz");
    	
    	
    	String[] wordsArr = new String[digits.length()];
    	for(int i = 0;i<digits.length();i++) {
    		wordsArr[i]= hm.get(""+digits.charAt(i));
    	}
    	bt(wordsArr, 0,"",ans,digits.length());
    	
    	
    	return ans;
    }
    public static void bt(String[] wordsArr, int start, String res,List<String>  ans, int l) {
    	System.out.println(" start "+ start+ " res "+ res);
    	
    	
    	if(res.length()>=l) {
    		System.out.println(" res each "+ res);
    		ans.add(res);
    		return;
    	}else {
    		//for(int j=start;j<l;) {
    		if(start<l) {
    			String up = wordsArr[start];
    			for(int i =0; i<up.length(); i++) {
    				String tmp = res;
    				 res = res+up.charAt(i); 
    				bt(wordsArr, start++, res, ans, l);
    				res = tmp;
    				
    			}
    		}else {
    			return;
    		}
    		//}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("23"));
	}

}
