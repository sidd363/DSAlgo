package arrays;


import java.util.HashSet;

/*     You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
   A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

        i < j < k,
        nums[j] - nums[i] == diff, and
        nums[k] - nums[j] == diff.
        Return the number of unique arithmetic triplets.



        Example 1:

        Input: nums = [0,1,4,6,7,10], diff = 3
        Output: 2
        Explanation:
        (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
        (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
        Example 2:

        Input: nums = [4,5,6,7,8,9], diff = 2
        Output: 2
        Explanation:
        (0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
        (1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.
    */
public class ArithmeticTriplets {
    public static int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i :nums){
            hs.add(i);
        }
        for(int i : nums){
            if(hs.contains(i+ diff) && hs.contains(i+(2*diff))){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //int[] nums = {0,1,4,6,7,10};
        //System.out.println(" total triplets -- "+ arithmeticTriplets(nums, 3));
        try {
            int x = 0;
            for(x = 1;x<4; x++);
            System.out.println(x);
        }

        catch(Exception eo){
            System.out.println(" edffdff ");
        }finally {
            System.out.println("errro");
        }

    }
}
