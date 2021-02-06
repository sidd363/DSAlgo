package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSortedVowelStrings {
    public static int countVowelStrings(int n) {
        int ans = 0;
        List<String> source = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        List<String> sortedStrings = new ArrayList<>();

        bt(source, sortedStrings, 0, n, new StringBuilder(""));
        return sortedStrings.size();
    }

    private static void bt(List<String> source, List<String> sortedStrings, int i, int n, StringBuilder sb) {
        if(sb.length()==n){
            sortedStrings.add(sb.toString());
            return;
        }else if(sb.length()>n){
            return;
        } else{
//            if(sb.length()<n && sb.length()>0){
//                sortedStrings.add(sb.toString());
//            }
            for(int index = i ; index< source.size();index++){

                sb.append(source.get(index));
                bt(source, sortedStrings, index, n, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }

    }

    public static void main(String[] args) {
        countVowelStrings(33);
    }
}
