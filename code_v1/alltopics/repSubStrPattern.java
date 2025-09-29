package alltopics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class repSubStrPattern {
    public static boolean repeatedSubstringPattern(String s) {
        char [] ca = s.toCharArray();
        int beg = 0, end = 0;
        int i =0;
        for( i = 1;i<ca.length;){
            if(ca[i]!= ca[beg]){
                end = i;
                i++;
            }else{
                int temp = beg;
                while(i<ca.length ){
                    if(beg>end){
                        end = i-1;
                        break;
                    }
                    if(ca[beg]== ca[i]){
                        beg++;
                        i++;
                    }else{
                        beg = temp;
                        end = i;
                        //i;
                        break;
                    }
                }
            }
        }
        if(beg>=end && i > ca.length ){
            return true;
        }
        return false;
    }

    public static void findAllPer(String str){
        List<String> perms = new ArrayList<>();
        char [] ca =str.toCharArray();
        bt(ca, 0, perms);

        System.out.println(" ans "+ perms);
    }

    private static void bt(char[] ca, int start, List<String> perms) {
        if(start ==ca.length){
            perms.add(String.valueOf(ca));
        }

        for(int i = start ;i<ca.length;i++){
            // swap char [i] with char[start]
            char tmp = ca[i];
            ca[i] = ca[start];
            ca[start] = tmp;

            bt(ca, start+1, perms);

            tmp = ca[i];
            ca[i] = ca[start];
            ca[start] = tmp;

            // swap char [start] with char[i]
        }
    }

    public static String findSmallestWind(String txt, String patt){
        String ans = "";
        HashMap<Character, Integer> hs = new HashMap<>();
        for(char c: patt.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0)+1);
        }

        int end = 0, beg = 0, n = txt.length();

        while(end<n){

        }

        return ans;
    }
    public static void main(String[] args) {
        //System.out.println(" is repeated pattern found "+repeatedSubstringPattern("abab"));
        //findAllPer("boat");
        System.out.println(findSmallestWind("timetopractice", "toc"));
    }
}
