package backtracking;

import java.util.ArrayList;
import java.util.List;

public class letterCombinationsOfPhone {
    static String [] phoneWords = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        util(ans, 0, "", digits);
        return ans;
    }

    private static void util(List<String> ans,  int index, String curr, String digits) {
        if(curr.length()== digits.length()){
            ans.add(curr);
            return;
        }
        String word = phoneWords[digits.charAt(index)-'0'];
        for(int i= 0;i<word.length();i++){
            char letter = word.charAt(i);
            util(ans, index+1, curr+letter, digits);
        }
    }
    public static void distinctComb(String word, int l){
        List<String> ans = new ArrayList<>();
        if(l==word.length()){
            System.out.println(" word"+ word);
            return;
        }
        bt(word,"", 0, l, ans);
        System.out.println(ans);
    }

    private static void bt(String word, String curr, int index, int l, List<String> ans) {
        if(curr.length()==l){
            ans.add(curr);
            return;
        }
        for (int i = index;i<word.length();i++){
//            if(i>index){
//                continue;
//            }
            bt(word,curr+ word.charAt(i), i+1, l, ans);
        }
    }

    public static void main(String[] args) {
        //System.out.println( letterCombinations("237"));
       distinctComb("abc", 3);
    }
}
