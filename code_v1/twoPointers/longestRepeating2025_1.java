package twoPointers;

import java.util.HashSet;

public class longestRepeating2025_1 {
    public static int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        HashSet<Character>  hs = new HashSet<>();
        int curr = 0, st = 0;
        for(curr = 0;curr < s.length(); curr++){
            if(hs.contains(s.charAt(curr))){
                while(st<curr){
                    if(s.charAt(curr) == s.charAt(st)){
                        st++;
                        break;
                    }else{
                        hs.remove(s.charAt(st++));
                    }
                }
            }else{
                hs.add(s.charAt(curr));
            }
            max = Math.max(max, curr - st +1);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(" length of longest substring without repeating character is "+ lengthOfLongestSubstring("ABADEFEG"));
    }
}
