package arrays;

import java.util.*;

public class LC2784 {
    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;

        if(nums[l-1] != nums[l-2]){
            return false;
        }
        if(nums[l-1] == nums[l-2] && nums[l-1] != l-1){
            return false;
        }

        for(int i = l-3; i>=0; i--){
            if(nums[i] != i+1){
                return false;
            }
        }

        return true;

    }
    public static String sortVowels(String s) {
       char [] ca = s.toCharArray();

        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');


        List<Character> vowels  = new ArrayList<>();
        for(char c : ca){
            if(set.contains(c)){
                vowels.add(c);
            }
        }
        if(vowels.size()==0){
            return s;
        }
        Collections.sort(vowels);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(char c : ca){
            if(set.contains(c)){
                sb.append(vowels.get(i++));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        //int[] nums= {1,1};
        //System.out.println(isGood(nums));

        String sorted = sortVowels("aeiouAEIOU");
        System.out.println("sorted vowels "+ sorted);
    }
}
