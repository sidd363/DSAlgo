package twoPointers;
import java.util.*;
public class balancedStr {
    public static int balancedString(String s) {
        
        HashMap<Character, Integer> hm = new HashMap();
        int l = s.length();
        int opt = l/4;
        int ans = 0;
        
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        
        
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            if(entry.getValue() > opt){
                ans += entry.getValue()-opt;
            }
        }
        
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(" balced len "+balancedString("WWEQERQWQWWRWWERQWEQ"));
	}

}
