package alltopics;

import java.util.HashMap;

public class croak {
    public static int minNumberOfFrogs(String croakOfFrogs) {
        int [] ca = new int[26];
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('c', 0);
        hm.put('r', 1);
        hm.put('o', 2);
        hm.put('a', 3);
        hm.put('k', 4);

        int co=1;


        for(char c: croakOfFrogs.toCharArray()){
            int index = hm.get(c);
            if(index != 0){
                char prev = "croak".charAt(index-1);
                // check its freq it must be greater than it
                int prevFreq = ca[prev-'a'];
                ca[c-'a']++;
                if(prevFreq< ca[c-'a']){
                    return -1;
                }
            }else{


                if( ca['c'-'a'] > ca['k'-'a']){
                    co++;
                }
                ca[c-'a']++;
            }

        }


        return co;
    }
    public static void main(String[] args) {
        System.out.println(minNumberOfFrogs("crcroaoakk"));
    }
}
