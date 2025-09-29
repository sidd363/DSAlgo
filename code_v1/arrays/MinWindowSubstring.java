package arrays;


/*Given two strings s and t of lengths m and n respectively, return the minimum window substring of s
        such that every character in t (including duplicates) is included in the window.
        If there is no such substring, return the empty string "".

        The testcases will be generated such that the answer is unique.

        A substring is a contiguous sequence of characters within the string.*/


import java.util.HashMap;

public class MinWindowSubstring {

    public static String minWindow(String s, String t) {
        String ans = "";
        HashMap<Character, Integer> pattern = new HashMap<>();
        for(char c : t.toCharArray()){
            pattern.put(c, pattern.getOrDefault(c, 0)+1);
        }
        int pl = pattern.size();
        int end = 0;
        int beg = 0;

        int n = s.length();
        int maxLen = n;

        while(end<n){
            char curr = s.charAt(end++);

            if(pattern.containsKey(curr)){

                pattern.put(curr, pattern.get(curr)-1);
                if(pattern.get(curr) == 0){
                    pl--;
                }

                while (pl == 0 ) {
                    int currLen = end - beg;
                    if (currLen < maxLen) {
                        maxLen = currLen;
                        ans = s.substring(beg, end);
                    }
                    if (pattern.containsKey(s.charAt(beg))) {
                        pattern.put(s.charAt(beg), pattern.get(s.charAt(beg))+1);

                        if(pattern.get(s.charAt(beg)) == 1){
                            pl++;
                        }
                    }
                    beg++;

                }
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(" longest window  substring is: "+ minWindow("ADOBECODEBANC", "ABC"));
    }

}
