package strings;

import java.util.HashSet;

public class LongestSubstrWithOutRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {
        int beg = 0;
        int len = 0;
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0;i< s.length();i++){
            char c = s.charAt(i);
            if(hs.contains(c)){
                while(s.charAt(beg++) != c){
                    hs.remove(s.charAt(beg-1));
                    continue;
                }
            }else{
                hs.add(c);
            }
            len = Math.max(i-beg+1, len);
        }
        return len;

    }
    public static void main(String[] args) {
        System.out.println(" longest len: "+ lengthOfLongestSubstring("tmmzuxt"));
    }
}
