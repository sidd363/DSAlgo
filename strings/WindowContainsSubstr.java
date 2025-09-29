package strings;

import java.util.HashMap;

public class WindowContainsSubstr {
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        String ans = "";
        // algo
        /*1.dictionary of p with their freq
        2.keep two pointers end, begin with 0;
        3.if char is there in dictionay dec its freq, even make the freq to zero,when freq is zero decrement required chars in ans substring to 0
        4. until reqDistinctChar==0  forward begin pointer till end and mark ans and remake dictionary */
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : p.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        int reqDistinctChar = hm.size();
        int end = 0, begin = 0;

        int ls = s.length();
        int minWindowLen = Integer.MAX_VALUE;
        while(end<ls){
            char c = s.charAt(end);
            if (hm.containsKey(c)) {
                int freq = hm.get(c);
                hm.put(c, freq - 1);
                if (freq - 1 == 0) {
                    reqDistinctChar--;
                }
            }
            end++;


            while(reqDistinctChar == 0){
                 char charAtBegin = s.charAt(begin);
                 // update dictionary
                if(hm.containsKey(charAtBegin)){
                    int freq = hm.get(charAtBegin);
                    hm.put(charAtBegin, freq + 1);
                    if(freq+1>0)
                        reqDistinctChar++;
                }
                 // update ans if that window is of minimum length
                if(minWindowLen > end-begin){
                    minWindowLen = end-begin;
                    ans = s.substring(begin, end);
                }
                begin++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("min window substring --->>> " +WindowContainsSubstr.smallestWindow("timetopractice", "toc"));
    }
}
