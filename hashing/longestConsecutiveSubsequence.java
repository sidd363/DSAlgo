package hashing;

import java.util.HashSet;

public class longestConsecutiveSubsequence {
    public  static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        int ans = 0;

        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        int curr = 1;
        for(int i :arr){
            if(hs.contains(i-1)){
                continue;
            }else{
                // it is the smallest element so lets find out all of its sequences in set
                curr = 1;
                ans = Math.max(ans, curr); // for only one element case

                while(hs.contains(i+ curr)){
                    ans = Math.max(ans, ++curr);
                }
            }
        }
        // tc o(n)
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(findLongestConseqSubseq(new int[]{1,9,3,10,4,20,2}, 7));
    }
}
