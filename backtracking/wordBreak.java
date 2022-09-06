package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class wordBreak {
    public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
        // Write your code here.
        ArrayList<String> ans = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for (String word: dictionary
        ) {
            hs.add(word);
        }


        // put partitions at every place only when substr till that index is found at
        util(0, hs, s, ans, "");
        return  ans;
    }

    private static void util(int index, HashSet<String> hs, String s, ArrayList<String> ans, String path) {
        if(index >= s.length()){
            ans.add(path);
            return;
        }
        for(int i = index;i< s.length();i++){
            String sub = s.substring(index, i+1);

            if(hs.contains(sub)){
                String prev = path;
                if(path.length() != 0)
                path= path + " "+sub;
                else{
                    path= sub;

                }

                util(i +1, hs, s, ans, path);
                path = prev;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("god", "is", "now", "no", "where", "here"));
        String s = "godisnowherenowhere";
        ArrayList<String> words = wordBreak(s, dictionary);
        for (String word: words
             ) {
            System.out.println("each possible sentence is: "+word);

        }
    }
}
